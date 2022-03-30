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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TSS
 */
public class updateTrainerfun {
     private static int lastid;
    
    Connection conn=new DBConnection().connect();
    void addTrainertb(String name, String bd, 
            String ph,String address,String gender,String startD,String tID)
    {
           
    try {
        PreparedStatement ps;
        ps=conn.prepareStatement("update trainerdata set "
                + "Name=?,Birthday=?,PhoneNo=?,Address=?,Gender=?,StartDate=?,TID=?"
                + " where TID='"+tID+"';");
        //ps.setInt(1, getTrainerID());
        ps.setString(1, name);
        ps.setString(2, bd);
        ps.setString(3, ph);
        ps.setString(4, address);
        ps.setString(5, gender);
        ps.setString(6, startD);
        ps.setString(7,tID);
        ps.executeUpdate();
        System.out.println(name+bd +ph +address +gender + startD+tID);
        
        JOptionPane.showMessageDialog(null, "information succefully entered to the database");
        
    } catch (SQLException ex) {
        Logger.getLogger(AddMemberFunc.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
   /*  public int getTrainerID(){
    try{
            
            PreparedStatement st = conn.prepareStatement("select * from  trainerdata where id");
           
           ResultSet rs = st.executeQuery();
           rs = st.executeQuery("SELECT MAX(id) AS id FROM trainerdata");
           if(rs.next())
             lastid = rs.getInt("id");
           System.out.println("last id from the trainerrrrr :"+lastid);

                
               return lastid+1; 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"problem at setting foriegn key: "+e );
                System.out.println(e);
            }
    
    
    return lastid;
}*/
}
