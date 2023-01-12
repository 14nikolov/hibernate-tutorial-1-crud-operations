# hibernate-tutorial-1

To-do: Add this information as an Example class in the project
https://stackoverflow.com/a/4049758/18022139

---I. Project Purpose ----------------------------------------------------------------------------------- 
	
	- The project is based on Sections 18-21 from the Udemy course
	 Spring & Hibernate for Beginners (includes Spring Boot) by Chad Darby

	- Sections (18-21) as of the time of making this project are as follows:
		Section 18: Introduction to Hibernate
		Section 19: Setting Up Hibernate Development Environment
		Section 20: Hibernate Configuration with Annotations
		Section 21: Hibernate CRUD Features: Create, Read, Update and Delete
	
---II. Project requires:---------------------------------------------------------------------------------------
	
	- Used OS - Windows 11 Pro 22H2 
	- Eclipse IDE (Used Version: 2022-09 (4.25.0) Build id: 20220908-1902)
	- Java 8 or 11 (Used Version: 11)
	- MySQL Server (Used Version: 8.0.31 MySQL Community Server - GPL)
	- MySQL Workbench (Used Version: 8.0.31 build 2235049 CE (64 bits) Community)
	- MySQL Connector/J (Used Version: Platform Independent mysql-connector-j-8.0.31)
	- Hibernate ORM 5.6.x. (Used Version: 5.6.5)
	- hibernate.cfg.xml starter file 

--III. Concepts you need to know, before you dive in------------------------------------------------------------------------------
	
	1. What is Hibernate ORM?
	Hibernate ORM is an object–relational mapping tool for the Java programming language.
	It provides a framework for mapping an object-oriented domain model to a relational database.
	1.1. Simply said: 
	You have a Java application, which uses the Hibernate framework.
	The Hibernate framework is used for saving, and retrieving data from a database.
	2. What is JDBC?
	JDBC stands for Java Database Connectivity. 
	JDBC is a Java API used to connect to a database and perform operations with it.
	2.1. Why does it matter?
	Because under the hood Hibernate uses JDBC for everything.
	Hibernate is just an abstraction of JDBC, it saves us from writing low level code and etc.
	For a visual representation - see "image_1.png" in the project's root folder
	
---IV. Project Setup---------------------------------------------------------------------------------------------
	
	1. Download and install latest version of MySQL Server Community Edition and MySQL Workbench
		- IMPORTANT Note: do not follow the installation tutorial in the "Spring and Hibernate for Beginners course, it does not work) 
		- Follow this video tutorial instead: 
		https://youtu.be/OWro7Az0gAU
		the most important parts of the video are at 5:30 and 7:45,
		if you do not follow them exactly your installation will fail
	2. Create a Java Project
	3. Create a "lib" folder in "src" directory
	4. Download the Hibernate JARS ("Version 5.6.5.", if you are using Java 8 or 11),
	then make a copy of all the JARS in the "required" folder and paste them in our project's "lib" folder
	5. Download the Connector/J JAR from dev.mysql.com and paste it in our project's "lib" folder
	6. Add all of the jars from our project's "lib" folder to the Build Path of our project
	Right Click on Project -> Properties -> Java Build Path -> Libraries -> Classpath -> 
	Add Jars -> Our project's folder -> lib -> select all the jar files from "lib" -> ok -> apply and close
	7. Create a Hibernate Configuration XML File "hibernate.cfg.xml" or
	use the already made "hibernate.cfg.xml" file, provided from the "Spring & Hibernate for Beginners Course" 

---V. Testing our connection to the MySQL Database------------------------------------------------------------- 

	1. Make sure your MySQL server is running
		- open "Services.exe" in Windows
		- search for MySQL80 (name might differ, depending on installed version)
		- check if the service is running or stopped
	
	2. Create a new package and a new class inside it
		- for example: testing.connection.to.database
		- for example: TestConnection.java
		- Write the code you see in this project's TestConnection.java,
		 to see if you have established a connection to the database
	 
---VI. Performing CRUD Operations to the MySQL Database------------------------------------------------------------- 
	
	- CRUD stands for: Create, Read, Update, Delete
	
	1. Here we will learn how to store Java objects to the MySQL Database,
	read data as Objects from the Database, Update the data and Delete it.
		- everything is explained in detail in the package of this project named:
		"performing.crud.operations.to.database" 
		- order to read the classes in:
			1. Student.java
			2. SavingAndRetrievingAnObjectFromDatabase.java
			3. RetrievingMultipleObjectsFromDatabaseByQuery1.java
			4. RetrievingMultipleObjectsFromDatabaseByQuery2.java
			5. UpdatingOneDatabaseObject.java
			6. UpdatingMultipleDatabaseObjects.java
			7. DeleteObjectsFromDatabase1
			8. DeleteObjectsFromDatabase2
