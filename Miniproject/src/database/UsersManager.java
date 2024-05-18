package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsersManager {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/cricket";
		String username = "root";
		String password = "123456";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 

}
