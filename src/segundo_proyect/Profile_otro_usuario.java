/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundo_proyect;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Laura Sabillon
 */
public class Profile_otro_usuario extends javax.swing.JFrame {
    private USUARIO[] usuarios;    
    private users userDatabase;
    private String selectedUsername;
    private Tweet_Manager tweetManager;
    
    /**
     * Creates new form Profile_otro_usuario
     */
    public Profile_otro_usuario(users userDatabase, String selectedUsername) {
        initComponents();
        this.tweetManager = Tweet_Manager.getInstance(100);             
        this.userDatabase = userDatabase;
        this.selectedUsername = selectedUsername;
        this.usuarios = userDatabase.getUsuarios();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        folowers = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        perfil = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        following = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        RETURN = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweets_Ousuario = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jToggleButton14 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        folowers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        folowers.setText("Followers: ");
        getContentPane().add(folowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 100, 26));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 860, 40));

        perfil.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/segundo_proyect/male_silouette.jpg"))); // NOI18N
        perfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        perfil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                perfilAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 128, 100, -1));

        edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edad.setText("Edad:");
        edad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                edadAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 26));

        genero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genero.setText("Genero:");
        genero.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                generoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 26));

        following.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        following.setText("Following");
        getContentPane().add(following, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 100, 26));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setText("Nombre: ");
        nombre.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nombreAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 26));

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha.setText("Fecha de union: ");
        fecha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fechaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 270, 26));

        RETURN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RETURN.setText("GO BACK");
        RETURN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETURNActionPerformed(evt);
            }
        });
        getContentPane().add(RETURN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 260, -1));

        tweets_Ousuario.setColumns(20);
        tweets_Ousuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tweets_Ousuario.setRows(5);
        tweets_Ousuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tweets_OusuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tweets_Ousuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 720, 260));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/segundo_proyect/background_pf.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 870, 220));

        jToggleButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton14.setText("FOLLOW/ UNFOLLOW");
        getContentPane().add(jToggleButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 230, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tweets:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usuario.setText("Usuario:  @");
        usuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                usuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 230, 26));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void RETURNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETURNActionPerformed
        // TODO add your handling code here:
        PROFILE PF = new PROFILE(userDatabase);
        PF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RETURNActionPerformed

    private void usuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_usuarioAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername); 
                        
            if (user != null){
                String username = user.getUsuario();
                usuario.setText("Usuario: @" + username);
            } else {
                usuario.setText("Usuario: @NoN");
                }            
            }
    }//GEN-LAST:event_usuarioAncestorAdded

    private void edadAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_edadAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername); 
        
            if (user != null){
            int age = user.getEdad();
            edad.setText("Edad: " + String.valueOf(age));            
            }
        }
        
    }//GEN-LAST:event_edadAncestorAdded

    private void generoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_generoAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername);  
            if (user != null) {
                char gender = user.getGenero();
                genero.setText("Genero: " + String.valueOf(gender));
            } else {
                genero.setText("Genero: NoN");
            }                  
        }       
    }//GEN-LAST:event_generoAncestorAdded

    private void fechaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fechaAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername);         
            if (user != null) {
                Calendar date = user.getFecha();
                if (date != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    String fechaString = dateFormat.format(date.getTime());
                    fecha.setText("Fecha: " + fechaString);
                }
            } else {
                fecha.setText("Fecha: NoN");
            }        
        }
    }//GEN-LAST:event_fechaAncestorAdded

    private void perfilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_perfilAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername);         
        
         if (user != null) {
             char gender = user.getGenero();
             ImageIcon icon = null;

             try {
                 if (gender == 'M') {
                     icon = new ImageIcon(getClass().getResource("/segundo_proyect/male_silouette.jpg"));
                 } else if (gender == 'F') {
                     icon = new ImageIcon(getClass().getResource("/segundo_proyect/female_silouette.jpg"));
                 }

                 if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
                     System.err.println("Error al cargar la imagen: " + icon.getDescription());
                 }
             } catch (Exception e) {
                 System.err.println("Error al cargar la imagen: " + e.getMessage());
             }

             if (icon != null) {
                 perfil.setIcon(icon);
             }
         }        
        }        
    }//GEN-LAST:event_perfilAncestorAdded

    private void nombreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nombreAncestorAdded
        // TODO add your handling code here:
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername);    
            
        if (user != null) {
                   String username = user.getNombre();
                   nombre.setText("Nombre: " + username);
               } else {
                   nombre.setText("Nombre: NoN");
               }       
        }
    }//GEN-LAST:event_nombreAncestorAdded

    private void tweets_OusuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tweets_OusuarioAncestorAdded
        // TODO add your handling code here:
        tweets_Ousuario.setEditable(false);
        
        if (userDatabase != null && selectedUsername != null) {
            USUARIO user = userDatabase.buscar(selectedUsername); 
            
         if (user != null) {
             String timeline = tweetManager.TimelineUserOther(user);

             tweets_Ousuario.setText(timeline);
         } else {
             tweets_Ousuario.setText("No hay usuario conectado.");
            }        
        }
    }//GEN-LAST:event_tweets_OusuarioAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile_otro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile_otro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile_otro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile_otro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        users userDatabase = new users(100);
        String selectedUser = "";
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile_otro_usuario(userDatabase , selectedUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton RETURN;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel following;
    private javax.swing.JLabel folowers;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel perfil;
    private javax.swing.JTextArea tweets_Ousuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
