/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazmenu1;

/**
 *
 * @author Lenovo
 */
import AppPackage.AnimationClass;

public class FrmPrincipal extends javax.swing.JFrame {

    private AnimationClass internet;
    private AnimationClass internett;
    private AnimationClass calculadora;
    private AnimationClass calculadoraa;
    private AnimationClass Musica;
    private AnimationClass Musicaa;
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        pnlLogin = new javax.swing.JPanel();
        lblPasword = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpPasword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jblCalculator = new javax.swing.JLabel();
        jblMusica = new javax.swing.JLabel();
        jlbInternet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblConfiguraciones = new javax.swing.JLabel();
        lblCalendar = new javax.swing.JLabel();
        lblCronograma = new javax.swing.JLabel();
        lblDrive = new javax.swing.JLabel();
        lblIdea = new javax.swing.JLabel();
        lblServicios = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz de Menu Genericore");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlLogin.setForeground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasword.setBackground(new java.awt.Color(238, 112, 82));
        lblPasword.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblPasword.setForeground(new java.awt.Color(238, 112, 82));
        lblPasword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPasword.setText("Pasword:");
        pnlLogin.add(lblPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 100, 30));

        lblUser.setBackground(new java.awt.Color(238, 112, 82));
        lblUser.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(238, 112, 82));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setText("User:");
        pnlLogin.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_96px_2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 90));
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 140));

        txtUser.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("Ingrese su Usuario");
        txtUser.setBorder(null);
        pnlLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 270, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 320, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_customer_32px_1.png"))); // NOI18N
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Key_32px.png"))); // NOI18N
        pnlLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Menu_32px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        pnlLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jpPasword.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jpPasword.setForeground(new java.awt.Color(153, 153, 153));
        jpPasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpPasword.setText("jPasswordField1");
        jpPasword.setBorder(null);
        jpPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpPaswordActionPerformed(evt);
            }
        });
        pnlLogin.add(jpPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 290, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_ON.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        pnlLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 680, 150, 50));

        jblCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        pnlLogin.add(jblCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 140, 30, 40));

        jblMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Musical_Notes_32px.png"))); // NOI18N
        pnlLogin.add(jblMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 190, -1, 30));

        jlbInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Globe_32px.png"))); // NOI18N
        pnlLogin.add(jlbInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 30, 40));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 430, 810));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 1140, 70));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Clock_96px.png"))); // NOI18N
        pnlMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 290, 210));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Idea_96px.png"))); // NOI18N
        pnlMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 290, 210));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Maintenance_96px.png"))); // NOI18N
        pnlMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 290, 210));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Today_96px.png"))); // NOI18N
        pnlMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 290, 210));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Google_Drive_96px.png"))); // NOI18N
        pnlMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 290, 210));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Handshake_96px.png"))); // NOI18N
        pnlMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 290, 210));

        lblConfiguraciones.setBackground(new java.awt.Color(255, 255, 255));
        lblConfiguraciones.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblConfiguraciones.setForeground(new java.awt.Color(255, 95, 71));
        lblConfiguraciones.setText("Configuraciones");
        pnlMenu.add(lblConfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        lblCalendar.setBackground(new java.awt.Color(255, 255, 255));
        lblCalendar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblCalendar.setForeground(new java.awt.Color(255, 95, 71));
        lblCalendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalendar.setText("Calendario");
        pnlMenu.add(lblCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 223, 110, 30));

        lblCronograma.setBackground(new java.awt.Color(255, 255, 255));
        lblCronograma.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblCronograma.setForeground(new java.awt.Color(255, 95, 71));
        lblCronograma.setText("Cronograma");
        pnlMenu.add(lblCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, -1));

        lblDrive.setBackground(new java.awt.Color(255, 255, 255));
        lblDrive.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblDrive.setForeground(new java.awt.Color(255, 95, 71));
        lblDrive.setText("Almacenamineto");
        pnlMenu.add(lblDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        lblIdea.setBackground(new java.awt.Color(255, 255, 255));
        lblIdea.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblIdea.setForeground(new java.awt.Color(255, 95, 71));
        lblIdea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdea.setText("Ideas");
        pnlMenu.add(lblIdea, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 100, -1));

        lblServicios.setBackground(new java.awt.Color(255, 255, 255));
        lblServicios.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblServicios.setForeground(new java.awt.Color(255, 95, 71));
        lblServicios.setText("Servico al Cliente");
        pnlMenu.add(lblServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_32px_2.png"))); // NOI18N
        pnlMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 40));

        jTextField1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("...Buscar..");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 310, 40));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 1140, 710));

        setSize(new java.awt.Dimension(1571, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPaswordActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        internet = new AnimationClass();
        internet.jLabelXRight(-30, 20, 10, 5, jlbInternet);
        
        //<---------------------------------------->
        
        internett = new AnimationClass();
        internett.jLabelXLeft(20, -30, 10, 5, jlbInternet);
        
        //<---------------------------------------->
        
        calculadora = new AnimationClass();
        calculadora.jLabelXRight(-30, 20, 10, 5, jblCalculator);
        
        //<---------------------------------------->
        
        calculadoraa = new AnimationClass();
        calculadoraa.jLabelXLeft(20, -30, 10, 5, jblCalculator);
        
        //<---------------------------------------->
        
        Musica = new AnimationClass();
        Musica.jLabelXRight(-30, 20, 10, 5, jblMusica);
        
        //<---------------------------------------->
        
        Musicaa = new AnimationClass();
        Musicaa.jLabelXLeft(20, -30, 10, 5, jblMusica);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jblCalculator;
    private javax.swing.JLabel jblMusica;
    private javax.swing.JLabel jlbInternet;
    private javax.swing.JPasswordField jpPasword;
    private javax.swing.JLabel lblCalendar;
    private javax.swing.JLabel lblConfiguraciones;
    private javax.swing.JLabel lblCronograma;
    private javax.swing.JLabel lblDrive;
    private javax.swing.JLabel lblIdea;
    private javax.swing.JLabel lblPasword;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

