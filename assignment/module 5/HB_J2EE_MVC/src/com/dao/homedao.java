package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.usermodel;
import com.util.hbutil;

public class homedao {
	
	Session session=null;
	Transaction tx=null;
	usermodel model=null;
	public usermodel getverify(int uid)
	{
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			Query q=session.createQuery("from usermodel u where u.uid=:uid");
			q.setParameter("uid",uid);
			List<usermodel> list=q.list();
			model=list.get(0);
			
			tx.commit();
			session.close();
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return model;
	}
	
	int x=0;
	public int updateuser(usermodel hmodel)
	{
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			Query q=session.createQuery("update usermodel u set u.firstname=?0,u.lastname=?1,u.username=?2,u.password=?3 where u.uid=?4");
			q.setString(0,hmodel.getFirstname());
			q.setString(1,hmodel.getLastname());
			q.setString(2,hmodel.getUsername());
			q.setString(3,hmodel.getPassword());
			q.setInteger(4,hmodel.getUid());
			x=q.executeUpdate();
			tx.commit();
			session.close();
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return x;
	}
	
	public int deleteuser(int uid)
	{
		x=0;
	
		try {
			session=new hbutil().getsessiondata();
			tx=session.beginTransaction();
			Query q=session.createQuery("delete from usermodel u where u.uid=?0");
			q.setInteger(0,uid);
			x=q.executeUpdate();
			tx.commit();
			session.close();
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	return x;
	}
}
