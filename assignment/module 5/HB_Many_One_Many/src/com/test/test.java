package com.test;

import com.Dao.hbdao;
import com.model.Department;
import com.model.employee;

public class test
{
  public static void main(String[] args) 
  {
	hbdao dao=new hbdao();
	Department d1=new Department();
	d1.setDname("Software");
	dao.adddepartment(d1);
	
	employee e1=new employee();
	e1.setEname("darshil");
	e1.setCity("pune");
	e1.setDep(d1);
	dao.addemployee(e1);
	
	employee e2=new employee();
	e2.setEname("khushbu");
	e2.setCity("surat");
	e2.setDep(d1);
	dao.addemployee(e2);
 }
}
