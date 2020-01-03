package com.del.second.entity;
import java.sql.Date;
public class Employees 
{
   int id;
   String name;
   double salary;
   Date doj;
   int Age;
public Employees() {}
public Employees(int id, String name, double salary,int age,Date doj) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.doj = doj;
	this.Age=age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public void setSalary(double salary) {
	this.salary = salary;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}


   
   
}
