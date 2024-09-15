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
public class USUARIO {

    // VARIABLES
    private String nombre;
    private String usuario;
    private String password;
    private int edad;
    private char genero;
    private boolean estado;
    private Calendar fecha;
    private boolean enSession;
    public USUARIO[] following;
    public USUARIO[] followers;
    private int followingCount;
    private int followersCount;
    private String[] tweets;
    private Calendar[] tweetDates;
    private int posicionTwit;

    // CONSTRUCTOR
    public USUARIO(String nombre, String usuario, char genero, int edad, String password) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.genero = genero;
        this.edad = edad;
        this.password = password;
        this.fecha = Calendar.getInstance();
        this.estado = true;
        this.enSession = false;
        this.following = new USUARIO[100];
        this.followers = new USUARIO[100];
        this.followingCount = 0;
        this.followersCount = 0;
        this.tweets = new String[100];
        this.tweetDates = new Calendar[100];
        posicionTwit = 0;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEnSession() {
        return enSession;
    }

    public void setEnSession(boolean enSession) {
        this.enSession = enSession;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public USUARIO[] getFollowing() {
        return following;
    }

    public USUARIO[] getFollowers() {
        return followers;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int buscarUsuario(String nombreUsuario) {
        for (int contador = 0; contador < followingCount; contador++) {
            if (following[contador].getUsuario().equals(nombreUsuario)) {
                return contador;
            }
        }
        return -1;
    }

    public boolean accionSeguir(USUARIO user) {
        int index = buscarUsuario(user.getUsuario());

        if (index != -1) {
            for (int contador = index; contador < followingCount - 1; contador++) {
                following[contador] = following[contador + 1];
            }
            following[--followingCount] = null;
            user.removeFollower(this);

            return false;
        } else {
            following[followingCount++] = user;
            user.addFollower(this);

            return true;
        }
    }

    public void removeFollower(USUARIO user) {
        int index = -1;
        for (int contador = 0; contador < followersCount; contador++) {
            if (followers[contador].getUsuario().equals(user.getUsuario())) {
                index = contador;
                break;
            }
        }
        if (index != -1) {
            for (int contador = index; contador < followersCount - 1; contador++) {
                followers[contador] = followers[contador + 1];
            }
            followers[--followersCount] = null;
        }
    }

    public void removeFollowing(USUARIO user) {
        int index = -1;
        for (int contador = 0; contador < followingCount; contador++) {
            if (following[contador] != null && following[contador].getUsuario().equals(user.getUsuario())) {
                index = contador;
                break;
            }
        }
        if (index != -1) {
            for (int contador = index; contador < followingCount - 1; contador++) {
                following[contador] = following[contador + 1];
            }
            following[--followingCount] = null;
        }
    }

    public void addFollower(USUARIO user) {
        followers[followersCount++] = user;
    }

    public void agregartwit(String twit) {
        this.tweets[posicionTwit] = twit;
        posicionTwit++;
    }

    public String mostrarTwit() {
        if (posicionTwit == 0) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedTime = formatter.format(fecha.getTime());
        String twits = "";

        for (int contador = posicionTwit - 1; contador >= 0; contador--) {
            twits += "Usuario: " + this.getUsuario() + "\n" + tweets[contador] + "\nfecha de publicacion: " + formattedTime + "\n" + "---------------------------------------------------------------------------" + "\n";
        }

        return twits;
    }

    public String[] getTweets() {
        return tweets;
    }
}
