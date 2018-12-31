package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.studentEntity.Student_Entity;

public class PrimaryKeyDemo {

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
					
			//create student object
					System.out.println("Creating new Student Object");
					Student_Entity tempStu1 = new Student_Entity("Paul", "Wall", "paul@demo.com");
					Student_Entity tempStu2 = new Student_Entity("John", "Doe", "John@demo.com");
					Student_Entity tempStu3 = new Student_Entity("Mary", "Page", "Mary@demo.com");
					Student_Entity tempStu4 = new Student_Entity("Jack", "Ripper", "Jack@demo.com");
					
					//start a transaction
					session.beginTransaction();
					
					//save the student object
					System.out.println("Saving the student object");
					session.save(tempStu1);
					session.save(tempStu2);
					session.save(tempStu3);
					session.save(tempStu4);
					
					//commit transaction
					session.getTransaction().commit();
					System.out.println("Done!");
					
				} finally {
					factory.close();
				}
				

	}

}
