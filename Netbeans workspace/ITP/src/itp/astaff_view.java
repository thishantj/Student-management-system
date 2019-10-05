/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prabh
 */
public class astaff_view extends javax.swing.JFrame {

    /**
     * Creates new form astaff_view
     */
    public astaff_view() {
        try {
            initComponents();
            show_user();
        } catch (SQLException ex) {
            Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public ArrayList<Aview> userList() throws SQLException{
        ArrayList<Aview> userList = new ArrayList<>();
        
        dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        String query1 = "SELECT * FROM employee Where EID LIKE 'A%'";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query1);
        Aview aview;
        
        while(rs.next()){
            aview = new Aview(rs.getString("EID"), rs.getString("Name"), rs.getString("DOB"), rs.getString("sex"), rs.getString("Marital_Status"),rs.getString("Address"),rs.getString("Tel"),rs.getString("Email"),rs.getString("Profession"));
            userList.add(aview);
            
            
          
        }
        return userList;
        
    }
    
    public void show_user() throws SQLException{
        ArrayList<Aview> list =  userList();
        DefaultTableModel model = (DefaultTableModel)astaff_view.getModel();
        Object[] row = new Object[9];
        for(int i=0; i <list.size();i++){
                row[0]=list.get(i).getEID();
                row[1]=list.get(i).getName();
                row[2]=list.get(i).getDOB();
                row[3]=list.get(i).getSex();
                row[4]=list.get(i).getMarital_Status();
                row[5]=list.get(i).getAddress();
                row[6]=list.get(i).getTel();
                row[7]=list.get(i).getEmail();
                row[8]=list.get(i).getProfession();
     
            
                model.addRow(row);
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_genAS = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_addAS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        astaff_view = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

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

        btn_genAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_genAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_genAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-business-report-40.png"))); // NOI18N
        btn_genAS.setText("Generate Report");
        btn_genAS.setBorder(null);
        btn_genAS.setBorderPainted(false);
        btn_genAS.setContentAreaFilled(false);
        btn_genAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_genAS.setFocusPainted(false);
        btn_genAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_genAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 50));

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

        btn_addAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_addAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_addAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-management-46.png"))); // NOI18N
        btn_addAS.setText("   Management");
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
        jPanel7.add(btn_addAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 50));

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 70, 250, 650);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-management-100.png"))); // NOI18N
        jLabel1.setText("Academic Staff Details");
        jLabel1.setIconTextGap(50);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 770, 70));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 70);

        astaff_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date Of Birth", "Sex", "Marital Status", "Address", "Phone", "Email", "Profession"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(astaff_view);
        if (astaff_view.getColumnModel().getColumnCount() > 0) {
            astaff_view.getColumnModel().getColumn(0).setResizable(false);
            astaff_view.getColumnModel().getColumn(1).setResizable(false);
            astaff_view.getColumnModel().getColumn(2).setResizable(false);
            astaff_view.getColumnModel().getColumn(3).setResizable(false);
            astaff_view.getColumnModel().getColumn(4).setResizable(false);
            astaff_view.getColumnModel().getColumn(5).setResizable(false);
            astaff_view.getColumnModel().getColumn(6).setResizable(false);
            astaff_view.getColumnModel().getColumn(7).setResizable(false);
            astaff_view.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 70, 830, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed

        setVisible(false);

        homePage home = new homePage();
        home.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_genASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genASActionPerformed

        try {                                          
            
            int rowno = 0;
            
            dbConnection db = new dbConnection();
            Connection conn = db.getConnection();
            
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("Select * from Employee where EID like 'A%'");
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int colno = rsmd.getColumnCount();
            
            while(rs.next())
            {
                
                rowno = rowno+1;
            }
            
            try {
                rs.first();
            } catch (SQLException ex) {
                Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Document d = new Document(PageSize.A4.rotate(), 0, 0, 0, 0);
            try {
                try {
                    PdfWriter.getInstance(d, new FileOutputStream("Academic Staff Detials.pdf"));
                } catch (DocumentException ex) {
                    Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(asPDFReport.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PdfPTable pt = new PdfPTable(colno);
            
            d.open();
            
            try {
                d.add(new Paragraph("\n\n Acedemic Staff Details \n\n\n"));
            } catch (DocumentException ex) {
                Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            pt.addCell("EID");
            pt.addCell("NAME");
            pt.addCell("Date of Birth");
            pt.addCell("Gender");
            pt.addCell("Marital Status");
            pt.addCell("Address");
            pt.addCell("Phone");
            pt.addCell("Email");
            pt.addCell("Profession");
            
            for(int i=0; i<rowno;i++){
                try {
                    pt.addCell(""+rs.getString(1));
                    pt.addCell(""+rs.getString(2));
                    pt.addCell(""+rs.getString(3));
                    pt.addCell(""+rs.getString(4));
                    pt.addCell(""+rs.getString(5));
                    pt.addCell(""+rs.getString(6));
                    pt.addCell(""+rs.getString(7));
                    pt.addCell(""+rs.getString(8));
                    pt.addCell(""+rs.getString(9));
                    rs.next();
                } catch (SQLException ex) {
                    Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            try {
                d.add(pt);
            } catch (DocumentException ex) {
                Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            d.close();
                JOptionPane.showMessageDialog(null, "Successfully genarated");
        } catch (SQLException ex) {
            Logger.getLogger(astaff_view.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_btn_genASActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        setVisible(false);

        Staff_Main searchas = new Staff_Main();
        searchas.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addASActionPerformed
        // TODO add your handling code here:
        setVisible(false);

        astaff_add addas = new astaff_add();
        addas.setVisible(true);
    }//GEN-LAST:event_btn_addASActionPerformed

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
            java.util.logging.Logger.getLogger(astaff_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(astaff_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(astaff_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(astaff_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new astaff_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable astaff_view;
    private javax.swing.JButton btn_addAS;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_genAS;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}