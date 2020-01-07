package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("Hourly")
@Entity
public class HourlyEmployee extends Employee 
{
   double rate;
   int hours;
   public HourlyEmployee(){}
    public HourlyEmployee(double rate, int hours,int empid,String empname) {
	super(empid,empname);
	this.rate = rate;
	this.hours = hours;
}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}   
}
