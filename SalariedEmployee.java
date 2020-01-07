package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("Salaried")
@Entity
public class SalariedEmployee extends Employee 
{
  double salary;
  public SalariedEmployee(){}
  public SalariedEmployee(double salary,int empid,String empname) {
	super(empid,empname);
	this.salary = salary;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
  
}
