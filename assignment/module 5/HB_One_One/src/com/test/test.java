package com.test;

import com.dao.hbdao;
import com.model.Employee;
import com.model.ProfileDetails;

public class test {
	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		ProfileDetails p1=new ProfileDetails();
		p1.setAddress("c.g.road");
		p1.setDesg("trainner");
		dao.addprofile(p1);
		
		Employee e1=new Employee();
		e1.setEname("twinkle");
		e1.setCity("surat");
		e1.setProfile(p1);
		
		dao.addEmployee(e1);
	}

}
