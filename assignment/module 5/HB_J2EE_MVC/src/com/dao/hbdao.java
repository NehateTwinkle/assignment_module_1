package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.hbutil;

public class hbdao {
	
	Session session=null;
	Transaction tx=null;
	String msg="";
	public String getregistration(usermodel umodel)
	{
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			session.save(umodel);
			tx.commit();
		
			msg="record inserted";
		} catch (Exception e) {
			msg="error";
			e.printStackTrace();
		}
		
		
		return msg;
	}

}
