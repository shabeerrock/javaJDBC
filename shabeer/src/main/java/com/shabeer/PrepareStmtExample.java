package com.shabeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStmtExample {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorksLT2019;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection con = DriverManager.getConnection(url);
	    String sql = "insert into Employees values( ?,?,?)";
	    PreparedStatement ps  = con.prepareStatement(sql);
	    ps.setInt(1, 5);
	    ps.setString(2, "gopinath");
	    ps.setInt(3,2000);
	    ps.execute();
	    con.close();
	    System.out.println("connection closed");
	    

	}

}
