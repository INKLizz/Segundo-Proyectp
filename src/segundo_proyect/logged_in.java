/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Laura Sabillon
 */
public class logged_in {
   
    private static USUARIO EnSesion = null;
    
    public static USUARIO getEnSesion() {
        return EnSesion;
    }
    
    public static void setEnSesion(USUARIO user) {
        EnSesion = user;
    }
    
    public static void logout() {
        EnSesion = null;
    }
}
