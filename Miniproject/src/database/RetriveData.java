package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/cricket";
		String username = "root";
		String password = "123456";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM cricket";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String Player_name = result.getString(2);
			    String Matches_played = result.getString(3);
			    String Total_score = result.getString(4);
			 
			    String output = "User #%d: %s - %s - %s";
			    System.out.println(String.format(output, ++count, Player_name, Matches_played, Total_score));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
