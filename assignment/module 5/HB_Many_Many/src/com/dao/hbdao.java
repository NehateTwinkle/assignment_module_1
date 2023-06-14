package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Students;
import com.model.Subjects;
import com.util.hbutil;

public class hbdao {
	
	Session session=null;
	Transaction tx=null;
	public void addsub(Subjects s1)
	{
		session=new hbutil().getsessiondata();
		tx=session.beginTransaction();
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("subject record inserted...");
		
	}

	public void addstudent(Students ss1)
	{
		session=new hbutil().getsessiondata();
		tx=session.beginTransaction();
		session.save(ss1);
		tx.commit();
		session.close();
		System.out.println("student record inserted...");
		
	}

}
