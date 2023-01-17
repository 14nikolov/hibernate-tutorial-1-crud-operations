package practice.activity8.hibernate.development;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectionToDatabaseDemoApp {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Trying to establish a connection to the Database!");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hibernate-tutorial-1-crud-operations?user=hbstudent&password=hbstudent");
			System.out.println("\nSuccessfully established a connection to the Database!");

		} catch (SQLException e) {
			System.out.println("\nFailed to establish a connection to the Database!\n");
			e.printStackTrace();
		}
		
	}
	
}
