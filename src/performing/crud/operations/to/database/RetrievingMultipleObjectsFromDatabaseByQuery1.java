package performing.crud.operations.to.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrievingMultipleObjectsFromDatabaseByQuery1 {
	
	public static void main(String[] args) {
		
		// Check out SavingAndRetrievingAnObjectFromDatabase.class, 
		// before proceeding to read the example code in this class
		
		// configuring and creating a session factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.getCurrentSession();

		// 3.1. Retrieving all Objects from the Database,
		// by making a Query to the Database using HQL (Hibernate Query Language)
		// and returning ther results from that Query as a List
		// Then we are going to call their "getId()" and "getFirstName()" methods
		// and print the returned values from them in the Console
		// starting a new session
		session = sessionFactory.getCurrentSession();
		// starting a new transaction
		session.beginTransaction();
		// creating a List, where we will store all the Student objects
		// creating a Query to the Database (using HQL - Hibernate Query Language)
		// and returning the Query results as a List
		List<Student> myStudents = session.
				// by writing in the second parameter - Student.class,
				// in the ".createQuery() method", we will have Hibernate perform Type Checking for us
				// it will make sure returned objects from Database are really of Student type
				createQuery("from Student", Student.class).
				getResultList();
		// Iterating over each Student object and
		// calling their "getId()" and "getFirstName()" methods
		for(Student tempStudent: myStudents){
			System.out.println(tempStudent.getId() + " " + 
								tempStudent.getFirstName());
		}
		// ending the transaction
		session.getTransaction().commit();
		
		
		// 3.2. Retrieving all Student Objects from the Database,
		// whose last name is 'Baby', then printing their id, first and last name
		// starting a new session
		session = sessionFactory.getCurrentSession();
		// starting a new transaction
		session.beginTransaction();
		// retrieving Student objects from the database, 
		// whose last name is "Baby"
		List<Student> myStudents2 = session.
				// by writing in the second parameter - Student.class,
				// in the ".createQuery() method", we will have Hibernate perform Type Checking for us
				// it will make sure returned objects from Database are really of Student type
				createQuery("from Student tempStudent "
						+ "where tempStudent.lastName='Baby' ", Student.class).
				getResultList();
		
		// Iterating over each Student object and
		// calling their "getId()", "getFirstName()" and "getSecondName()" methods
		for(Student tempStudent: myStudents2) {
			System.out.println(tempStudent.getId() + " " + tempStudent.getFirstName() + " " + tempStudent.getLastName());
		}
		
		// ending the transaction
		session.getTransaction().commit();
		
	}
	
}
