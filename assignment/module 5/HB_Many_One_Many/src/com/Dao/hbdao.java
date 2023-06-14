package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Util.hbutil;
import com.model.Department;
import com.model.employee;

public class hbdao
{
    Session session=null;
    Transaction tx=null;
    public void addemployee(employee e1)
    {
    	session=new hbutil().getsessiondata();
    	tx=session.beginTransaction();
    	session.save(e1);
    	tx.commit();
    	session.close();
    	System.out.println("employee recorded..");
    	
    }
    public void adddepartment(Department d1) 
    {
    	session=new hbutil().getsessiondata();
    	tx=session.beginTransaction();
    	session.save(d1);
    	tx.commit();
    	session.close();
    	System.out.println("department recorded..");
    	
	}
}
