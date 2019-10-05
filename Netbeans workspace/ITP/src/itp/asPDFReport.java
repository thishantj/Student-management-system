package itp;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prabh
 */
public class asPDFReport {
    
    public static void main(String ar[]) throws SQLException, DocumentException, IOException{
        
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
        
        rs.first();

        Document d = new Document(PageSize.A4.rotate(), 0, 0, 0, 0);
        try {
            PdfWriter.getInstance(d, new FileOutputStream("Academic Staff Detials.pdf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(asPDFReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PdfPTable pt = new PdfPTable(colno);
        
        d.open();
        
        d.add(new Paragraph("\n\n Acedemic Staff Details \n\n\n"));
        
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
        }
       
        
        d.add(pt);
        
        d.close();
       
        
    }
    
}
