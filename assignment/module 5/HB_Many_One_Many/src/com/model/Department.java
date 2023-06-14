package com.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Department")
public class Department
{
   private int did;
   private String dname;
   
   Set<employee> emp;
   @Id
   @GenericGenerator(name="increment",strategy = "increment")
   @GeneratedValue(generator = "increment")

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}
@OneToMany(mappedBy = "dep")
public Set<employee> getEmp() {
	return emp;
}

public void setEmp(Set<employee> emp) {
	this.emp = emp;
}
   
   
}
