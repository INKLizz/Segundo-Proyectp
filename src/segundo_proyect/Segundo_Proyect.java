/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo_proyect;
/**
 *
 * @author Laura Sabillon
 */
public class Segundo_Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        users usuarios = new users(100);        
        LOGin log = new LOGin(usuarios);
        log.setVisible(true);
    }
}
