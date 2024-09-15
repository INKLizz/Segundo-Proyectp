/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Laura Sabillon
 */
public class Tweet_Manager {

    private USUARIO[] usuarios;
    private String[] allTweets;
    private String[] tweetOwners;
    private int tweetCount = 0;
    private static Tweet_Manager instance;

    public Tweet_Manager(USUARIO[] usuarios) {
        this.usuarios = usuarios;
        this.allTweets = new String[100];
        this.tweetOwners = new String[200];
    }

    public static Tweet_Manager getInstance(USUARIO[] usuarios) {
        if (instance == null) {
            instance = new Tweet_Manager(usuarios);
        }
        return instance;
    }

    public void addTweet(USUARIO usuario, String tweet) {
        allTweets[tweetCount] = tweet;
        tweetOwners[tweetCount] = usuario.getUsuario();
        tweetCount++;

    }

    public String mostrarTwits(USUARIO loggedUser) {
        String totalTweets = "";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        for (int contador = tweetCount -1; contador >= 0; contador--) {
            USUARIO tweetUser = findUserByUsername(tweetOwners[contador]);

            if (tweetUser != null && tweetUser.getEstado() && (loggedUser.equals(tweetUser) || isFollowing(loggedUser, tweetOwners[contador]))) {
                totalTweets += "Usuario: " + tweetOwners[contador] + "\n"
                        + allTweets[contador] + "\n"
                        + "Fecha de publicacion: " + formatter.format(Calendar.getInstance().getTime()) + "\n"
                        + "---------------------------------------------------------------------------\n";
            }
        }

        return totalTweets;
    }

    private USUARIO findUserByUsername(String username) {
        for (USUARIO user : usuarios) {
            if (user != null && user.getUsuario().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean isFollowing(USUARIO loggedUser, String tweetOwner) {
        USUARIO tweetUser = findUserByUsername(tweetOwner);
        if (tweetUser == null || !tweetUser.getEstado()) {
            return false; 
        }

        for (int i = 0; i < loggedUser.getFollowingCount(); i++) {
            if (loggedUser.getFollowing()[i] != null
                    && loggedUser.getFollowing()[i].getUsuario().equals(tweetUser.getUsuario())) {
                return true; 
            }
        }
        return false; 
    }

    public String getTweetsByHashtag(String hashtag) {
        String HastagTweets = "";
        String hashtagSearch = "#" + hashtag.trim();

        for (USUARIO user : usuarios) {
            if (user != null && user.getEstado()) {
                String[] userTweets = user.getTweets();
                if (userTweets != null) {
                    for (int contador = 0; contador < userTweets.length; contador++) {
                        String tweet = userTweets[contador];
                        if (tweet != null && tweet.contains(hashtagSearch)) {
                            HastagTweets += "Usuario: " + user.getUsuario() + "\n" + tweet + "\n";
                        }
                    }
                }
            }
        }

        if (HastagTweets.isEmpty()) {
            return "No se encuentra ningún tweet con #" + hashtag;
        }
        return HastagTweets;
    }

    public String getMention(String mentionedUser) {
        String MentionedTweets = "";
        String mentionSearch = "@" + mentionedUser.trim();

        for (USUARIO user : usuarios) {
            if (user != null && user.getEstado()) {
                String[] userTweets = user.getTweets();
                if (userTweets != null) {
                    for (int contador = 0; contador < userTweets.length; contador++) {
                        String tweet = userTweets[contador];
                        if (tweet != null) {
                            String[] words = tweet.split("\\s+");
                            for (String word : words) {
                                if (word.equals(mentionSearch)) {
                                    MentionedTweets += "Usuario: " + user.getUsuario() + "\n" + tweet + "\n";
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (MentionedTweets.isEmpty()) {
            return "";
        }
        return MentionedTweets;
    }


    public String[] getOrderedTweets() {
        return allTweets;
    }
}
