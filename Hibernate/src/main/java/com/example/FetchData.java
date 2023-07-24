package com.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration().configure("configuration.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(AdhaarCard.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
		
		// if the data is not present then get() will return null
		Employee emp = session.get(Employee.class, 3);
		System.out.println(emp);
		
		// if the data is not present then load() will return ObjectNotFoundException
//        Employee emp1 = session.load(Employee.class, 2);
//		System.out.println(emp1);
		
		
		// if the data is not present then get() will return null
		Employee emp1 = session.find(Employee.class, 2);
	System.out.println(emp1);
		
		
		
		
//		AdhaarCard e = session.load(AdhaarCard.class, 1);
//		e.setAddress("Mangalore");
//		
//		transaction.begin();
//		session.save(e);
//		transaction.commit();
//		System.out.println(e);
//		
//		Employee a = session.get(Employee.class, 2);
//		transaction.begin();
//		session.delete(a);
//		transaction.commit();
//		System.out.println(a);
		
		
		
		
		
		
	


	}
}
