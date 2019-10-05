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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author thishantj
 */
public class nastaff_add extends javax.swing.JFrame {

    /**
     * Creates new form searchStudent
     */
    public nastaff_add() {
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
        btn_addNAS = new javax.swing.JButton();
        btn_searchNAS = new javax.swing.JButton();
        btn_deleteNAS = new javax.swing.JButton();
        btn_updateNAS = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel_firstName = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel_lastName = new javax.swing.JLabel();
        jLabel_dob = new javax.swing.JLabel();
        experience = new javax.swing.JTextField();
        jLabel_parentName = new javax.swing.JLabel();
        jLabel_tel = new javax.swing.JLabel();
        jLabel_address = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel_email1 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel_email2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel_firstName1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        sex = new javax.swing.JComboBox<>();
        profession = new javax.swing.JComboBox<>();
        phonelab = new javax.swing.JLabel();
        emaillab = new javax.swing.JLabel();
        DOBlab = new javax.swing.JLabel();
        namelab = new javax.swing.JLabel();
        IDlab = new javax.swing.JLabel();
        mstatus = new javax.swing.JComboBox<>();
        btn_clear = new javax.swing.JButton();
        dobPicker = new com.toedter.calendar.JDateChooser();
        btn_demo = new javax.swing.JButton();

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
        jLabel1.setText("Non-academic Staff Management");
        jLabel1.setIconTextGap(50);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 770, 70));

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

        btn_addNAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_addNAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addNAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-user-male-40(1).png"))); // NOI18N
        btn_addNAS.setText("   Add Details");
        btn_addNAS.setBorder(null);
        btn_addNAS.setBorderPainted(false);
        btn_addNAS.setContentAreaFilled(false);
        btn_addNAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addNAS.setFocusPainted(false);
        btn_addNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_addNAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 50));

        btn_searchNAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_searchNAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_searchNAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-find-user-male-40(1).png"))); // NOI18N
        btn_searchNAS.setText("   Search Details");
        btn_searchNAS.setBorder(null);
        btn_searchNAS.setBorderPainted(false);
        btn_searchNAS.setContentAreaFilled(false);
        btn_searchNAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchNAS.setFocusPainted(false);
        btn_searchNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_searchNAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        btn_deleteNAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteNAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteNAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-user-male-40.png"))); // NOI18N
        btn_deleteNAS.setText("   Delete details");
        btn_deleteNAS.setBorder(null);
        btn_deleteNAS.setBorderPainted(false);
        btn_deleteNAS.setContentAreaFilled(false);
        btn_deleteNAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteNAS.setFocusPainted(false);
        btn_deleteNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteNASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_deleteNAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 40));

        btn_updateNAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateNAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_updateNAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-change-user-40.png"))); // NOI18N
        btn_updateNAS.setText("   Update details");
        btn_updateNAS.setBorder(null);
        btn_updateNAS.setBorderPainted(false);
        btn_updateNAS.setContentAreaFilled(false);
        btn_updateNAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateNAS.setFocusPainted(false);
        btn_updateNAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateNASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_updateNAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, -1));

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

        jLabel_firstName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName.setText("Name");
        jPanel1.add(jLabel_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 310, 50));

        jLabel_lastName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_lastName.setText("Address");
        jPanel1.add(jLabel_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        jLabel_dob.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_dob.setText("Working Experience");
        jPanel1.add(jLabel_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, -1));

        experience.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel1.add(experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 310, 50));

        jLabel_parentName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_parentName.setText("Profession");
        jPanel1.add(jLabel_parentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        jLabel_tel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_tel.setText("Date of Birth");
        jPanel1.add(jLabel_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        jLabel_address.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_address.setText("Marital Status");
        jPanel1.add(jLabel_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel_email.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email.setText("Sex");
        jPanel1.add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 310, 50));

        email.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 310, 50));

        jLabel_email1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email1.setText("Email");
        jPanel1.add(jLabel_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        phone.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 310, 50));

        jLabel_email2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_email2.setText("Phone");
        jPanel1.add(jLabel_email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 310, 50));

        jLabel_firstName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName1.setText("ID");
        jPanel1.add(jLabel_firstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-user-male-36.png"))); // NOI18N
        btn_add.setText("Add");
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.setIconTextGap(6);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, 180, -1));

        sex.setBackground(java.awt.SystemColor.activeCaption);
        sex.setEditable(true);
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        sex.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 310, 50));

        profession.setBackground(java.awt.SystemColor.activeCaption);
        profession.setEditable(true);
        profession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Security", "Cleaning", "Maintenance" }));
        profession.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        profession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professionActionPerformed(evt);
            }
        });
        jPanel1.add(profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 310, 50));

        phonelab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(phonelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 310, -1));

        emaillab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(emaillab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 310, -1));

        DOBlab.setForeground(new java.awt.Color(204, 0, 0));
        DOBlab.setToolTipText("");
        jPanel1.add(DOBlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 310, -1));

        namelab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(namelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 310, -1));

        IDlab.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(IDlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 310, -1));

        mstatus.setBackground(java.awt.SystemColor.activeCaption);
        mstatus.setEditable(true);
        mstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Married", "Widowed", "Separated", "Divorced", "Single" }));
        mstatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstatusActionPerformed(evt);
            }
        });
        jPanel1.add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 310, 50));

        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-clear-formatting-40.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.setIconTextGap(6);
        btn_clear.setMaximumSize(new java.awt.Dimension(115, 45));
        btn_clear.setMinimumSize(new java.awt.Dimension(115, 45));
        btn_clear.setPreferredSize(new java.awt.Dimension(115, 45));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 180, -1));

        dobPicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dobPicker.setMaxSelectableDate(new java.util.Date(1002132000000L));
        jPanel1.add(dobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 310, 50));

        btn_demo.setBackground(new java.awt.Color(255, 255, 255));
        btn_demo.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        btn_demo.setText("Demo");
        btn_demo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_demo.setIconTextGap(6);
        btn_demo.setMaximumSize(new java.awt.Dimension(115, 45));
        btn_demo.setMinimumSize(new java.awt.Dimension(115, 45));
        btn_demo.setPreferredSize(new java.awt.Dimension(115, 45));
        btn_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_demo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 180, -1));

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

    private void btn_addNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addNASActionPerformed

        setVisible(false);

        nastaff_add addnas = new nastaff_add();
        addnas.setVisible(true);
    }//GEN-LAST:event_btn_addNASActionPerformed

    private void btn_searchNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNASActionPerformed

        setVisible(false);

        nastaff_search searchnas = new nastaff_search();
        searchnas.setVisible(true);
    }//GEN-LAST:event_btn_searchNASActionPerformed

    private void btn_deleteNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteNASActionPerformed

        setVisible(false);

        nastaff_delete deletenas = new nastaff_delete();
        deletenas.setVisible(true);
    }//GEN-LAST:event_btn_deleteNASActionPerformed

    private void btn_updateNASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateNASActionPerformed

        setVisible(false);

        nastaff_update updatenas = new nastaff_update();
        updatenas.setVisible(true);
    }//GEN-LAST:event_btn_updateNASActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         // TODO add your handling code here:
        
        dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        String sql1 = "Insert into employee(EID, Name, DOB, sex, Marital_Status, Address, Tel, Email, Profession) values(?,?,?,?,?,?,?,?,?)";  
        String sql2 = "Insert into non_academic_staff(EID, experience) values(?,?)";
        
        try {
            
       
// dataop > table name in your database
// id,username,password,age,email > field name in your tables.
            PreparedStatement pst1 = conn.prepareStatement(sql1);

            pst1.setString(1, "NA"+id.getText() );
            pst1.setString(2, name.getText() );
            pst1.setString(3, new SimpleDateFormat("MMM d, yyyy").format(dobPicker.getDate() ) );
            pst1.setString(4, (String) sex.getSelectedItem());
            pst1.setString(5, (String) mstatus.getSelectedItem());
            pst1.setString(6, address.getText() );
            pst1.setString(7, phone.getText() );
            pst1.setString(8, email.getText() );
            pst1.setString(9, (String) profession.getSelectedItem());
            
            PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst2.setString(1, "NA"+id.getText() );
            pst2.setString(2, experience.getText() );
// id_text,user_text,pass_text,age_text,email_text > jtextfields name


            pst1.executeUpdate();
            pst2.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void professionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professionActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(id.getText());
        if(!match.matches()){
            IDlab.setText("Incorrect ID  ( example - NA00 ) ");
        }
        else{
            IDlab.setText(null);
        }
    }//GEN-LAST:event_idKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(name.getText());
        if(!match.matches()){
            namelab.setText("Incorrect Name ");
        }
        else{
            namelab.setText(null);
        }
    }//GEN-LAST:event_nameKeyReleased

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0][0-9]{9}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(phone.getText());
        if(!match.matches()){
            phonelab.setText("Incorrect Mobile No  ( Ex 0774141842  ) ");
        }
        else{
            phonelab.setText(null);
        }
    }//GEN-LAST:event_phoneKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z_.]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(email.getText());
        if(!match.matches()){
            emaillab.setText("Incorrect Email    (email@example.com) ");
        }
        else{
            emaillab.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void mstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mstatusActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        setVisible(false);

        Staff_Main searchas = new Staff_Main();
        searchas.setVisible(true);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:

        id.setText("");
        name.setText("");
        dobPicker.setDate(null);
        sex.setSelectedItem("Select");
        mstatus.setSelectedItem("Select");
        address.setText("");
        phone.setText("");
        email.setText("");
        profession.setSelectedItem("Select");
        experience.setText("");

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demoActionPerformed
        name.setText("Jayantha Karunarathne");
        sex.setSelectedItem("Male");
        mstatus.setSelectedItem("Separated");
        address.setText("Udugampola, Sri Lanka");
        phone.setText("0774141842");
        email.setText("jaye.k72@gmail.com");
        profession.setSelectedItem("Security");
        experience.setText("Worked as a Hospital Security Guard");
    }//GEN-LAST:event_btn_demoActionPerformed

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
            java.util.logging.Logger.getLogger(nastaff_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nastaff_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nastaff_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nastaff_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new nastaff_add().setVisible(true);
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBlab;
    private javax.swing.JLabel IDlab;
    private javax.swing.JTextField address;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addNAS;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_deleteNAS;
    private javax.swing.JButton btn_demo;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_searchNAS;
    private javax.swing.JButton btn_updateNAS;
    private com.toedter.calendar.JDateChooser dobPicker;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaillab;
    private javax.swing.JTextField experience;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_dob;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_email1;
    private javax.swing.JLabel jLabel_email2;
    private javax.swing.JLabel jLabel_firstName;
    private javax.swing.JLabel jLabel_firstName1;
    private javax.swing.JLabel jLabel_lastName;
    private javax.swing.JLabel jLabel_parentName;
    private javax.swing.JLabel jLabel_tel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JComboBox<String> mstatus;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelab;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phonelab;
    private javax.swing.JComboBox<String> profession;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}