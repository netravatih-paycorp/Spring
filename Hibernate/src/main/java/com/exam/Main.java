package com.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure("configuration.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(Name.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        
//        Name name= new Name();
//        name.setFirst_name("vinaya");
//        name.setMiddle_name("Vishwanath");
//        name.setLast_name("Hiremath");
//        
//        Student s = new Student();
//        s.setEmail("vinaya@gmail.com");
//        s.setPhno(9945333290l);
//        s.setName(name);
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/new.xml");
//        
        transaction.begin();
        session.persist(context.getBean("student"));
//        session.persist(name);
        transaction.commit();
		
	}
}
