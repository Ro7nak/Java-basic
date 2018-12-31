package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.studentEntity.Student_Entity;


public class DeleteStudentDemo {

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
			
			//start a transaction
			session.beginTransaction();
			
			// retrieve the student object
			Student_Entity myStudent = session.get(Student_Entity.class, studentId);

			//Deleting student object
			System.out.println("Deleting student "+myStudent);
			session.delete(myStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("\n\nDone!");
			
			// NEW CODE
			
			//creating new session
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//delete query
			session.createQuery("delete Student_Entity where id = 2").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

}
