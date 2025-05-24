package com.shabeer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
    
    //JDBC Driver need to install
    /*
     * import
     * load & register
     * create connection
     * prepare statement
     * excuete statement
     * procss the result
     * close connection
     */
      String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorksLT2019;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Connection con = DriverManager.getConnection(url);
      String query = "select * from SalesLT.Customer where CustomerID in(1,2)";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      
      while(rs.next())
      {
    	  System.out.print(rs.getInt("CustomerID")+"-" );
    	  System.out.println(rs.getString("FirstName")+"-" );
      }
      
      //System.setProperty("java.library.path", "path_to_dll_folder");
      System.out.println( "checking" );
      
        
    }
    
}
