/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessgym;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TSS
 */
public class trainercbofun {
    
        Connection conn=new DBConnection().connect();
        
        PreparedStatement ps;
        ResultSet res;
        String dbTname[] = null;
        ResultSetMetaData rsmd;
        DefaultTableModel dm=new DefaultTableModel();
        
        public DefaultTableModel getData()
        {
        DefaultTableModel dm=new DefaultTableModel();
        
        try {
                ps=conn.prepareStatement("select Trainer from memberdatas;");
            
            res=ps.executeQuery();
            
            for(int i=0;res.next();i++){
                    dbTname[i]=res.getString(1);
                }
            
            Home h=new Home();
            String tname=h.getName();
            
            System.out.println("tttttttttttttttttt:"+tname);
            
            boolean more=res.next();
		if(more==false)
		{
			JOptionPane.showMessageDialog(null, "ResultSet contain no record");
                }
                else
                {
                    String sql="select Name,PhoneNo,Gender,FacebookAcc,Facility,Trainer from memberdata where Trainer='"+tname+"';";
                    ps=conn.prepareStatement(sql);
                    res=ps.executeQuery();
                    
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
                        return dm;
                }
            
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
}
