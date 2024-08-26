/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Laura Sabillon
 */
public class users {
    
    private USUARIO usuarios [];    
    
    public users (int limite){
        usuarios = new USUARIO[limite];
    }
    
    USUARIO buscar(String usuario) {
        for (USUARIO use : usuarios) {
            if (use != null && use.getUsuario().equals(usuario)) {
                return use;
            }
        }
        return null;
    }
    
    public boolean agregarUsers(String usuario, char genero, int edad, String password){
        if (buscar(usuario) == null){
            for (int indice = 0; indice < usuarios.length ; indice++){
                if (usuarios[indice] == null){

                    usuarios [indice] = new USUARIO (usuario, genero, edad, password);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean login(String usuario, String password) {
        USUARIO user = buscar(usuario);
        if (user != null && user.getPassword().equals(password)) {
            logged_in.setEnSesion(user);
            return true;
        } else {
            return false;
        }
    }
}