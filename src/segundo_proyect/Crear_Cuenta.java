/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundo_proyect;
import javax.swing.JOptionPane;
/**
 *
 * @author Laura Sabillon
 */
public class Crear_Cuenta extends javax.swing.JFrame {
    
    private users usuarios;
    /**
     * Creates new form crear
     */
    public Crear_Cuenta(users usuario) {
        this.usuarios = usuario;
        initComponents();
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MUJER_HOMBRE = new javax.swing.ButtonGroup();
        enter = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        hombre = new javax.swing.JRadioButton();
        contra = new javax.swing.JPasswordField();
        mujer = new javax.swing.JRadioButton();
        confirmar = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        showpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 31, 31));

        enter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Edad: ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sign in to Twitter");

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        MUJER_HOMBRE.add(hombre);
        hombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hombre.setText("Hombre");
        hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreActionPerformed(evt);
            }
        });

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });

        MUJER_HOMBRE.add(mujer);
        mujer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mujer.setText("Mujer");
        mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujerActionPerformed(evt);
            }
        });

        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Usuario: ");

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Genero: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Confirmar Contraseña:");

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        showpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showpass)
                            .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(mujer, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(154, 154, 154)
                                .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hombre)
                    .addComponent(mujer))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showpass)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:

        //OBTENER EDAD VALIDA
        String edadText = edad.getText();
        int age = 0;
        try {
            age = Integer.parseInt(edadText);
            if (age <= 0) {
                JOptionPane.showMessageDialog(null, "Edad no puede ser menor o igual a cero.");
                edad.setText("");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Favor ingresar una edad válida.");
            edad.setText("");
            return;
        }

        //FALTA DE USUARIO (Y/O) CONTRASEÑA (NO COINCIDE)
        String username = user.getText();
        String contraseña = new String(contra.getPassword());
        String confirmarContraseña = new String(confirmar.getPassword());

        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario.");
            return; 
        } else if (contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña.");
            return; 
        } else if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(null, "Contraseñas no coinciden.");
            return;
        }

        //  GENERO
        char genero = ' ';
        if (mujer.isSelected()) {
            genero = 'F';
        } else if (hombre.isSelected()) {
            genero = 'M';
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un genero.");
            return;
        }

        //AGREGAR USUARIO / ERROR
        if (usuarios.agregarUsers(username , genero, age, contraseña)) {
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");            
            MENU_HOME menu = new MENU_HOME();
            menu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el usuario. El nombre de usuario ya existe.");
            
            //RESET
            user.setText("");
            contra.setText("");
            confirmar.setText("");
            edad.setText("");
            MUJER_HOMBRE.clearSelection();            
        }
    }//GEN-LAST:event_enterActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hombreActionPerformed

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        LOGin log = new LOGin(usuarios);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
        if (showpass.isSelected()){
            confirmar.setEchoChar((char)0);
            contra.setEchoChar((char)0);
        }else{
            confirmar.setEchoChar('*');   
            contra.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mujerActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        users usuario = new users(100);        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Cuenta(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MUJER_HOMBRE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextField edad;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
