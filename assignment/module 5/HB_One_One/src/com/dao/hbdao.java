package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.model.ProfileDetails;
import com.util.hbutil;

public class hbdao {
	
	Session session=null;
	Transaction tx=null;
	public void addEmployee(Employee e1)
	{
		session=new hbutil().getsessiondata();
		tx=session.beginTransaction();
		session.save(e1);
		tx.commit();
		session.close();
		System.out.println("employee record inserted..");
		
	}
	public void addprofile(ProfileDetails p1)
	{
		session=new hbutil().getsessiondata();
		tx=session.beginTransaction();
		session.save(p1);
		tx.commit();
		session.close();
		System.out.println("profile record inserted..");
		
	}

}
