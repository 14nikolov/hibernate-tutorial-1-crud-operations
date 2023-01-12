package performing.crud.operations.to.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity - a simple java class which is mapped to a database table
@Entity
// @Table - the database table, that our java object is mapped to
@Table(name="student")
public class Student {
	
	// Constructors
	
	// We need to explicitly define a no-argument Constructor for our Entity Class
	public Student() {}
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	// Fields
	
	// @Id - this field of our java class will be our primary key
	// The primary key is used to retrieve an object from the database
	// In our MySQL database we have configured a column "id", which we have
	// set as our Primary Key. The name we use to represent this column "id",
	// in our java class, happens to be the same a.k.a. "id" again, but it can be
	// whatever, the important part is to map it correctly using the @Column
	// and really important part is to use the @Id annotation.
	@Id
	// @GeneratedValue - this specifies the strategy that is used to generate ID values
	// GenerationType.Identity will let MySQL choose how to increment the IDs
	// we can also not explicitly use @GeneratedValue to define a strategy 
	// and Hibernate will automatically choose the best one it can think of
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column - maps our java class field to a specific column in the database
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	
	// toString() method - we will mostly use it for debugging
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	// Getters and Setters
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
