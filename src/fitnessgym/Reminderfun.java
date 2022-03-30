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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TSS
 */
public class Reminderfun {
    Connection cnn=new DBConnection().connect();
    PreparedStatement pst;
    ResultSet res;
    ResultSetMetaData rsmd;
    
        
  // private static String name,bd,contact,gender, fbAcc ,subscription,facility,trainer,mID;
   
   
   public DefaultTableModel getData()
    {
        DefaultTableModel dm=new DefaultTableModel();
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            String sql="select Name,Birthday,PhoneNo,Gender,FacebookAcc,Subscription,Facility,Trainer,MemberID "
                    + "from memberdatas where DATE_FORMAT(Birthday,'%m')=DATE_FORMAT(NOW(),'%m')";
            pst=cnn.prepareStatement(sql);
            res=pst.executeQuery();
            //DisplayResultSet(res);
            boolean more=res.next();
		if(more==false)
		{
			System.out.println("no records in resultSet!!");//setTitle("No record to dispaly");
		}
                else{
		Vector rows=new Vector();
		Vector cols=new Vector();
			rsmd=res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				cols.addElement(rsmd.getColumnName(i));
                                
			}
			do{
				rows.addElement(getNextRow(res,rsmd));
                               
			}while(res.next());
                        dm=new DefaultTableModel(rows,cols);
                }
                        return dm;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
           return null;
    }
   
    public Vector getNextRow(ResultSet rs,ResultSetMetaData rsmd) throws SQLException
	{
		Vector tmp=new Vector();
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			switch(rsmd.getColumnType(i))
			{
			case Types.VARCHAR:tmp.addElement(rs.getString(i));break;
			case Types.INTEGER:tmp.addElement(new Long(rs.getLong(i)));break;
			case Types.DOUBLE:tmp.addElement(new Double(rs.getDouble(i)));break;
			case Types.DECIMAL:tmp.addElement(new Long(rs.getInt(i)));break;
			//default:JOptionPane.showMessageDialog(null, "Type was"+rsmd.getColumnTypeName(i));
			}
		}
		return tmp;
	}
    void searchByID(String SearchID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
