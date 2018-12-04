/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Goji
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public register() {
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
        tfNameRegister = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pfPassRegister = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfAddressRegister = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dcBirthDay = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        tfUsernameRegister = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfEmailRegister = new javax.swing.JTextField();
        cbLastEduc = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tfSkillRegister = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfNameRegister.setBackground(new java.awt.Color(38, 38, 38));
        tfNameRegister.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfNameRegister.setForeground(new java.awt.Color(242, 242, 242));
        tfNameRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfNameRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        tfNameRegister.setOpaque(false);
        tfNameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tfNameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 400, 40));

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("DATE OF BIRTH");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, 20));

        pfPassRegister.setBackground(new java.awt.Color(38, 38, 38));
        pfPassRegister.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pfPassRegister.setForeground(new java.awt.Color(242, 242, 242));
        pfPassRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        pfPassRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        pfPassRegister.setOpaque(false);
        jPanel2.add(pfPassRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 400, 40));

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
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, 130, 40));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 192, 0));
        jLabel6.setText("REGISTER");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 190, 127));
        jLabel7.setText("ProSearch");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 89, 89));
        jLabel5.setText("ProSearch");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("PASSWORD");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 20));

        tfAddressRegister.setBackground(new java.awt.Color(38, 38, 38));
        tfAddressRegister.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfAddressRegister.setForeground(new java.awt.Color(242, 242, 242));
        tfAddressRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfAddressRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        tfAddressRegister.setOpaque(false);
        tfAddressRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tfAddressRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 400, 40));

        jLabel9.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("ADDRESS");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, 20));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("NAME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 20));

        dcBirthDay.setDateFormatString("dd/MM/yyyy");
        dcBirthDay.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        jPanel2.add(dcBirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 220, 30));

        jLabel11.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("USERNAME");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 20));

        tfUsernameRegister.setBackground(new java.awt.Color(38, 38, 38));
        tfUsernameRegister.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfUsernameRegister.setForeground(new java.awt.Color(242, 242, 242));
        tfUsernameRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfUsernameRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        tfUsernameRegister.setOpaque(false);
        tfUsernameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tfUsernameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 400, 40));

        jLabel12.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("PHONE NUMBER");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, 20));

        tfPhoneNumber.setBackground(new java.awt.Color(38, 38, 38));
        tfPhoneNumber.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfPhoneNumber.setForeground(new java.awt.Color(242, 242, 242));
        tfPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfPhoneNumber.setCaretColor(new java.awt.Color(242, 242, 242));
        tfPhoneNumber.setOpaque(false);
        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });
        jPanel2.add(tfPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 400, 40));

        jLabel13.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Last Education");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, 20));

        jLabel14.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("E-MAIL");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, 20));

        tfEmailRegister.setBackground(new java.awt.Color(38, 38, 38));
        tfEmailRegister.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfEmailRegister.setForeground(new java.awt.Color(242, 242, 242));
        tfEmailRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfEmailRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        tfEmailRegister.setOpaque(false);
        tfEmailRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tfEmailRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 400, 40));

        cbLastEduc.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        cbLastEduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "SMK", "D3", "S1", "S2", "S3" }));
        cbLastEduc.setOpaque(false);
        jPanel2.add(cbLastEduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 130, 30));

        jLabel15.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("SKILL");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, 20));

        tfSkillRegister.setBackground(new java.awt.Color(38, 38, 38));
        tfSkillRegister.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfSkillRegister.setForeground(new java.awt.Color(242, 242, 242));
        tfSkillRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfSkillRegister.setCaretColor(new java.awt.Color(242, 242, 242));
        tfSkillRegister.setOpaque(false);
        tfSkillRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSkillRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tfSkillRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 400, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 750));

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

        setSize(new java.awt.Dimension(1098, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNumberActionPerformed

    private void tfUsernameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameRegisterActionPerformed

    private void tfAddressRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressRegisterActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void tfNameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameRegisterActionPerformed

    private void tfEmailRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailRegisterActionPerformed

    private void tfSkillRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSkillRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSkillRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbLastEduc;
    private com.toedter.calendar.JDateChooser dcBirthDay;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfPassRegister;
    private javax.swing.JTextField tfAddressRegister;
    private javax.swing.JTextField tfEmailRegister;
    private javax.swing.JTextField tfNameRegister;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfSkillRegister;
    private javax.swing.JTextField tfUsernameRegister;
    // End of variables declaration//GEN-END:variables

    public String getPfPassRegister() {
        return pfPassRegister.getText();
    }

    public String getTfAddressRegister() {
        return tfAddressRegister.getText();
    }

    public String getTfEmailRegister() {
        return tfEmailRegister.getText();
    }

    public String getTfNameRegister() {
        return tfNameRegister.getText();
    }

    public String getTfPhoneNumber() {
        return tfPhoneNumber.getText();
    }

    public String getTfSkillRegister() {
        return tfSkillRegister.getText();
    }

    public String getTfUsernameRegister() {
        return tfUsernameRegister.getText();
    }

    public String getDcBirthDay() {
        Date tgl = dcBirthDay.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(tgl);
    }

    public String getCbLastEduc() {
        int i = cbLastEduc.getSelectedIndex();
        return cbLastEduc.getItemAt(i);
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public void setPfPassRegister(String x) {
        pfPassRegister.setText(x);
    }

    public void setTfAddressRegister(String x) {
        tfAddressRegister.setText(x);
    }

    public void setTfEmailRegister(String x) {
        tfEmailRegister.setText(x);
    }

    public void setTfNameRegister(String x) {
        tfNameRegister.setText(x);
    }

    public void setTfPhoneNumber(String x) {
        tfPhoneNumber.setText(x);
    }

    public void setTfSkillRegister(String x) {
        tfSkillRegister.setText(x);
    }

    public void setTfUsernameRegister(String x) {
        tfUsernameRegister.setText(x);
    }

    public void reset(){
        setPfPassRegister("");
        setTfNameRegister("");
        setTfUsernameRegister("");
        setTfEmailRegister("");
        setTfPhoneNumber("");
        setTfSkillRegister("");
        setTfAddressRegister("");
        cbLastEduc.setSelectedIndex(0);
        dcBirthDay.setDate(new Date());
    }
    
    public void addActionListener(ActionListener x){
        btnRegister.addActionListener(x);
    }
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    
    
    
    

    
}
