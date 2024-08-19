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
public class USUARIO {
    
    //VARIABLES
    private String usuario;
    private String password;
    private int edad;
    private char genero;
    private boolean estado;
    private Calendar fecha;
    
    //CONSTRUCTOR
    public USUARIO(String usuario, char genero, int edad, String password) {
        this.usuario = usuario;
        this.genero = genero;
        this.edad = edad;
        this.password = password;
        this.fecha = Calendar.getInstance();        
        this.estado = true;
    }
    
    //GETTERS
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
    
    public boolean isEstado() {
        return estado;
    }

    //SETTERS
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}