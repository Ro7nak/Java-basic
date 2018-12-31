package com.demo.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.studentEntity.Student_Entity;


public class QueryStudentDemo {

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
			
			//start a transaction
			session.beginTransaction();
			
			//query the student
			List<Student_Entity> theStudents = session.createQuery("from Student_Entity").list();
			
			//display the students
			displayStudemts(theStudents);
			
			//query student: last name:doe
			theStudents = session.createQuery("from Student_Entity s where s.lastName='Doe'").list();
			
			//display student
			System.out.println("\n\nStudent who has last name of Doe");
			displayStudemts(theStudents);
			
			//query student : last name='Doe' or first name:'daffy'
			theStudents = session.createQuery("from Student_Entity s "
					+ "where s.lastName='Doe' OR s.firstName='Daffy'").list();
			
			//display student
			System.out.println("\n\nStudent who has last name of Doe or first name of Daffy");
			displayStudemts(theStudents);
			
			//query student : email like '%demo.com'
			theStudents = session.createQuery("from Student_Entity s "
					+ "where s.email like '%demo.com'").list();
			
			//display student
			System.out.println("\n\nStudent who has email like %demo.com");
			displayStudemts(theStudents);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			System.out.println("\n\nDone!");
			
		} finally {
			factory.close();
		}
		
	}

	private static void displayStudemts(List<Student_Entity> theStudents) {
		for (Student_Entity student_Entity : theStudents) {
			System.out.println(student_Entity);
		}
	}

}
