/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Cristina Sabillon
 */
public class Tweets {
    
    // VARIABLES
    private String contenido;
    private String autor; 
    private Calendar publicado;

    public Tweets(String contenido, users user) {
        this.contenido = contenido;
        this.autor = user.getUsernameInSession(); 
        this.publicado = Calendar.getInstance();        
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor; 
    }

    public String publicarTweet() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedTime = formatter.format(publicado.getTime());
        
        String tweetDetails = "Usuario: " + autor + "\n" + 
                              contenido + "\n" +
                              "Fecha de publicación: " + formattedTime + "\n";
        return tweetDetails; 
    }
    
    public boolean containsMention(users User) {
        String usernameToCheck = "@" + User.getUsernameInSession();
        return contenido.contains(usernameToCheck);
    }
    
    public boolean containsHashtag(String hashtag) {
        String hashtagCheck = "#" + hashtag;
        return contenido.contains(hashtagCheck);
    }    
    
}