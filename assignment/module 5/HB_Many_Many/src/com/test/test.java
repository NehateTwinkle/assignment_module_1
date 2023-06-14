package com.test;

import java.util.Collection;
import java.util.HashSet;

import com.dao.hbdao;
import com.model.Students;
import com.model.Subjects;

public class test {

	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		Collection<Subjects>sb1=new HashSet<Subjects>();
		
		Subjects s1=new Subjects();
		s1.setSubname("java");
		s1.setDuration("5 month");
		dao.addsub(s1);
		
		Subjects s2=new Subjects();
		s2.setSubname("testing");
		s2.setDuration("4 month");
		dao.addsub(s2);
		
		sb1.add(s1);
		sb1.add(s2);
		
		Students ss1=new Students();
		ss1.setSname("twinkle");
		ss1.setCity("surat");
		ss1.setSubjects(sb1);
         dao.addstudent(ss1);
         
         Students ss2=new Students();
         ss2.setSname("hinal");
         ss2.setCity("ahmedabad");
         ss2.setSubjects(sb1);
         dao.addstudent(ss2);
         
		
	}
}
