package training.session.jdbc.com;

import java.sql.*;

import com.mysql.jdbc.PreparedStatement;  
class MysqlCon{  
public static void main(String args[]){
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
	     //insert
		String sql = "insert into emp (eid,ename,ecity,esal)values (?,?,?,?)";
	    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
	     statement.setInt(1,5);
	     statement.setString(2,"ishwari");
	     statement.setString(3, "kopargaon");
	     statement.setInt(4, 10000);
	     
	     statement.executeUpdate();
    	 
	    conn.close();
		}catch(Exception e)
	    { 
			 
		   System.out.println(e);
		} 
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
	     //update
		String sql = "update emp SET ename =?,ecity = ?,esal = ? WHERE eid = ?";
	    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
	  
	     statement.setString(1, "ishwari");
	     statement.setString(2,"pune");
	     statement.setInt(3,15000);
	     
	     statement.setInt(4,5); //update by eid
	     
	     statement.executeUpdate();
    	 
	    conn.close();
		}catch(Exception e)
	    { 
			 
		   System.out.println(e);
		} 
	
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
	     //delete
		String sql = "delete from emp where eid = ?";
	    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
	     statement.setInt(1,3);
	     statement.executeUpdate();
    	 
	    conn.close();
		}catch(Exception e)
	    { 
			 
		   System.out.println(e);
		} 
	

	try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
Statement stmt=con.createStatement();  
//select
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ " "+rs.getInt(4));  
con.close();   
}catch(Exception e){ System.out.println(e);}  
}


}  