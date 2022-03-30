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
public class updateMemberfun {
      private static int lastid;
    String mID,fName,memberID;
    
    Connection conn=new DBConnection().connect();
     void addMemDetails(String name, String bd, 
            String ph,String address, String gender, String fb,String sup,int amount,String amtStatus,
            int pamt,String start,String end,String facility,int tolbill,String memberID,String trainer,String uID)
    {
        
    System.out.println(uID+"gggggggguuuuuuuuIIIIIIIIDDDDDDDD");
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("update memberdatas set  "
                + "name=?,Birthday=?,PhoneNo=?,Address=?,"
                + "Gender=?,FacebookAcc=?,Subscription=?,Amount=?,AmountStatus=?,PendingAmount=?,"
                + "StartDate=?,EndDate=?,Facility=?,TotalBill=?,Trainer=? where MemberID='"+memberID+"';");
        ps.setString(1, name);
        ps.setString(2,bd);
        ps.setString(3, ph);
        ps.setString(4,address);
        ps.setString(5,gender);
        ps.setString(6,fb);
        ps.setString(7,sup);
        ps.setInt(8,amount);
        ps.setString(9,amtStatus);
        ps.setInt(10,pamt);
        ps.setString(11,start);
        ps.setString(12,end);
        ps.setString(13,facility );
        ps.setInt(14,tolbill);
        ps.setString(15,trainer);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "information succefully entered to the database");
        
    } catch (SQLException ex) {
        Logger.getLogger(AddMemberFunc.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /*
    
    public int getId(){
    try{
            
            PreparedStatement st = conn.prepareStatement("select * from  memberdatas where id");
           
           ResultSet rs = st.executeQuery();
           rs = st.executeQuery("SELECT MAX(id) AS id FROM memberdatas");
           if(rs.next())
             lastid = rs.getInt("id");
           System.out.println("last id from the function :"+lastid);

                
               return lastid+1; 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"problem at setting foriegn key: "+e );
                System.out.println(e);
            }
    
    
    return lastid;
}*/
    
    public int getTrainerID(){
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
}

    
    
}
