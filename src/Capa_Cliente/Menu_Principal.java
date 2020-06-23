/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import Capa_Negocio.clsAdministrador;
import Capa_Negocio.clsDocente;
import Capa_Negocio.clsEstudiante;
import diu.swe.habib.JPanelSlider.JPanelSlider;
import javax.swing.SwingUtilities;

/**
 *
 * @author holce
 */
public class Menu_Principal extends javax.swing.JFrame {

    clsEstudiante objEstudiante = new clsEstudiante();
    clsDocente objDocente = new clsDocente();
    clsAdministrador objAdministrador = new clsAdministrador();
    Byte numIntentos = 0;
    public String usuario_e = "";
    public String usuario_d = "";
    public String usuario_a = "";

    public Menu_Principal() {
        initComponents();
        btnslide1.setLocation(10, 280);
        transparencia();
        this.setLocationRelativeTo(null);
    }

    public void transparencia() {

        btnsn.setOpaque(false);
        btnsn.setContentAreaFilled(false);
        btnsn.setBorderPainted(false);
        btnin.setOpaque(false);
        btnin.setContentAreaFilled(false);
        btnin.setBorderPainted(false);
        btnay.setOpaque(false);
        btnay.setContentAreaFilled(false);
        btnay.setBorderPainted(false);
        btnslide1.setOpaque(false);
        btnslide1.setContentAreaFilled(false);
        btnslide1.setBorderPainted(false);
        btnlogo.setOpaque(false);
        btnlogo.setContentAreaFilled(false);
        btnlogo.setBorderPainted(false);
        btnLeft.setOpaque(false);
        btnLeft.setContentAreaFilled(false);
        btnLeft.setBorderPainted(false);
        btnRight.setOpaque(false);
        btnRight.setContentAreaFilled(false);
        btnRight.setBorderPainted(false);
        btnRecordarContraseña.setOpaque(false);
        btnRecordarContraseña.setContentAreaFilled(false);
        btnRecordarContraseña.setBorderPainted(false);
        btnRegistrar.setOpaque(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
        jPanel5.setOpaque(false);
        jPanel5.setBorder(null);
        jPanelSlider1.setOpaque(false);
        jPanelSlider1.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnminimize = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnsn = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        btnay = new javax.swing.JButton();
        btnlogo = new javax.swing.JButton();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel5 = new javax.swing.JPanel();
        btnslide2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnslide1 = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRecordarContraseña = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jPanelSlider2 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        Slider1 = new javax.swing.JPanel();
        btnLeft = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Slider2 = new javax.swing.JPanel();
        btnRight = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Exámenes Virtuales");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1426, 661));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 610, 1420, 50);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón_minimizar.png"))); // NOI18N
        btnminimize.setBorder(null);
        btnminimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizeActionPerformed(evt);
            }
        });
        jPanel3.add(btnminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 10, -1, -1));

        btnsn.setBackground(new java.awt.Color(255, 153, 0));
        btnsn.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnsn.setForeground(new java.awt.Color(255, 255, 255));
        btnsn.setText("SOBRE NOSOTROS");
        btnsn.setBorder(null);
        btnsn.setBorderPainted(false);
        btnsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsnActionPerformed(evt);
            }
        });
        jPanel3.add(btnsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 11, -1, 28));

        btnin.setBackground(new java.awt.Color(255, 153, 0));
        btnin.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnin.setForeground(new java.awt.Color(255, 255, 255));
        btnin.setText("INFORMACIÓN");
        btnin.setBorder(null);
        btnin.setBorderPainted(false);
        jPanel3.add(btnin, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 11, -1, 28));

        btnay.setBackground(new java.awt.Color(255, 153, 0));
        btnay.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        btnay.setForeground(new java.awt.Color(255, 255, 255));
        btnay.setText("AYUDA");
        btnay.setBorder(null);
        btnay.setBorderPainted(false);
        jPanel3.add(btnay, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 11, -1, 28));

        btnlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_botón_Refrescar.png"))); // NOI18N
        btnlogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoActionPerformed(evt);
            }
        });
        jPanel3.add(btnlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 0, 1420, 50);

        jPanelSlider1.setOpaque(false);

        jPanel5.setOpaque(false);

        btnslide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón_Slider2.png"))); // NOI18N
        btnslide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnslide2MouseClicked(evt);
            }
        });
        btnslide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnslide2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnslide2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnslide2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jPanelSlider1.add(jPanel5, "card3");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Login_pequeño.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setText("Username:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        btnslide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón_Slider2.png"))); // NOI18N
        btnslide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnslide1MouseClicked(evt);
            }
        });
        btnslide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnslide1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnslide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 50));
        jPanel4.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, -1));

        jLabel3.setText("Password:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        jPanel4.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 110, -1));

        btnLogin.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 90, -1));

        jLabel4.setText("¿No recuerdas tu contraseña?");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        btnRecordarContraseña.setForeground(new java.awt.Color(0, 102, 255));
        btnRecordarContraseña.setText("Ingresa Aquí");
        btnRecordarContraseña.setBorder(null);
        btnRecordarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordarContraseñaActionPerformed(evt);
            }
        });
        jPanel4.add(btnRecordarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, 20));

        jLabel5.setText("¿Aún no estás registrado?");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnRegistrar.setForeground(new java.awt.Color(0, 102, 255));
        btnRegistrar.setText("Registrate");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, 20));

        jPanelSlider1.add(jPanel4, "card2");

        jPanel1.add(jPanelSlider1);
        jPanelSlider1.setBounds(10, 120, 320, 400);

        Slider1.setLayout(null);

        btnLeft.setBackground(new java.awt.Color(51, 51, 255));
        btnLeft.setForeground(new java.awt.Color(102, 255, 255));
        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón_Izquierda_Slider.png"))); // NOI18N
        btnLeft.setBorder(null);
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        Slider1.add(btnLeft);
        btnLeft.setBounds(10, 170, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Slider1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        Slider1.add(jLabel6);
        jLabel6.setBounds(0, 0, 830, 390);

        jPanelSlider2.add(Slider1, "card3");

        Slider2.setLayout(null);

        btnRight.setBackground(new java.awt.Color(51, 51, 255));
        btnRight.setForeground(new java.awt.Color(102, 255, 255));
        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón_Derecha_Slider.png"))); // NOI18N
        btnRight.setBorder(null);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        Slider2.add(btnRight);
        btnRight.setBounds(770, 170, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Slider2.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        Slider2.add(jLabel8);
        jLabel8.setBounds(0, 0, 830, 390);

        jPanelSlider2.add(Slider2, "card2");

        jPanel1.add(jPanelSlider2);
        jPanelSlider2.setBounds(470, 130, 830, 390);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(7, 0, 1420, 702);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsnActionPerformed

    }//GEN-LAST:event_btnsnActionPerformed

    private void btnlogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoActionPerformed


    }//GEN-LAST:event_btnlogoActionPerformed

    private void btnminimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizeActionPerformed

        setState(Menu_Principal.ICONIFIED);

    }//GEN-LAST:event_btnminimizeActionPerformed

    private void btnslide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnslide1MouseClicked


    }//GEN-LAST:event_btnslide1MouseClicked

    private void btnslide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnslide1ActionPerformed

        jPanelSlider1.nextPanel(40, jPanel5, jPanelSlider1.left);

    }//GEN-LAST:event_btnslide1ActionPerformed

    private void btnslide2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnslide2MouseClicked

        AnimationClass slide = new AnimationClass();
        slide.jButtonXRight(10, 325, 57, 10, btnslide1);
    }//GEN-LAST:event_btnslide2MouseClicked

    private void btnslide2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnslide2ActionPerformed
        jPanelSlider1.nextPanel(40, jPanel4, jPanelSlider1.right);
    }//GEN-LAST:event_btnslide2ActionPerformed

    private void btnRecordarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordarContraseñaActionPerformed

    }//GEN-LAST:event_btnRecordarContraseñaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        Tipo_Register obj = new Tipo_Register(null, true);
        obj.setVisible(true);

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed

        jPanelSlider2.nextPanel(40, Slider2, jPanelSlider2.left);

    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed

        jPanelSlider2.nextPanel(40, Slider1, jPanelSlider2.right);

    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            if (objEstudiante.validarEstado(txtUsuario.getText())){
                // el usuario esta vigente
                usuario_e = objEstudiante.login(txtUsuario.getText(), Password.getText());
                if (usuario_e.equals("")) {
                    JOptionPane.showMessageDialog(null, "Acceso incorrecto, intente nuevamente!!");
                    numIntentos++;
                    if (numIntentos >= 3) {
                        JOptionPane.showMessageDialog(null, "Superó los tres intentos. El sistema se cerrará");
                        System.exit(0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, usuario_e + ", Bienvenido al Sistema!");
                    this.dispose();
                    MenuPrincipal_Estudiante obj = new MenuPrincipal_Estudiante(null, true);
                    obj.setVisible(true);
                }
            } else {
                if (objDocente.validarEstado(txtUsuario.getText())) {
                    // el usuario esta vigente
                    usuario_d = objDocente.login(txtUsuario.getText(), Password.getText());
                    if (usuario_d.equals("")) {
                        JOptionPane.showMessageDialog(null, "Acceso incorrecto, intente nuevamente!!");
                        numIntentos++;
                        if (numIntentos >= 3) {
                            JOptionPane.showMessageDialog(null, "Superó los tres intentos. El sistema se cerrará");
                            System.exit(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, usuario_d + ", Bienvenido al Sistema!");
                        this.dispose();
                        MenuPrincipal_Docentex obj = new MenuPrincipal_Docentex(null, true);
                        obj.setVisible(true);
                    }
                } else {
                    usuario_a = objAdministrador.login(txtUsuario.getText(), Password.getText());
                    if (usuario_a.equals("")) {
                        JOptionPane.showMessageDialog(null, "Acceso incorrecto, intente nuevamente!!");
                        numIntentos++;
                        if (numIntentos >= 3) {
                            JOptionPane.showMessageDialog(null, "Superó los tres intentos. El sistema se cerrará");
                            System.exit(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, usuario_a + ", Bienvenido al Sistema!");
                        this.dispose();
                        MenuPrincipal_Administradorx obj = new MenuPrincipal_Administradorx(null, true);
                        obj.setVisible(true);
                    }
                    JOptionPane.showMessageDialog(null, "Docente no está vigente!");
                    System.exit(0);
                }

            }
            JOptionPane.showMessageDialog(null, "Estudiante no está vigente!");
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Slider1;
    private javax.swing.JPanel Slider2;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRecordarContraseña;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnay;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnlogo;
    private javax.swing.JButton btnminimize;
    private javax.swing.JButton btnslide1;
    private javax.swing.JButton btnslide2;
    private javax.swing.JButton btnsn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}