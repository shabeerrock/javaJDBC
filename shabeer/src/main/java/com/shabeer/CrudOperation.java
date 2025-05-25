package com.shabeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation {

	public static void main(String[] args) throws Exception {
		  String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorksLT2019;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      Connection con = DriverManager.getConnection(url);
	      String query = "select * from SalesLT.Customer where CustomerID in(1,2)";
	      String ins = "insert into Employees values(2,'shabeer',1200)";
	      String upd = "update Employees set Salary = 5500 where EmployeeID = 1";
	      String del = "DELETE FROM EMPLOYEES WHERE EmployeeID = 15";
	      Statement st = con.createStatement();
	      // insert 
	      ResultSet  rs  = st.executeQuery(query); 
	      while(rs.next())
	      {
	    	  System.out.print(rs.getInt("CustomerID")+"-" );
	    	  System.out.println(rs.getString("FirstName")+"-" );
	      }
	      boolean status = st.execute(ins);
	      System.out.println(status);
	      boolean updstatus =  st.execute(upd);
	      System.out.println(updstatus);
	      boolean delStatus = st.execute(del);
	      con.close();
	      
	      //System.setProperty("java.library.path", "path_to_dll_folder");
	      System.out.println( "connection closed " );
	      

	}

}
