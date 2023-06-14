package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ProfileDetails")
public class ProfileDetails
{
   private int pid;
   private String address,desg;
   Employee employee;
   @Id
	@GenericGenerator(name="increment",strategy = "increment")
	@GeneratedValue(generator = "increment")
   
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
@OneToOne(mappedBy = "profile")
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
   
}
