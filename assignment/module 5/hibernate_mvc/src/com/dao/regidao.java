package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.user;
import com.util.HButil;

public class regidao 
{
   Session session=null;
   Transaction tx=null;
   String msg="";
   public String getregistration(user u) 
   {
	   try {
		   session=new HButil().getsessiondata();
		   tx=session.beginTransaction();
		   session.save(u);
		   tx.commit();
		   msg="record inserted..";
		
	} catch (Exception e)
	   {
		msg="error";
		e.printStackTrace();
	}
	  
	   
	return msg;
	
}
}
