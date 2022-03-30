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
public class AddMemberFunc {
    
    
    private static int lastid;
    String mID,fName,memberID;
    
    Connection conn=new DBConnection().connect();
     void addMemDetails(String name, String bd, 
            String ph,String address, String gender, String fb,String sup,int amount,String amtStatus,
            int pamt,String start,String end,String facility,int tolbill,String memberID,String trainer)
    {
        
    
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("insert into "
                + "memberdatas (id,name,Birthday,PhoneNo,Address,Gender,FacebookAcc,Subscription,Amount,AmountStatus,PendingAmount,"
                + "StartDate,EndDate,Facility,TotalBill,MemberID,Trainer) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, getId());
        ps.setString(2, name);
        ps.setString(3,bd);
        ps.setString(4, ph);
        ps.setString(5,address);
        ps.setString(6,gender);
        ps.setString(7,fb);
        ps.setString(8,sup);
        ps.setInt(9,amount);
        ps.setString(10,amtStatus);
        ps.setInt(11,pamt);
        ps.setString(12,start);
        ps.setString(13,end);
        ps.setString(14,facility );
        ps.setInt(15,tolbill);
        ps.setString(16,memberID);
        ps.setString(17,trainer);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "information succefully entered to the database");
        
    } catch (SQLException ex) {
        Logger.getLogger(AddMemberFunc.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /*
    public String getMemberId(String name){
        
        fName=name;
        boolean b=true;
        String s=name.substring(0);
        
        int i=10000;
        while(b)
        {
           i=i; 
        }i++;
        memberID=s+i;
        return memberID;
    }
    
    public String getMID()
    {
        String s=getMemberId(memberID);
        
        return s;
    }
    */
    
    
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
}
    
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
