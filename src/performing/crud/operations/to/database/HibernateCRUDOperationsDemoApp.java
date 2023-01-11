package performing.crud.operations.to.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCRUDOperationsDemoApp {
	
	public static void main(String[] args) {
		
		// creating a Student object and populating it's fields
		Student student = new Student("Emma", "Watson", "fakeemma@fakemail.com");
		// creating a session factory and configuring it
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
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
		Student student2 = session.get(Student.class, 12);
		// calling the object's "toString" method and 
		// printing the result in the console
		System.out.println(student2.toString());
		// ending the transaction
		session.getTransaction().commit();
		
		// 3. Retrieving all Objects from the Database,
		// calling their "getId()" and "getFirstName()" methods
		// and printing them in the Console
		// starting a new session
		session = sessionFactory.getCurrentSession();
		// starting a new transaction
		session.beginTransaction();
		// creating a List, where we will store all the Student objects
		// creating a Query to the Database (using HQL - Hibernate Query Language)
		// and returning the Query results as a List
		List<Student> myStudents = session.
				createQuery("from Student", Student.class).
				getResultList();
		// Iterating over each Student object and
		// calling their "getId()" and "getFirstName()" methods
		for(Student tempStudent: myStudents){
			System.out.println(tempStudent.getId() + " " + 
								tempStudent.getFirstName());
		}
	}
	
}
