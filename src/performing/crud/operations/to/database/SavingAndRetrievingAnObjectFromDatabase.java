package performing.crud.operations.to.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SavingAndRetrievingAnObjectFromDatabase {
	
	public static void main(String[] args) {
		
		// creating a Student object and populating it's fields
		Student student = new Student("Emma", "Watson", "fakeemma@fakemail.com");
		// configuring and creating a session factory
		SessionFactory sessionFactory = new Configuration().
				// Telling the Factory which Configuration file to use/read
				configure("hibernate.cfg.xml").
				// Adding the Annotated Class
					// if you want to add more Annotated Classes, then you simply
					// continue the chain of methods by adding another ".addAnnotatedClass(Example.class)"
				addAnnotatedClass(Student.class).
				// Returns a SessionFactory Object
				buildSessionFactory();
		
		// 1. Saving an Object to the Database
		// creating a session
		Session session = sessionFactory.getCurrentSession();
		// starting a transaction
		session.beginTransaction();
		// saving an object to the MySQL database
		session.save(student);
		// ending the transaction
		session.getTransaction().commit();
		
		// 2.1. Retrieving the Object we just saved, from the Database
		// creating a new session
		session = sessionFactory.getCurrentSession();
		// starting a transaction
		session.beginTransaction();
		// getting current student object's primary key
		int primaryKey = student.getId();
		// retrieving an object from the MySQL database
		student = session.get(Student.class, primaryKey);
		// calling the object's "toString" method and 
		// printing the result in the console
		System.out.println(student.toString());
		// ending the transaction
		session.getTransaction().commit();
		
		// 2.2. Retrieving an Object, whose key we already know, from the Database
		// creating a new session
		session = sessionFactory.getCurrentSession();
		// starting a transaction
		session.beginTransaction();
		// retrieving an object from the MySQL database
		// based on it's id (primary key)
			// in this case, we will retrieve the first Student object
			// from the Database, because our database is configured 
			// to auto-increment, the id(primary key) value of each
			// newly added Student object
		Student student2 = session.get(Student.class, 11);
		// calling the object's "toString" method and 
		// printing the result in the console
		System.out.println(student2.toString());
		// ending the transaction
		session.getTransaction().commit();
		
	}
	
}
