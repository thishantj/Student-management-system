package itp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHARUKH
 */

public class HomeN extends javax.swing.JFrame {

    // Creates new form HomeN
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    
    public HomeN() 
    {
        super("Home");
        initComponents();
        //conn = databaseConnection.connection();
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
        Htopic1 = new javax.swing.JLabel();
        HExit = new javax.swing.JButton();
        HSalary = new javax.swing.JButton();
        HLeaves = new javax.swing.JButton();
        HPayroll = new javax.swing.JButton();
        Hsalary = new javax.swing.JLabel();
        Hleaves = new javax.swing.JLabel();
        Hpayroll = new javax.swing.JLabel();
        Htopic = new javax.swing.JLabel();
        Hpanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Htopic1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Htopic1.setForeground(new java.awt.Color(255, 255, 255));
        Htopic1.setText(" Handling System");
        jPanel1.add(Htopic1);
        Htopic1.setBounds(320, 80, 430, 80);

        HExit.setBackground(new java.awt.Color(153, 153, 255));
        HExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-64.png"))); // NOI18N
        HExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HExitActionPerformed(evt);
            }
        });
        jPanel1.add(HExit);
        HExit.setBounds(990, 640, 80, 60);

        HSalary.setBackground(new java.awt.Color(153, 153, 255));
        HSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-get-cash-64.png"))); // NOI18N
        HSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(HSalary);
        HSalary.setBounds(90, 310, 160, 120);

        HLeaves.setBackground(new java.awt.Color(153, 153, 255));
        HLeaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-calendar-1-64.png"))); // NOI18N
        HLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HLeavesActionPerformed(evt);
            }
        });
        jPanel1.add(HLeaves);
        HLeaves.setBounds(480, 310, 160, 120);

        HPayroll.setBackground(new java.awt.Color(153, 153, 255));
        HPayroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-payroll-64.png"))); // NOI18N
        HPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPayrollActionPerformed(evt);
            }
        });
        jPanel1.add(HPayroll);
        HPayroll.setBounds(840, 310, 160, 120);

        Hsalary.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Hsalary.setForeground(new java.awt.Color(255, 255, 255));
        Hsalary.setText("Salary");
        jPanel1.add(Hsalary);
        Hsalary.setBounds(100, 470, 150, 60);

        Hleaves.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Hleaves.setForeground(new java.awt.Color(255, 255, 255));
        Hleaves.setText("Leaves");
        jPanel1.add(Hleaves);
        Hleaves.setBounds(490, 460, 150, 80);

        Hpayroll.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Hpayroll.setForeground(new java.awt.Color(255, 255, 255));
        Hpayroll.setText("Payroll");
        jPanel1.add(Hpayroll);
        Hpayroll.setBounds(860, 470, 140, 60);

        Htopic.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Htopic.setForeground(new java.awt.Color(255, 255, 255));
        Htopic.setText("Teacher Management and Payroll");
        jPanel1.add(Htopic);
        Htopic.setBounds(140, 10, 810, 80);

        Hpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(Hpanel);
        Hpanel.setBounds(0, 0, 1080, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1098, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPayrollActionPerformed
        
        PayrollN p = new PayrollN();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HPayrollActionPerformed

    private void HExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HExitActionPerformed

    private void HLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HLeavesActionPerformed
        // TODO add your handling code here:
        LeavesN l = new LeavesN();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HLeavesActionPerformed

    private void HSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSalaryActionPerformed
        // TODO add your handling code here:
        SalaryN s = new SalaryN();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(HomeN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HExit;
    private javax.swing.JButton HLeaves;
    private javax.swing.JButton HPayroll;
    private javax.swing.JButton HSalary;
    private javax.swing.JLabel Hleaves;
    private javax.swing.JLabel Hpanel;
    private javax.swing.JLabel Hpayroll;
    private javax.swing.JLabel Hsalary;
    private javax.swing.JLabel Htopic;
    private javax.swing.JLabel Htopic1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
