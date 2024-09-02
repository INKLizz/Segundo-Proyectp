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
   
    private static USUARIO enSesion = null ;
    
    public static USUARIO getEnSesion() {
        return enSesion;
    }
    
    public static void setEnSesion(USUARIO user) {
        enSesion = user;
    }
    
    public static void logout() {
        enSesion = null;
    }
}
