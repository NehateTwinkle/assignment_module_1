package com.test;

import java.util.Scanner;

import com.dao.HBDao;
import com.model.Employee;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		HBDao dao=new HBDao();
		Employee e1=new Employee();
		System.out.println("enter your information");
		
		e1.setEid(sc.nextInt());
		System.out.println("enter your name");
		e1.setEname(sc1.nextLine());
		System.out.println("enter your mobile number");
		e1.setMobile(sc.next());
	     System.out.println("enter your city");
		e1.setCity(sc.next());
		System.out.println("enter your email address");
		e1.setEmail(sc.next());
		System.out.println("enter 1 for insert...");
		System.out.println("enter 2 for update...");
		System.out.println("enter 3 for delete...");
		System.out.println("enter 4 for exit...");
		int x=sc.nextInt();
	if(x==1)
	{
		dao.addEmployee(e1);
	}
	else if (x==2) 
	{
		dao.updateEmployee(e1);
	}
	
	else if (x==3)
	{
		dao.deleteEmployee(e1);
		
	}
	
	else
	{
		System.out.println("Exit");
	}
		
		
	
		
		
	}

}
