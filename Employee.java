package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="type")
public abstract class Employee
{
  @Id
  int empid;
  String empname;
  public Employee(){}
  public Employee(int empid, String empname) {
	
	this.empid = empid;
	this.empname = empname;
	
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
  
}
