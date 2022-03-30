/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessgym;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TSS
 */
public class getTotalMem {
     String i=null;
    public void setTolMember() throws SQLException
    {
        Connection conn=new DBConnection().connect();
        PreparedStatement ps=conn.prepareStatement("select count(Id) from memberdatas;");
        ResultSet rs=ps.executeQuery();
        
       while(rs.next())
        {
              i=rs.getString("count(Id)");
             //lblTolMem.setText(String.valueOf(i));
              
       System.out.println(i+"IIIIICCccc");
   
        }
       
       
    }
    
    
}
