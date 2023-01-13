package practice.activity8.hibernate.development;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveAllObjectsFromCertainCompanyUsingQueryApp {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Employee.class).
				buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
//		List<Employee> employeesList = session.createQuery("from Employee tempEmployee where tempEmployee.company='GreatCompany' ");
		List<Employee> employeesList = session.createQuery
				("from Employee tempEmployee where "
				+ "tempEmployee.company='GreatCompany' ", Employee.class).
				getResultList();
		
		for(Employee tempEmployee: employeesList) {
			
			System.out.println("\n" + tempEmployee.toString() + "\n");
		}
		
		session.getTransaction().commit();
		
	}
	
}
