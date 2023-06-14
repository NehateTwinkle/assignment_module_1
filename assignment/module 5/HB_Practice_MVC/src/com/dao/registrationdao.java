package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.hbutil;

public class registrationdao {
	
	Session session=null;
	Transaction tx=null;
	String msg="";
	
	public String userdata(usermodel umodel)
	{
		
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			session.save(umodel);
			tx.commit();
			session.close();
			msg="record inserted..";
		} catch (Exception e) {
			msg="error";
			e.printStackTrace();
			
		}
		return msg;
		
	}

}
