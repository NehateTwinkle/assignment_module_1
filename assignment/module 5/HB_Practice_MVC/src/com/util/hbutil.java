package com.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.usermodel;




public class hbutil {
	Properties pro=null;
	Configuration cfg=null;
	SessionFactory sf=null;
	Session session=null;
	
	public Session getsessiondata()
	{

	pro=new Properties();
	pro.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
	pro.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/um");
	pro.setProperty("hibernate.connection.username","root");
	pro.setProperty("hibernate.connection.password","");
	pro.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
	pro.setProperty("hibernate.hbm2ddl.auto","update");
	pro.setProperty("hibernate.format_sql","true");
	pro.setProperty("hibernate.show_sql","true");
	
	
	cfg=new Configuration();
	cfg.addProperties(pro).addAnnotatedClass(usermodel.class);
	
	sf=cfg.buildSessionFactory();
	session=sf.openSession();
	return session;
}
	
}
