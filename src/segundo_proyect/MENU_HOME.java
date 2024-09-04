/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundo_proyect;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Sabillon
 */
public class MENU_HOME extends javax.swing.JFrame {
    
    //LLAMAR VARIABLES
    private users userDatabase;
    private Tweet_Manager tweetManager;
    private Hashtag_Manager hashtagManager;
    
    /**
     * Creates new form MENU_HOME
     */
    
    public MENU_HOME(users userDatabase) {
        this.userDatabase =  userDatabase;  
        this.tweetManager = Tweet_Manager.getInstance(100);     
        this.hashtagManager = new Hashtag_Manager(tweetManager);
        initComponents();
        getContentPane().setBackground(java.awt.Color.WHITE);         
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        twit_show = new javax.swing.JTextArea();
        MENCIONES = new javax.swing.JScrollPane();
        mencion_show = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        texting = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tweet = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hashtag_twit = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        buscar_hashtag = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profile = new javax.swing.JToggleButton();
        cerrar_sesion = new javax.swing.JToggleButton();
        user_tag1 = new javax.swing.JLabel();
        profile_pic = new javax.swing.JLabel();
        user_tag2 = new javax.swing.JLabel();
        user_tag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 32, 32));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        twit_show.setColumns(20);
        twit_show.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        twit_show.setRows(5);
        twit_show.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                twit_showAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(twit_show);

        MENCIONES.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MENCIONESAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        mencion_show.setColumns(20);
        mencion_show.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mencion_show.setRows(5);
        mencion_show.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mencion_showAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        MENCIONES.setViewportView(mencion_show);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Post:");

        texting.setColumns(20);
        texting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texting.setRows(5);
        texting.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textingAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        texting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textingKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(texting);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("MENCIONES: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Tweets: ");

        tweet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tweet.setText("TWEET");
        tweet.setBorder(null);
        tweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tweetActionPerformed(evt);
            }
        });

        hashtag_twit.setColumns(20);
        hashtag_twit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hashtag_twit.setRows(5);
        hashtag_twit.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                hashtag_twitAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(hashtag_twit);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("BUSCAR:  #");

        buscar_hashtag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar_hashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_hashtagActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/segundo_proyect/twitter_logo_principal (1).jpg"))); // NOI18N

        profile.setText("PROFILE");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        cerrar_sesion.setText("CERRAR SESION");
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });

        user_tag1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user_tag1.setText("Following: 0");
        user_tag1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                user_tag1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/segundo_proyect/male_silouette.jpg"))); // NOI18N
        profile_pic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        profile_pic.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                profile_picAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        user_tag2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user_tag2.setText("Followers: 0");
        user_tag2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                user_tag2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        user_tag.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user_tag.setText("@ USUARIO");
        user_tag.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                user_tagAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_pic)
                    .addComponent(user_tag1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_tag2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cerrar_sesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile_pic)
                .addGap(18, 18, 18)
                .addComponent(user_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user_tag2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user_tag1)
                .addGap(18, 18, 18)
                .addComponent(profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrar_sesion)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(210, 210, 210))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tweet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MENCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar_hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tweet)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(MENCIONES))
                .addGap(47, 47, 47))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        PROFILE pf = new PROFILE (this.userDatabase);
        pf.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_profileActionPerformed

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        // TODO add your handling code here:
        boolean logout = userDatabase.outSession();
        
        LOG_in log = new LOG_in(this.userDatabase);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrar_sesionActionPerformed

    private void profile_picAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_profile_picAncestorAdded
        // TODO add your handling code here:
        USUARIO usuario = userDatabase.getUserInSession();
         if (usuario != null) {
             char genero = usuario.getGenero();
             ImageIcon icon = null;

             try {
                 if (genero == 'M') {
                     icon = new ImageIcon(getClass().getResource("/segundo_proyect/male_silouette.jpg"));
                 } else if (genero == 'F') {
                     icon = new ImageIcon(getClass().getResource("/segundo_proyect/female_silouette.jpg"));
                 }

                 if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
                     System.err.println("Error al cargar la imagen: " + icon.getDescription());
                 }
             } catch (Exception e) {
                 System.err.println("Error al cargar la imagen: " + e.getMessage());
             }

             if (icon != null) {
                 profile_pic.setIcon(icon);
             }
         }
    }//GEN-LAST:event_profile_picAncestorAdded

    private void user_tagAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_user_tagAncestorAdded
        // TODO add your handling code here:
        String ensesion = userDatabase.getUsernameInSession();
        user_tag.setText("@"  + ensesion);
    }//GEN-LAST:event_user_tagAncestorAdded

    private void tweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tweetActionPerformed
        // TODO add your handling code here:
        String tweetContent = texting.getText().trim(); 
        if (!tweetContent.isEmpty()) {
            USUARIO loggedUser = userDatabase.getUserInSession();

            if (loggedUser != null) {
                tweetManager.postTweet(tweetContent, userDatabase); 
                JOptionPane.showMessageDialog(null, "Se publicó su tweet!");

                twit_show.setText(tweetManager.getTimeline());
                String mentions = tweetManager.getMentioningUser(userDatabase);

                mencion_show.setText(mentions);                
                texting.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No escribió nada en el tweet.");
        }
    }//GEN-LAST:event_tweetActionPerformed

    private void textingAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textingAncestorAdded
        // TODO add your handling code here:
        USUARIO loggedUser = userDatabase.getUserInSession();
        if (loggedUser != null) {
            String twitShowContent = twit_show.getText();
        } 
    }//GEN-LAST:event_textingAncestorAdded

    private void textingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textingKeyPressed
        // TODO add your handling code here:
        String caracter = texting.getText();
        if (caracter.length() > 139) {
            texting.setEditable(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            texting.setEditable(true);
        }                  
    }//GEN-LAST:event_textingKeyPressed

    private void buscar_hashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_hashtagActionPerformed
        // TODO add your handling code here:
        String hashtag = buscar_hashtag.getText().trim();

        if (!hashtag.isEmpty()) {
            String results = hashtagManager.getTweetsByHashtag(hashtag);

            if (results.isEmpty()) {
                hashtag_twit.setText("No se encuentra ningun tweet con #" + hashtag);
            } else {
                hashtag_twit.setText(results);
            }
        } else {
            hashtag_twit.setText("No se ingreso ningun hashtag.");
        }     
    }//GEN-LAST:event_buscar_hashtagActionPerformed

    private void user_tag1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_user_tag1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_user_tag1AncestorAdded

    private void user_tag2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_user_tag2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_user_tag2AncestorAdded

    private void twit_showAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_twit_showAncestorAdded
        // TODO add your handling code here:
        twit_show.setEditable(false);
        twit_show.setText(tweetManager.getTimeline());
    }//GEN-LAST:event_twit_showAncestorAdded

    private void MENCIONESAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MENCIONESAncestorAdded
        // TODO add your handling code here:   
    }//GEN-LAST:event_MENCIONESAncestorAdded

    private void mencion_showAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mencion_showAncestorAdded
        // TODO add your handling code here:
        mencion_show.setEditable(false);
        users loggedUser = userDatabase;        
        String mentions = tweetManager.getMentioningUser(loggedUser);
        mencion_show.setText(mentions);         
    }//GEN-LAST:event_mencion_showAncestorAdded

    private void hashtag_twitAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_hashtag_twitAncestorAdded
        // TODO add your handling code here:
        hashtag_twit.setEditable(false);
    }//GEN-LAST:event_hashtag_twitAncestorAdded
        
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
            java.util.logging.Logger.getLogger(MENU_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        users userDatabase = new users(100);        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_HOME(userDatabase).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MENCIONES;
    private javax.swing.JTextField buscar_hashtag;
    private javax.swing.JToggleButton cerrar_sesion;
    private javax.swing.JTextArea hashtag_twit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea mencion_show;
    private javax.swing.JToggleButton profile;
    private javax.swing.JLabel profile_pic;
    private javax.swing.JTextArea texting;
    private javax.swing.JToggleButton tweet;
    private javax.swing.JTextArea twit_show;
    private javax.swing.JLabel user_tag;
    private javax.swing.JLabel user_tag1;
    private javax.swing.JLabel user_tag2;
    // End of variables declaration//GEN-END:variables
    
}
