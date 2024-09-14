/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Cristina Sabillon
 */
public class users {

    //LLAMMAR VARIABLES
    private USUARIO[] usuarios;

    //CONSTRUCTOR
    public users(int limite) {
        usuarios = new USUARIO[limite];
    }

    //BUSCAR Y AGREGAR USUARIOS
    USUARIO buscar(String usuario) {
        for (USUARIO use : usuarios) {
            if (use != null && use.getUsuario().equals(usuario)) {
                return use;
            }
        }
        return null;
    }

    public boolean agregarUsers(String nombre, String usuario, char genero, int edad, String password) {
        if (buscar(usuario) == null) {
            for (int indice = 0; indice < usuarios.length; indice++) {
                if (usuarios[indice] == null) {
                    usuarios[indice] = new USUARIO(nombre, usuario, genero, edad, password);
                    usuarios[indice].setEnSession(true);
                    return true;
                }
            }
        }
        return false;
    }

    //LOGIN
    public boolean Login(String usuario, String password) {
        USUARIO user = buscar(usuario);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                user.setEnSession(true);
                user.setEstado(true);
                return true;
            }
        }
        return false;
    }

    //VERIFY SESSION
    public String getUsernameInSession() {
        for (USUARIO indice : usuarios) {
            if (indice != null && indice.getEnSession()) {
                return indice.getUsuario();
            }
        }
        return null;
    }

    //DATA RETRIEVE
    public USUARIO getUserInSession() {
        for (USUARIO indice : usuarios) {
            if (indice != null) {
                if (indice.getEnSession()) {
                    return indice;
                }
            }
        }
        return null;
    }

    //FUERA DE SESSION
    public boolean outSession() {
        USUARIO user = getUserInSession();
        if (user != null) {
            user.setEnSession(false);
            return true;
        }
        return false;
    }

    //USUARIOS LIST
    public USUARIO[] getUsuarios() {
        return usuarios;
    }

    public String getTweetsByHashtag(String hashtag) {
        String HastagTweets = "";
        String hashtagSearch = "#" + hashtag.trim();

        for (USUARIO user : usuarios) {
            if (user != null) {
                String[] userTweets = user.getTweets();
                for (int contador = 0; contador < userTweets.length; contador++) {
                    String tweet = userTweets[contador];
                    if (tweet != null && tweet.contains(hashtagSearch)) {
                        HastagTweets += tweet + "-- Usuario: " + user.getUsuario() + "\n";
                    }
                }
            }
        }

        if (HastagTweets.isEmpty()) {
            return "No se encuentra ningún tweet con #" + hashtag;
        }
        return HastagTweets;
    }

    public String getTweetsByMention(String mentionedUser) {
    String MentionedTweets = "";
    String mentionSearch = "@" + mentionedUser.trim();

    for (USUARIO user : usuarios) {
        if (user != null) {
            String[] userTweets = user.getTweets();

            for (int contador = 0; contador < userTweets.length; contador++) {
                String tweet = userTweets[contador];
                if (tweet != null) {
                    String[] words = tweet.split("\\s+");
                    for (String word : words) {
                        if (word.equals(mentionSearch)) {
                            MentionedTweets += tweet + "\n -- Usuario: " + user.getUsuario() + "\n";
                            break; 
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
}
