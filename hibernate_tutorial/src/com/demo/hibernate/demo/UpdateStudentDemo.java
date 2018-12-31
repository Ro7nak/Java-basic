package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.studentEntity.Student_Entity;


public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student_Entity.class)
				.buildSessionFactory();
		
		// create session
		
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			
			// get new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on the id: primary key
			System.out.println("\ngetting student with id: " +studentId);
			Student_Entity myStudent = session.get(Student_Entity.class, studentId);
			System.out.println("\nget complete "+ myStudent);
			
			// updating student using set method in entity class
			System.out.println("\nUpdating student");
			myStudent.setFirstName("Scooby");
			
			//commit transaction
			session.getTransaction().commit();
			//System.out.println("\nDone!");
			
			//checking update
			session = factory.getCurrentSession();
			session.beginTransaction();
			myStudent = session.get(Student_Entity.class, studentId);
			System.out.println("\nUpdate check: "+myStudent);
			session.getTransaction().commit();
			
			// NEW CODE
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//update email for all student
			System.out.println("\n\n\nUpdate email for all Student");
			session.createQuery("update Student_Entity set email = 'foo@gmail.com'")
					.executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
