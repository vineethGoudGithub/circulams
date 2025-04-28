package com.linkfi;
import java.sql.*;
import java.util.*;
public class SecondApp {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			//Load The Diver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Create The Connection
			connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vineeth","java");
			statement =connection.createStatement();
			
			Scanner sc =new Scanner(System.in);
			while(true) {
				System.out.println("Enter npm id");
				 int nid=sc.nextInt();
				 
				 System.out.println("Enter npm name");
				 String nname=sc.next();
				 
				 System.out.println("Enter npm nsal");
				 int nsal=sc.nextInt();
				 
				 String query = "INSERT INTO npm VALUES (" + nid + ", '" + nname + "', " + nsal + ")";

				 System.out.println(query);
				 statement.executeUpdate(query);
				 System.out.println("VALUES ARE INSERTED SUCCESSFULLY");
				 System.out.println("Would you like to insert one more Record (Yes/no) ?");
				 String option=sc.next();
				 if(option.equals("no")) {
					 break;
				 }
				 
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		

	}

}
