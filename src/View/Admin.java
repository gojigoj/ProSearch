/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerAdmin;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Goji
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scrolltabProject = new javax.swing.JScrollPane();
        tabDaftarUser = new javax.swing.JTable();
        tfSearchUser = new javax.swing.JTextField();
        btnExitUser = new javax.swing.JButton();
        btnSearchUser = new javax.swing.JButton();
        btnResetUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 192, 0));
        jLabel6.setText("DAFTAR USER");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 190, 127));
        jLabel7.setText("ProSearch");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(89, 89, 89));
        jLabel5.setText("ProSearch");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        scrolltabProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(89, 89, 89)));

        tabDaftarUser.setAutoCreateRowSorter(true);
        tabDaftarUser.setBackground(new java.awt.Color(242, 242, 242));
        tabDaftarUser.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tabDaftarUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Email", "Date of Birth", "Address", "Last Education", "No. HP", "Skill"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabDaftarUser.setGridColor(new java.awt.Color(89, 89, 89));
        tabDaftarUser.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tabDaftarUser.setRowHeight(30);
        tabDaftarUser.setSelectionBackground(new java.awt.Color(89, 89, 89));
        scrolltabProject.setViewportView(tabDaftarUser);

        jPanel2.add(scrolltabProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 1040, 240));

        tfSearchUser.setBackground(new java.awt.Color(38, 38, 38));
        tfSearchUser.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        tfSearchUser.setForeground(new java.awt.Color(242, 242, 242));
        tfSearchUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(242, 242, 242)));
        tfSearchUser.setCaretColor(new java.awt.Color(242, 242, 242));
        tfSearchUser.setOpaque(false);
        tfSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchUserActionPerformed(evt);
            }
        });
        jPanel2.add(tfSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 200, 40));

        btnExitUser.setBackground(new java.awt.Color(255, 192, 0));
        btnExitUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnExitUser.setText("EXIT");
        btnExitUser.setToolTipText("");
        btnExitUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnExitUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnExitUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, -1, -1));

        btnSearchUser.setBackground(new java.awt.Color(255, 192, 0));
        btnSearchUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnSearchUser.setText("SEARCH");
        btnSearchUser.setToolTipText("");
        btnSearchUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        btnResetUser.setBackground(new java.awt.Color(255, 192, 0));
        btnResetUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnResetUser.setText("RESET");
        btnResetUser.setToolTipText("");
        btnResetUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnResetUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnResetUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, -1, -1));

        btnDeleteUser.setBackground(new java.awt.Color(255, 192, 0));
        btnDeleteUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        btnDeleteUser.setText("DELETE");
        btnDeleteUser.setToolTipText("");
        btnDeleteUser.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 192, 0)));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchUserActionPerformed

    private void btnExitUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitUserActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchUserActionPerformed

    private void btnResetUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteUserActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExitUser;
    private javax.swing.JButton btnResetUser;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrolltabProject;
    private javax.swing.JTable tabDaftarUser;
    private javax.swing.JTextField tfSearchUser;
    // End of variables declaration//GEN-END:variables

    public JButton getbtnSearchUser(){
        return btnSearchUser;
    }
    
    public JButton getbtnResetUser(){
        return btnResetUser;
    }
    
    public JButton getbtnDeleteUser(){
        return btnDeleteUser;
    }
}
