package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HButil;

public class HBDao
{
      Session session=null;
      Transaction tx=null;
      public void addEmployee(Employee e1)
      {
    	  session=new HButil().getsessiondata();
    	  tx=session.beginTransaction();
    	  session.save(e1);
    	  tx.commit();
    	  session.close();
    	  System.out.println("record inserted successfully..");
      }
      
      public void updateEmployee(Employee e1)
      {
    	  session=new HButil().getsessiondata();
    	  tx=session.beginTransaction();
    	  session.update(e1);
    	  tx.commit();
    	  session.close();
    	  System.out.println("record updated successfully..");
      }
      
      public void deleteEmployee(Employee e1)
      {
    	  session=new HButil().getsessiondata();
    	  tx=session.beginTransaction();
    	  session.delete(e1);
    	  tx.commit();
    	  session.close();
    	  System.out.println("record inserted successfully..");
      }
      
      
      
      
      
}
