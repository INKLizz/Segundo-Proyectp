/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

import java.util.Calendar;

/**
 *
 * @author Cristina Sabillon
 */
public class USUARIO {

    // VARIABLES
    private users userDatabase;
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
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public boolean isEstado() {
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
            user.setFollowersCount(user.getFollowersCount() - 1);
            return false;
        } else {
            if (followingCount < following.length) {
                following[followingCount++] = user;
                user.setFollowersCount(user.getFollowersCount() + 1);
                return true;
            } else {
                return false;
            }
        }
    }
}
