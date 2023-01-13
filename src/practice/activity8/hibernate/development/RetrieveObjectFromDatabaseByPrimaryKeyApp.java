package practice.activity8.hibernate.development;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveObjectFromDatabaseByPrimaryKeyApp {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 1);
		System.out.println("\nSuccessfully retrieved Object from Database");
		
		System.out.println("\nTrying to call the Object's toString method:");
		System.out.println("\n" + employee.toString());
		System.out.println("\nSuccessfully called the Object's toString method");
		
		session.getTransaction().commit();
		System.out.println("\nSuccesfully completed transaction!");
	}
	
}
