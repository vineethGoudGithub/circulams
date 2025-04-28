package com.linkfi;

import java.sql.*;
import java.util.Scanner;

public class PrepareStatementEx {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			//Loading the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Creating Connection
			connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vineeth","java");
			
			PreparedStatement preparestatement=connection.prepareStatement("insert into npm values(?,?,?)");
			
			
			
			Scanner sc =new Scanner(System.in);
			while(true) {
				System.out.println("Enter npm id");
				 int nid=sc.nextInt();
				 
				 System.out.println("Enter npm name");
				 String nname=sc.next();
				 
				 System.out.println("Enter npm nsal");
				 int nsal=sc.nextInt();
				 
				 preparestatement.setInt(1, nid);
				 preparestatement.setString(2, nname);
				 preparestatement.setInt(3, nsal);
				 preparestatement.executeUpdate();
				 
				 System.out.println("Values Inserted auccessfully");
				 System.out.println("DO you want one more record (y/n)?");
				 String inex=sc.next();
				 
				 if(inex.equals("n")) {
					 break;
				 }
				
				 
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
