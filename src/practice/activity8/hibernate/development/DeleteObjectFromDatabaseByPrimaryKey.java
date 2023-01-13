package practice.activity8.hibernate.development;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObjectFromDatabaseByPrimaryKey {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		// Deleting Employee Object with id=4, from the Database Table
		session.createQuery("delete Employee e where e.id='4' ").executeUpdate();
		
		session.getTransaction().commit();
		
	}
	
}
