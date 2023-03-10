package practice.activity8.hibernate.development;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	// Fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	// Constructors
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, String company) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}
	
	// toString method
	
	public String toString() {
		return "Object's ID: " + this.id +
				"\nObject's first name: " + this.firstName +
				"\nObject's last name: " + this.lastName +
				"\nObject's company: " + this.company;
	}
	
	// Fields' Getters and Setters
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="company")
	private String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
