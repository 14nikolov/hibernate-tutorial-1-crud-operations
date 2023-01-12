package performing.crud.operations.to.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdatingMultipleDatabaseObject {
	
	public static void main(String[] args) {
		
		// 5. Updating the data of a multiple objects
		// from the Database
		// In this case we are going to Update all Student Objects
		// whose email ends with "@gmail.com" to
		// "foobar@gmail.com"
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		// Here is where the Updating part happens
		// pay attention to the chained ".executedUpdate()" method, we need it
		session.createQuery("update Student s set email='foobar@gmail.com'"
				+ " where email like '%@gmail.com' ").executeUpdate();

		// ending transaction to save changes
		session.getTransaction().commit();
		
		// Logging Message
		System.out.println("firstName, lastName and email of object number 5"
				+ " in the database have been updated. Refresh your database to see the changes.");
	}
	
}
