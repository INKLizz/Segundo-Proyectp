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
    
    // VARIABLES
    private String nombre;
    private String usuario;
    private String password;
    private int edad;
    private char genero;
    private boolean estado;
    private Calendar fecha;
    private boolean enSession;

    
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
    public void setFecha(Calendar fecha) { 
        this.fecha = fecha; 
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
}