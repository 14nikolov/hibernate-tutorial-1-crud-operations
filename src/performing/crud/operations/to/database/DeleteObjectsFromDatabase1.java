package performing.crud.operations.to.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObjectsFromDatabase1 {
	
	public static void main(String[] args) {
		
		// 6.1. Deleting a single object from the Database, 
		// using a Java method from the class Session
		// First we retrieve the object from the Database and store it in a java variable
		// then we pass in the student object in this method "session.delete(object)"
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		// Here we are getting the 5th Student object from the Database
		// and mapping it to our variable student, so we can work with the data
		Student student = session.get(Student.class, 8);
		
		// Here we are deleting the student from the Database
		// Now if you go to look at the Database you will see that we no longer
		// have a Student object at the index, that was earlier occupied by that student
		session.delete(student);
		
		session.getTransaction().commit();

		
	}
	
}
