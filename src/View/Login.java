/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


/**
 *
 * @author Goji
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfUsernameL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pfPasswordL = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("or");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, 20));

        tfUsernameL.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfUsernameL.setForeground(new java.awt.Color(242, 242, 242));
        tfUsernameL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfUsernameL.setCaretColor(new java.awt.Color(242, 242, 242));
        tfUsernameL.setOpaque(false);
        tfUsernameL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameLActionPerformed(evt);
            }
        });
        jPanel2.add(tfUsernameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 400, 40));

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 20));

        pfPasswordL.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pfPasswordL.setForeground(new java.awt.Color(242, 242, 242));
        pfPasswordL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        pfPasswordL.setCaretColor(new java.awt.Color(242, 242, 242));
        pfPasswordL.setOpaque(false);
        jPanel2.add(pfPasswordL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 400, 40));

        btnRegister.setBackground(new java.awt.Color(255, 192, 0));
        btnRegister.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setToolTipText("");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 130, 40));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 192, 0));
        jLabel6.setText("LOGIN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 190, 127));
        jLabel7.setText("ProSearch");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 89, 89));
        jLabel5.setText("ProSearch");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 192, 0));
        btnLogin.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("");
        btnLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 130, 40));

        jLabel8.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("PASSWORD");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameLActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        setVisible(false);
        new register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfPasswordL;
    private javax.swing.JTextField tfUsernameL;
    // End of variables declaration//GEN-END:variables
}
