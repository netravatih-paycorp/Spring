package com.example;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("fghjk");

		Configuration cfg = new Configuration().configure("configuration.xml")
		.addAnnotatedClass(Employee.class).addAnnotatedClass(AdhaarCard.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
	

		
		
		Employee emp = new Employee();
		emp.setName("Guru");
		emp.setPhno(9987653420l);
		emp.setEmail("guru@gmail.com");
		
		AdhaarCard card= new AdhaarCard();
		card.setAno(433599179657l);
		card.setAddress("Gadag");
		
		emp.setCard(card);

		transaction.begin();
		session.save(emp);
		session.save(card);
		transaction.commit();
		
		 Query<Employee>e = session.createQuery("from Employee");
		    List<Employee> list = e.getResultList();
		    System.out.println(list);
			
		
		
	}
}
