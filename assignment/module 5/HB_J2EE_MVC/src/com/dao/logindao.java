package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.usermodel;
import com.util.hbutil;

public class logindao {
	
	Session session=null;
	Transaction tx=null;
	usermodel model=null;
	public usermodel getlogin(usermodel lmodel)
	{
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			Query q=session.createQuery("from usermodel u where u.username=:username and u.password=:password");
			q.setParameter("username",lmodel.getUsername());
			q.setParameter("password",lmodel.getPassword());
			List<usermodel>list=q.list();
			model=list.get(0);
			tx.commit();
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
			model=null;
		}
		
		
		return model;
	}

}


