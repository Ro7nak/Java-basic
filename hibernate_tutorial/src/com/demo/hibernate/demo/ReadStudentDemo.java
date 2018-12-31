package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.studentEntity.Student_Entity;


public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student_Entity.class)
				.buildSessionFactory();
		
		// create session
		
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object to save java object
			
			//Create student object
			System.out.println("Create new Student Object");
			Student_Entity tempStu = new Student_Entity("Daffy", "Duck", "daffy@demo.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the student object");
			System.out.println(tempStu);
			session.save(tempStu);
			
			//commit transaction
			session.getTransaction().commit();
			
			//new code
			
			// find student's id:Primary Key
			System.out.println("Saved student. Generate id: "+tempStu.getId());
			
			//now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id
			System.out.println("\nGetting student with id: "+tempStu.getId());
			Student_Entity myStudent = session.get(Student_Entity.class,tempStu.getId());
			System.out.println("Get complete: " + myStudent );
			
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
