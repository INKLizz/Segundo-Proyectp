/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_proyect;

/**
 *
 * @author Cristina Sabillon
 */
public class users {

    //LLAMMAR VARIABLES
    private USUARIO[] usuarios;

    //CONSTRUCTOR
    public users(int limite) {
        usuarios = new USUARIO[limite];
    }

    //BUSCAR Y AGREGAR USUARIOS
    USUARIO buscar(String usuario) {
        for (USUARIO user : usuarios) {
            if (user != null && user.getUsuario().equals(usuario)) {
                return user;
            }
        }
        return null;
    }

    public boolean agregarUsers(String nombre, String usuario, char genero, int edad, String password) {
        if (buscar(usuario) == null) {
            for (int indice = 0; indice < usuarios.length; indice++) {
                if (usuarios[indice] == null) {
                    usuarios[indice] = new USUARIO(nombre, usuario, genero, edad, password);
                    usuarios[indice].setEnSession(true);
                    return true;
                }
            }
        }
        return false;
    }

    //LOGIN
    public boolean Login(String usuario, String password) {
        USUARIO user = buscar(usuario);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                user.setEnSession(true);
                user.setEstado(true);
                return true;
            }
        }
        return false;
    }

    //VERIFY SESSION
    public String getUsernameInSession() {
        for (USUARIO indice : usuarios) {
            if (indice != null && indice.getEnSession()) {
                return indice.getUsuario();
            }
        }
        return null;
    }

    public USUARIO getUserInSession() {
        for (USUARIO indice : usuarios) {
            if (indice != null) {
                if (indice.getEnSession()) {
                    return indice;
                }
            }
        }
        return null;
    }

    //USUARIOS LIST
    public USUARIO[] getUsuarios() {
        return usuarios;
    }
    
}
