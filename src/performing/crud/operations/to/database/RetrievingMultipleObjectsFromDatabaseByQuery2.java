package performing.crud.operations.to.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrievingMultipleObjectsFromDatabaseByQuery2 {

	public static void main(String[] args) {

		// Check out SavingAndRetrievingAnObjectFromDatabase.class
		// and RetrievingMultipleObjectsFromDatabaseByQuery1.class
		// before proceeding to read the example code in this class
		// one of the reasons being much less explanatory comments
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		// 3.3. Retrieving all Student Objects from the Database,
		// whose email ends with '@emailfake.com', 
		// then printing their id, first and last name
		// starting a new session
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		
		// Retrieving only the 
		List<Student> studentsList = session.
				// by writing in the second parameter - Student.class,
				// in the ".createQuery() method", we will have Hibernate perform Type Checking for us
				// it will make sure returned objects from Database are really of Student type
				createQuery(" from Student student where "
						// "%" symbol in (LIKE '%@emailfake.com'),
						// stands for "ends with"
						// in this case we make a query to the Database
						// and we want it to return Student objects, whose
						// email addresses end with "@emailfake.com"
						+ "student.email LIKE '%@emailfake.com' ",
						Student.class).
				getResultList();
		
		// Logging message
		System.out.println("Printing all the students, whose email ends with \"@emailfake.com\" ");
		
		for(Student tempStudent: studentsList) {
			System.out.println(tempStudent.getId() + " " +
		tempStudent.getFirstName() + " " + tempStudent.getLastName());
		}
		
		session.getTransaction().commit();
		
	}
	
}
