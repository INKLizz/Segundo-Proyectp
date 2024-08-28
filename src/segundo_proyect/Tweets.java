/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;
import java.util.Calendar;
/**
 *
 * @author Laura Sabillon
 */
public class Tweets {
    
    // VARIABLES
    private String twit;
    private USUARIO user;
    private Calendar publicado;

    // CONSTRUCTOR
    public Tweets(String twit, USUARIO user) {
        this.twit = twit;
        this.user = user;
        this.publicado = Calendar.getInstance();
    }

    // GETTERS
    public String getContenido() {
        return twit;
    }

    public USUARIO getUser() {
        return user;
    }

    public Calendar getFechaPublicada() {
        return publicado;
    }

    // SETTERS
    public void setContenido(String twit) {
        this.twit = twit;
    }

    public void setUser(USUARIO user) {
        this.user = user;
    }

    public void setFechaPublicada(Calendar publicado) {
        this.publicado = publicado;
    }

    //PUBLICAR
    public void publicarTweet() {
            System.out.println("Autor: " + user.getUsuario());
            System.out.println(twit);
            System.out.println("Fecha de publicacion: " + publicado.getTime());
    }
}