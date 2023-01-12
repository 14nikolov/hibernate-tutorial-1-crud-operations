package performing.crud.operations.to.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObjectsFromDatabase2 {
	
	public static void main(String[] args) {
		
		// For another way to delete an Object from the Database
		// please check out DeleteObjectsFromDatabase1.class
		
		// 6.2. Deleting a single or multiple objects from the Database,
		// by using an HQL Query
		// All we do is just execute 1 query and that is it, we are done
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		// DO NOT FORGET THE ".executeUpdate()" method 
		// Here we are going to delete every object from the
		// Database that has a lastName of "Smith"
		// If you want to delete only 1 specific object, then
		// instead of using an attribute such as lastName,
		// you should use the Primary Key (Id), since every
		// object in the database has a unique one
		session.createQuery
		("delete Student s where s.lastName='Smith' ").executeUpdate();
		
		session.getTransaction().commit();
		
		// Logging message
		System.out.println("Deletion of Student object with last name Num successful");
	}
	

}
