package itp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maneesha
 */
public class StudentAttendance extends javax.swing.JFrame {
    public StudentAttendance() {
        initComponents();
       //datePicker.setMinDate(System.currentTimeMillis()); 
        try {
            show_attendance();
        } catch (SQLException ex) {
            Logger.getLogger(StudentAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Attendance> attendanceList() throws SQLException{
        ArrayList<Attendance> attendanceList = new ArrayList<>();
        dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        String query = "SELECT studentID, fname FROM students";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        Attendance att;
        
        while(rs.next()){
            att = new Attendance(rs.getString("studentID"), rs.getString("fname"));
            attendanceList.add(att);
        }
        return attendanceList;
    }
     public void show_attendance() throws SQLException{
         
        ArrayList<Attendance> list =  attendanceList();
        DefaultTableModel model = (DefaultTableModel)jTable_Attendance.getModel();
        Object[] row = new Object[2];
        
        for(int i=0; i <list.size(); i++){
                row[0]=list.get(i).getStudentID();
                row[1]=list.get(i).getName();
               
                model.addRow(row);
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        early_leave = new javax.swing.JButton();
        btn_display = new javax.swing.JButton();
        dobPicker = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Attendance = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SAMdate = new javax.swing.JTextField();
        dateCh = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date     :");
        jLabel3.setName("date"); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 60, 90, 60);
        jLabel3.getAccessibleContext().setAccessibleName("Date");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-page-40.png"))); // NOI18N
        btn_home.setText("   Home");
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusPainted(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel7.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, -1));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ios-40.png"))); // NOI18N
        btn_exit.setText("   Exit");
        btn_exit.setBorder(null);
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.setFocusPainted(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel7.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 40));

        early_leave.setBackground(new java.awt.Color(255, 255, 255));
        early_leave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        early_leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-leave-40.png"))); // NOI18N
        early_leave.setText("Early Leave");
        early_leave.setBorder(null);
        early_leave.setBorderPainted(false);
        early_leave.setContentAreaFilled(false);
        early_leave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        early_leave.setFocusPainted(false);
        early_leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                early_leaveActionPerformed(evt);
            }
        });
        jPanel7.add(early_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 60));

        btn_display.setBackground(new java.awt.Color(255, 255, 255));
        btn_display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-menu-male-40.png"))); // NOI18N
        btn_display.setText("Display ");
        btn_display.setBorder(null);
        btn_display.setBorderPainted(false);
        btn_display.setContentAreaFilled(false);
        btn_display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_display.setFocusPainted(false);
        btn_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_displayActionPerformed(evt);
            }
        });
        jPanel7.add(btn_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 60));

        dobPicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dobPicker.setMaxSelectableDate(new java.util.Date(1002132000000L));
        jPanel7.add(dobPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 310, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(null);
        jLabel4.setMinimumSize(null);
        jLabel4.setPreferredSize(null);
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 250, 200));

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 260, 1078);

        submit_btn.setBackground(new java.awt.Color(255, 255, 255));
        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-submit-progress-50.png"))); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.setBorder(null);
        submit_btn.setBorderPainted(false);
        submit_btn.setContentAreaFilled(false);
        submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_btn.setFocusPainted(false);
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(submit_btn);
        submit_btn.setBounds(300, 640, 117, 50);

        jTable_Attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Name", "Present/Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Attendance);
        if (jTable_Attendance.getColumnModel().getColumnCount() > 0) {
            jTable_Attendance.getColumnModel().getColumn(0).setResizable(false);
            jTable_Attendance.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(280, 230, 730, 400);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Present - p");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(790, 170, 80, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Absent - a");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(900, 180, 90, 30);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student Attendance Marking");
        jLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 0, 770, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Student Attendance Display");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 380, 509, 29);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(770, 170, 210, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(770, 70, 70, 40);

        SAMdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SAMdateKeyReleased(evt);
            }
        });
        getContentPane().add(SAMdate);
        SAMdate.setBounds(860, 70, 130, 40);

        dateCh.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dateCh);
        dateCh.setBounds(750, 130, 260, 30);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_1.jpeg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(750, 130, 260, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EYFS-Pre-School.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 0, 770, 770);

        setSize(new java.awt.Dimension(1042, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        setVisible(false);
        homePage home = new homePage();
        home.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        int returnValue = 0;
        returnValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (returnValue == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void early_leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_early_leaveActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StudentEaryLeaving sel = new StudentEaryLeaving();
        sel.setVisible(true);
    }//GEN-LAST:event_early_leaveActionPerformed

    private void btn_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_displayActionPerformed
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            StudentAttendanceDisplay seld = new StudentAttendanceDisplay();
            seld.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(StudentAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_displayActionPerformed
 
    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

                                           
        try {
            int rows = 0;
            rows = jTable_Attendance.getRowCount();
            
            dbConnection db = new dbConnection();
            Connection conn = db.getConnection();
            
            
            String query2 = "insert into attendance(date, studentID, name, present_absent) values(?,?,?,?)";
            PreparedStatement pst1 = conn.prepareStatement(query2);
            
            
            if(SAMdate.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Pick a date!");
            }
           
            for (int row = 0; row<rows; row++){
                    
                    pst1.setString(1, SAMdate.getText());
                    pst1.setString(2, (String) jTable_Attendance.getValueAt(row, 0));
                    pst1.setString(3, (String) jTable_Attendance.getValueAt(row, 1));
                    pst1.setString(4, (String) jTable_Attendance.getValueAt(row, 2));
                    
           
                    pst1.executeUpdate();
              
            }
            JOptionPane.showMessageDialog(null, "Successfully Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
    }//GEN-LAST:event_submit_btnActionPerformed

    private void SAMdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SAMdateKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^\\d{4}[\\/\\-](0?[1-9]|1[012])[\\/\\-](0?[1-9]|[12][0-9]|3[01])$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(SAMdate.getText());
        if(!match.matches()){
            dateCh.setText("Incorrect Date(example- 2019-09-10)");
        }
        else{
            dateCh.setText(null);
        }   
    }//GEN-LAST:event_SAMdateKeyReleased

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
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SAMdate;
    private javax.swing.JButton btn_display;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel dateCh;
    private com.toedter.calendar.JDateChooser dobPicker;
    private javax.swing.JButton early_leave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Attendance;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
