/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessgym;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TSS
 */
public class GetMemInfos {
    Connection conn = new DBConnection().connect();
    String [] results = new String[13];
    int [] cal=new int[3];
    
    private static String name,birth,contact, address,gender, fbAcc , subscription,amtstatus,startD,endD,facility,trainer,mID;
    private static int amount,tolamt,pendamt;
    /**
     *
     * @param SearchName
     * @return
     */
    public String[] search(String SearchID) {
        if(SearchID == ""){
            JOptionPane.showMessageDialog(null,"please enter an id number to search member details" );
        }
        else{
            try {
            String sql1 = "Select * from memberdatas Where MemberID = ?";
            
                PreparedStatement ps;
                
                ps = conn.prepareStatement(sql1);
                
                ps.setString(1, SearchID);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    name = rs.getString("Name");
                    birth = rs.getString("Birthday");
                    contact = rs.getString("PhoneNo");
                    address = rs.getString("Address");
                    gender = rs.getString("Gender");
                    fbAcc = rs.getString("FaceBookAcc");
                    subscription = rs.getString("Subscription");
                    amount = rs.getInt("Amount");
                    amtstatus = rs.getString("AmountStatus");
                    pendamt = rs.getInt("PendingAmount");
                    startD = rs.getString("StartDate");
                    endD = rs.getString("EndDate");
                    facility = rs.getString("Facility");
                    trainer=rs.getString("Trainer");
                    tolamt = rs.getInt("TotalBill");
                    mID = rs.getString("MemberID");
                    
                }
                
                else{
                 JOptionPane.showMessageDialog(null,"there is no "+SearchID+" inside the database" ); 
             }
                
             System.out.println("*************"+mID);
             
         String [] r  = {name,birth,contact,address,gender, fbAcc , subscription,amtstatus,startD,endD,facility,trainer,mID};
         int [] i={amount,tolamt,pendamt};
            System.arraycopy(r, 0, results, 0, 13);
            System.arraycopy(i, 0, cal, 0, 3);
        
    return results;
    }catch(SQLException | HeadlessException c ){
             JOptionPane.showMessageDialog(null,"error search "+c );
        }
    return results;
    }
        return results;
    }
    
    /**
     *
     * @param SearchID
     * @return
     */
    public int[] searchAmt(String SearchID) {
        if(SearchID == ""){
            JOptionPane.showMessageDialog(null,"please enter an id number to search member details" );
        }  
       
        else{
            try {
            String sql1 = "Select * from memberdatas Where MemberID = ?";
            
                PreparedStatement ps;
                
                ps = conn.prepareStatement(sql1);
                
                ps.setString(1, SearchID);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    amount = rs.getInt("Amount");
                    pendamt = rs.getInt("PendingAmount");
                    tolamt = rs.getInt("TotalBill");   
                }
                
                
             System.out.println("*************"+mID);
             
            
            
            
        
         String [] r  = {name,birth,contact, address,gender, fbAcc , subscription,amtstatus,startD,endD,trainer,mID};
         int [] i={amount,tolamt,pendamt};
            System.arraycopy(r, 0, results, 0, 12);
            System.arraycopy(i, 0, cal, 0, 3);

    return cal;
    }catch(SQLException | HeadlessException c ){
             JOptionPane.showMessageDialog(null,"error search "+c );
        }
    return cal;
    }
        return cal;
    }
    

    void searchByID(String SearchID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
