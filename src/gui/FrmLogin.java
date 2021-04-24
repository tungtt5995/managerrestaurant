/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DAO_Employee;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JLabel;
import jdbcHelper.ShareHelper;
import model.Employee;

/**
 *
 * @author Admin
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    DAO_Employee daoEm = new DAO_Employee();
    public FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        btnSignIn.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSignIn = new keeptoo.KButton();
        lblSignUp = new javax.swing.JLabel();
        lblRemember = new javax.swing.JLabel();
        lblStt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(193, 101, 221));
        kGradientPanel1.setkStartColor(new java.awt.Color(92, 39, 254));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 78, 22);

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        jPanel1.add(txtUsername);
        txtUsername.setBounds(86, 184, 300, 43);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 74, 22);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        jPanel1.add(txtPassword);
        txtPassword.setBounds(87, 274, 300, 44);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 80, 81, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_48px.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(27, 184, 70, 43);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_password1_48px.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(24, 274, 70, 44);

        btnSignIn.setText("Sign in");
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignIn.setkBorderRadius(50);
        btnSignIn.setkEndColor(new java.awt.Color(0, 0, 204));
        btnSignIn.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        btnSignIn.setkHoverForeGround(new java.awt.Color(0, 0, 153));
        btnSignIn.setkHoverStartColor(new java.awt.Color(255, 102, 255));
        btnSignIn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnSignIn.setkStartColor(new java.awt.Color(255, 102, 255));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn);
        btnSignIn.setBounds(110, 360, 185, 45);

        lblSignUp.setText("If you don't have acount, click here to create acount");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignUpMouseExited(evt);
            }
        });
        jPanel1.add(lblSignUp);
        lblSignUp.setBounds(70, 440, 300, 16);

        lblRemember.setText("Remember password !");
        lblRemember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRememberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRememberMouseExited(evt);
            }
        });
        jPanel1.add(lblRemember);
        lblRemember.setBounds(240, 330, 130, 16);

        lblStt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblStt);
        lblStt.setBounds(70, 416, 290, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel8.setText("VMH RESTAURANT");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_bread_loaf_100px.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_apple_100px.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_broccoli_100px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_food_and_wine_100px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_hamburger_100px.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_mcdonalds_french_fries_100px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(72, 72, 72)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(72, 72, 72)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(55, 55, 55)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel8)
                        .addGap(41, 41, 41)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void lblRememberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRememberMouseEntered
        EnTer(lblRemember);
    }//GEN-LAST:event_lblRememberMouseEntered

    private void lblRememberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRememberMouseExited
        Exit(lblRemember);
    }//GEN-LAST:event_lblRememberMouseExited

    private void lblSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseEntered
        EnTer(lblSignUp);
    }//GEN-LAST:event_lblSignUpMouseEntered

    private void lblSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseExited
        Exit(lblSignUp);
    }//GEN-LAST:event_lblSignUpMouseExited

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        login();
        
    }//GEN-LAST:event_btnSignInActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    public void login(){
        String user = txtUsername.getText();
        String pass = String.valueOf(txtPassword.getPassword());
        try {
            Employee em = daoEm.findById(user);
            if (em != null) {
                String Confpass = String.valueOf(em.getMatKhau());
                if (pass.equalsIgnoreCase(Confpass)) {
                    ShareHelper.USER = em;
                    lblStt.setText("Đăng nhập thành công");
                    new FrmMain().setVisible(true);
                    this.dispose();
                } else {
                    lblStt.setText("Mật khẩu không đúng");
                }
            } else {
                lblStt.setText("Đăng nhập thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void EnTer(JLabel lbl) {
        lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lbl.setForeground(Color.blue);

        Font font = lbl.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl.setFont(font.deriveFont(att));
    }

    public void Exit(JLabel lbl) {
        lbl.setForeground(Color.black);
        Font font = lbl.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
        lbl.setFont(font.deriveFont(att));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnSignIn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblRemember;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblStt;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
