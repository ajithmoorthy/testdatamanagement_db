package com.atmecs.atmecs_automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseReader {
	ResultSet rs; 
	Statement stmt;
	Connection con;
	public void dbConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
    	String connectionUrl = "jdbc:sqlserver://ATMECSINLT-085\\SQLEXPRESS;database=testdata;integratedSecurity=true;";  
    	con = DriverManager.getConnection(connectionUrl);  
    	System.out.println("connection is estabilished");
	}
	public void insertQuery() throws SQLException {
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM [dbo].[footer]";
	    rs = stmt.executeQuery(sql);
	    int count=0;
	    while(rs.next()) {
	    	System.out.println(rs.getString("sitemap")+"\n"+rs.getString("home")+"\n"+rs.getString("aboutus")+"\n"+rs.getString("services")+"\n"+rs.getString("partners")+"\n"+rs.getString("casestudies")+"\n"+rs.getString("news")+"\n"+rs.getString("careers")+"\n"+rs.getString("contactus")
	    			);
	    	count++;
	    }
	}

}
