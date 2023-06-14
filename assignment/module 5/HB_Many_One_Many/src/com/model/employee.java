package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="employee")
public class employee 
{
   private int eid;
   private String ename,city;
   Department dep;
   @Id
   @GenericGenerator(name="increment",strategy = "increment")
   @GeneratedValue(generator = "increment")
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@ManyToOne
@JoinColumn(name="did")
public Department getDep() {
	return dep;
}
public void setDep(Department dep) {
	this.dep = dep;
}
   
}
