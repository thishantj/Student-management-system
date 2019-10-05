package itp;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.JOptionPane;
import LessonsDao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
//import org.controlsfx.validation.ValidationSupport;

public class AddLesson extends javax.swing.JFrame {

            Connection con ;

   
    public AddLesson() {
        

       Connection con = null;
        
        try {
            java.lang.Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=tinytot;password=12345");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                initComponents();

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_searchS = new javax.swing.JButton();
        btn_deleteS = new javax.swing.JButton();
        btn_updateS = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Subject Management System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1080, 70);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-property-80.png"))); // NOI18N
        btn_add.setText("   Add Lesson");
        btn_add.setBorder(null);
        btn_add.setBorderPainted(false);
        btn_add.setContentAreaFilled(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.setFocusPainted(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel11.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 270, 80));

        btn_searchS.setBackground(new java.awt.Color(255, 255, 255));
        btn_searchS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_searchS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-database-80.png"))); // NOI18N
        btn_searchS.setText("   Search Lesson");
        btn_searchS.setBorder(null);
        btn_searchS.setBorderPainted(false);
        btn_searchS.setContentAreaFilled(false);
        btn_searchS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchS.setFocusPainted(false);
        btn_searchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_searchS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 190, 270, 80));

        btn_deleteS.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deleteS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-bin-80.png"))); // NOI18N
        btn_deleteS.setText("   Delete Lesson");
        btn_deleteS.setBorder(null);
        btn_deleteS.setBorderPainted(false);
        btn_deleteS.setContentAreaFilled(false);
        btn_deleteS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteS.setFocusPainted(false);
        btn_deleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_deleteS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 310, 250, 80));

        btn_updateS.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_updateS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-left-rotation.png"))); // NOI18N
        btn_updateS.setText("   Update Lesson");
        btn_updateS.setBorder(null);
        btn_updateS.setBorderPainted(false);
        btn_updateS.setContentAreaFilled(false);
        btn_updateS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateS.setFocusPainted(false);
        btn_updateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateSActionPerformed(evt);
            }
        });
        jPanel11.add(btn_updateS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 60));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-80.png"))); // NOI18N
        btn_exit.setText("        Exit");
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
        jPanel11.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 510, 220, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-50.png"))); // NOI18N
        jLabel3.setText("      Home");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 70));

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 70, 250, 1636);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Subject Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Credit");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Max Mark");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setToolTipText("");

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(417, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel8)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel9)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 80, 740, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent closeEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeEvent);
    }

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        AddLesson std = new AddLesson();
        std.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_searchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchSActionPerformed

        SearchLesson1 searchlsn = new SearchLesson1();
        searchlsn.setVisible(true);
    }//GEN-LAST:event_btn_searchSActionPerformed

    private void btn_deleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSActionPerformed

        DeleteLesson deletestd = new DeleteLesson();
        deletestd.setVisible(true);
    }//GEN-LAST:event_btn_deleteSActionPerformed

    private void btn_updateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateSActionPerformed

        EditLesson updatestd = new EditLesson();
        updatestd.setVisible(true);
    }//GEN-LAST:event_btn_updateSActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Subject_Allocation allow = new Subject_Allocation();
        allow.setVisible(true);
        int returnValue = 0;
        returnValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (returnValue == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        boolean validSubjectName = false;
        boolean validSubjectCredits = false;
        boolean validSubjectMaxmark = false;
        boolean validSubjectId = false;
        
        Pattern pNumbers = Pattern.compile("^(0|[1-9][0-9]*)$");
        Pattern pText = Pattern.compile("^[a-zA-Z ]*$");
        
        Matcher mName = pText.matcher(jTextField6.getText());
        Matcher mCredits = pNumbers.matcher(jTextField4.getText());
        Matcher mMax = pNumbers.matcher(jTextField7.getText());
        
        validSubjectName = mName.matches();
        validSubjectCredits = mCredits.matches();
        validSubjectMaxmark = mMax.matches();

        if (validSubjectName && validSubjectCredits && validSubjectMaxmark) {
            jLabel8.setText("");
            jLabel9.setText("");
            jLabel10.setText("");
            
            Lesson lesson = new Lesson(jTextField6.getText(), Integer.parseInt(jTextField4.getText()), Integer.parseInt(jTextField7.getText()));

            LessonsDao lessonsDao = new LessonsDao();
            int status = lessonsDao.addLesson(lesson);

            if (status > 0) {
                JOptionPane.showMessageDialog(null, "Record successfully added to database");
                jTextField6.setText("");
                jTextField4.setText("");
                jTextField7.setText("");

            }
            else{
                JOptionPane.showMessageDialog(null, "Try Again !!!");
            }
        }
        else{
            
            if(!validSubjectName){
                jLabel8.setText("Required field. Only alphabetical chracters allowed!");
            }
            if(!validSubjectCredits){
                jLabel9.setText("Required field. Only numbers allowed!");
            }
            if(!validSubjectMaxmark){
                jLabel10.setText("Required field. Only numbers allowed!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            
            JasperDesign jasdi = JRXmlLoader.load("C:\\Users\\Dell\\Desktop\\pre school management\\Lesson\\src\\TablePrint.jrxml"); 
            String sql = "SELECT `subject_id`, `subject_name`, `subject_credit`, `subject_maxmark` FROM `lesson`";        
            JRDesignQuery newQuery = new JRDesignQuery();        
            newQuery.setText(sql);       
            jasdi.setQuery(newQuery);     
            JasperReport js = JasperCompileManager.compileReport(jasdi);        
            JasperPrint jp = JasperFillManager.fillReport(js, null, con);       
            JasperViewer.viewReport(jp);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
           

            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLesson().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_deleteS;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_searchS;
    private javax.swing.JButton btn_updateS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

  
}
