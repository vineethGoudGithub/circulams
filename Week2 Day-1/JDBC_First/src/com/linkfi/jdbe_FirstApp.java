package com.linkfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbe_FirstApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the driver 
		Connection connection=null;
		Statement statement=null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("Driver loaded succcessfully ");
		//Connecting
		 connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe 	","vineeth","java");
		System.out.println("CONNECTION CREATED SUCCESSFULLY!"+connection);
        
		//statement 
//		String s1="create table npm(nid number,nname varchar(20),nsal number)";
		String s2="insert into npm values(1,'vineeth',50000)";
		String s3="insert into npm values(2,'raju',60000)";
		String s4="insert into npm values(3,'mukesh',33000)";
		String s5="insert into npm values(4,'akhil',45000)";
		//Process the Query
		 statement=connection.createStatement();
//		 int x=statement.executeUpdate(s1);
	     String s1="select * from npm";
	     
	      ResultSet set =statement.executeQuery(s1);
	      
	      while(set.next()) {
	    	  System.out.println(set.getInt(1)+" "+set.getString("nname")+" "+set.getInt(3 ));
	      }
		
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
		//close the resources
		
			
			try {
			if(statement!=null)statement.close();
			if(connection !=null)connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	
		
		
		
		}


}
