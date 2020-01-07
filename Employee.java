package com.deloitte.firstmvn.hibfirst.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee
{
   @Id
   int empid;
   @Column(name="empname")
   String name;
   int salary;
   Date doj;
   
public Employee() {
	super();
}
public Employee(int empid, String name, int salary,Date doj) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.doj = doj;
}

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}	   
}


