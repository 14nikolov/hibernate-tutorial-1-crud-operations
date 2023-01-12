package performing.crud.operations.to.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdatingOneDatabaseObject {
	
	public static void main(String[] args) {
		
		// 4. Updating the data of a single object
		// from the Database
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		// Retrieving the fifth Student object from the Database
		// "5" is the primary key
		Student student = session.get(Student.class, 5);
		
		// Just calling the setter methods on the retrieved object
		// nothing else is required for us to Update the object
		// there are no save methods or other such stuff
		student.setFirstName("Sam");
		student.setLastName("Zimmern");
		student.setEmail("lorem@dreamy.xyz");
		
		// ending transaction to save changes
		session.getTransaction().commit();
		
		// Logging Message
		System.out.println("firstName, lastName and email of object number 5"
				+ "in the database have been updated. Refresh your database to see the changes.");
	}
	
}
