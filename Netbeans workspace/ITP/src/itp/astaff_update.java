/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author thishantj
 */
public class astaff_update extends javax.swing.JFrame {

    /**
     * Creates new form searchStudent
     */
    public astaff_update() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_addAS = new javax.swing.JButton();
        btn_searchAS = new javax.swing.JButton();
        btn_deleteAS = new javax.swing.JButton();
        btn_updateAS = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        stdID = new javax.swing.JLabel();
        staffID = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jLabel_firstName = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel_lastName = new javax.swing.JLabel();
        jLabel_dob = new javax.swing.JLabel();
        qualifications = new javax.swing.JTextField();
        jLabel_parentName = new javax.swing.JLabel();
        jLabel_tel = new javax.swing.JLabel();
        jLabel_address = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel_email1 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel_email2 = new javax.swing.JLabel();
        btn_search1 = new javax.swing.JButton();
        mstatus = new javax.swing.JComboBox<>();
        sex = new javax.swing.JComboBox<>();
        profession = new javax.swing.JComboBox<>();
        dobPicker = new com.toedter.calendar.JDateChooser();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-management-100.png"))); // NOI18N
        jLabel1.setText("Academic Staff Management");
        jLabel1.setIconTextGap(50);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 740, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-page-40.png"))); // NOI18N
        btn_home.setText("   Home");
        btn_home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusPainted(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel7.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        btn_addAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_addAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-user-male-40(1).png"))); // NOI18N
        btn_addAS.setText("   Add Details");
        btn_addAS.setBorder(null);
        btn_addAS.setBorderPainted(false);
        btn_addAS.setContentAreaFilled(false);
        btn_addAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addAS.setFocusPainted(false);
        btn_addAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_addAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 50));

        btn_searchAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_searchAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_searchAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-40(1).png"))); // NOI18N
        btn_searchAS.setText("   Search Details");
        btn_searchAS.setBorder(null);
        btn_searchAS.setBorderPainted(false);
        btn_searchAS.setContentAreaFilled(false);
        btn_searchAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchAS.setFocusPainted(false);
        btn_searchAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_searchAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        btn_deleteAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-user-male-40.png"))); // NOI18N
        btn_deleteAS.setText("   Delete details");
        btn_deleteAS.setBorder(null);
        btn_deleteAS.setBorderPainted(false);
        btn_deleteAS.setContentAreaFilled(false);
        btn_deleteAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteAS.setFocusPainted(false);
        btn_deleteAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_deleteAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 40));

        btn_updateAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_updateAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-change-user-40.png"))); // NOI18N
        btn_updateAS.setText("   Update details");
        btn_updateAS.setBorder(null);
        btn_updateAS.setBorderPainted(false);
        btn_updateAS.setContentAreaFilled(false);
        btn_updateAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateAS.setFocusPainted(false);
        btn_updateAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_updateAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, -1));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-arrow-46.png"))); // NOI18N
        btn_back.setText("   Back");
        btn_back.setBorder(null);
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setFocusPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel7.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 130, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 650));

        stdID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        stdID.setText("Employee ID : ");
        jPanel1.add(stdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 40));

        staffID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(staffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 380, 40));

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-user-36.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.setIconTextGap(6);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 180, -1));

        jLabel_firstName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName.setText("Name");
        jPanel1.add(jLabel_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 310, 50));

        jLabel_lastName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_lastName.setText("Address");
        jPanel1.add(jLabel_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel_dob.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_dob.setText("Qualifications");
        jPanel1.add(jLabel_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        qualifications.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel1.add(qualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 310, 50));

        jLabel_parentName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_parentName.setText("Profession");
        jPanel1.add(jLabel_parentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        jLabel_tel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_tel.setText("Date of Birth");
        jPanel1.add(jLabel_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        jLabel_address.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_address.setText("Marital Status");
        jPanel1.add(jLabel_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel_email.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email.setText("Sex");
        jPanel1.add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 310, 50));

        email.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 310, 50));

        jLabel_email1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email1.setText("Email");
        jPanel1.add(jLabel_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        phone.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 310, 50));

        jLabel_email2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email2.setText("Phone");
        jPanel1.add(jLabel_email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        btn_search1.setBackground(new java.awt.Color(255, 255, 255));
        btn_search1.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        btn_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-36.png"))); // NOI18N
        btn_search1.setText("Search");
        btn_search1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search1.setIconTextGap(6);
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 140, 40));

        mstatus.setBackground(java.awt.SystemColor.activeCaption);
        mstatus.setEditable(true);
        mstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Married", "Widowed", "Separated", "Divorced", "Single" }));
        mstatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstatusActionPerformed(evt);
            }
        });
        jPanel1.add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 310, 50));

        sex.setBackground(java.awt.SystemColor.activeCaption);
        sex.setEditable(true);
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        sex.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 310, 50));

        profession.setBackground(java.awt.SystemColor.activeCaption);
        profession.setEditable(true);
        profession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Teacher", "Principal" }));
        profession.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        profession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professionActionPerformed(evt);
            }
        });
        jPanel1.add(profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 310, 50));

        dobPicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dobPicker.setMaxSelectableDate(new java.util.Date(1002132000000L));
        jPanel1.add(dobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1098, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void close()
    {
        WindowEvent closeEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
    } 
    
    
    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed

        setVisible(false);

        homePage home = new homePage();
        home.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_addASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addASActionPerformed

        setVisible(false);

        astaff_add addas = new astaff_add();
        addas.setVisible(true);
    }//GEN-LAST:event_btn_addASActionPerformed

    private void btn_searchASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchASActionPerformed

        setVisible(false);

        astaff_search searchas = new astaff_search();
        searchas.setVisible(true);
    }//GEN-LAST:event_btn_searchASActionPerformed

    private void btn_deleteASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteASActionPerformed

        setVisible(false);

        astaff_delete deleteas = new astaff_delete();
        deleteas.setVisible(true);
    }//GEN-LAST:event_btn_deleteASActionPerformed

    private void btn_updateASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateASActionPerformed

        setVisible(false);

        astaff_update updateas = new astaff_update();
        updateas.setVisible(true);
    }//GEN-LAST:event_btn_updateASActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        // TODO add your handling code here:
        dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        
        String sql1 = "select * from employee where EID = '"+"A"+staffID.getText()+"'";
        String sql2 = "select * from academic_staff where EID = '"+"A"+staffID.getText()+"'";
        
        try {
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            PreparedStatement pst2 = conn.prepareStatement(sql2);
            
            ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            
             
            if(rs1.next() )
            {
                name.setText(rs1.getString("Name"));
                dobPicker.setDate(rs1.getDate("DOB"));
                sex.setSelectedItem(rs1.getString("sex"));
                mstatus.setSelectedItem(rs1.getString("Marital_Status"));
                address.setText(rs1.getString("Address"));
                phone.setText(rs1.getString("Tel"));
                email.setText(rs1.getString("Email"));
                profession.setSelectedItem(rs1.getString("Profession"));
                
            }
            
            if(rs2.next() )
            {
                qualifications.setText(rs2.getString("Qualifications"));
            }
            
  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
         dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        String sql1 = "update employee set Name=?, DOB=?, sex=?, Marital_Status=?, Address=?, Tel=?, Email=?, Profession=? where EID = '"+"A"+staffID.getText()+"'";
        
        String sql2 = "update academic_staff set Qualifications=? where EID = '"+"A"+staffID.getText()+"'";
        
        try {
            PreparedStatement pst1 = conn.prepareStatement(sql1);

            pst1.setString(1, name.getText() );
            pst1.setString(2, new SimpleDateFormat("MMM d, yyyy").format(dobPicker.getDate() ) );
            pst1.setString(3, (String) sex.getSelectedItem());
            pst1.setString(4, (String) mstatus.getSelectedItem());
            pst1.setString(5, address.getText() );
            pst1.setString(6, phone.getText() );
            pst1.setString(7, email.getText() );
            pst1.setString(8, (String) profession.getSelectedItem());
            
            PreparedStatement pst2 = conn.prepareStatement(sql2);
            
            pst2.setString(1, qualifications.getText() );
            
            pst1.executeUpdate();
            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updated successfully");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        setVisible(false);

        Staff_Main searchas = new Staff_Main();
        searchas.setVisible(true);

    }//GEN-LAST:event_btn_backActionPerformed

    private void mstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mstatusActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void professionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professionActionPerformed

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
            java.util.logging.Logger.getLogger(astaff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(astaff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(astaff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(astaff_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new astaff_update().setVisible(true);
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton btn_addAS;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_deleteAS;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_search1;
    private javax.swing.JButton btn_searchAS;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_updateAS;
    private com.toedter.calendar.JDateChooser dobPicker;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_dob;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_email1;
    private javax.swing.JLabel jLabel_email2;
    private javax.swing.JLabel jLabel_firstName;
    private javax.swing.JLabel jLabel_lastName;
    private javax.swing.JLabel jLabel_parentName;
    private javax.swing.JLabel jLabel_tel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JComboBox<String> mstatus;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> profession;
    private javax.swing.JTextField qualifications;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField staffID;
    private javax.swing.JLabel stdID;
    // End of variables declaration//GEN-END:variables
}
