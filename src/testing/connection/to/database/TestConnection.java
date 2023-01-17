package testing.connection.to.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	
	public static void main(String[] args) {
		
		try {
			// Logging Message for our Console
			System.out.println("Trying to establish connection to database");
			// Trying to establish connection to the database
			// Connection URL: 
				// The connection URL for the mysql database is 
				// jdbc:mysql://localhost:3306/sonoo
				// where jdbc is the API, 
				// mysql is the database, 
				// localhost is the server name on which mysql is running,
				// we may also use IP address, 3306 is the port number 
				// hb_student_tracker is the database name. 
				// "hbstudent" is the username
				// "hbstudent" is the password
			@SuppressWarnings("unused")
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hibernate-tutorial-1-crud-operations", 
			        "hbstudent", "hbstudent");
			// Logging Message for our Console
			System.out.println("Sucessfully established connection to database");
		} catch (SQLException e) {
			// Logging Message for our Console
			System.out.println("Failed connection to database");
			// Prints the cause of the Exception
			e.printStackTrace();
		};
		
	}
	
}
