package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s1=new Student();
		s1.setSid(3);
		s1.setSname("Darshil");
		s1.setCity("Ahmedabad");
		s1.setDegree("12th running");
		
		session.save(s1);
		tx.commit();
		System.out.println("Student record inserted..");
		session.close();
	}

}
