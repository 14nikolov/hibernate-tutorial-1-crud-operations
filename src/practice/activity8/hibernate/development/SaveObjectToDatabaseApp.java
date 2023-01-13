package practice.activity8.hibernate.development;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveObjectToDatabaseApp {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee employee = new Employee("Howard", "Rowdy", "Nike");
		System.out.println("Created an Employee Object");
		session.save(employee);
		
		session.getTransaction().commit();
		System.out.println("Sucessfully Saved Employee Object to Database");

	}
	
}
