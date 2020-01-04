package com.del.assign;

public class Courses 
{
   int courseid;
   String coursename;
   int cdim;
   int coursefee;
public Courses() {}
public Courses(int courseid, String coursename, int cdim, int coursefee) {
	super();
	this.courseid = courseid;
	this.coursename = coursename;
	this.cdim = cdim;
	this.coursefee = coursefee;
}
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public int getCdim() {
	return cdim;
}
public void setCdim(int cdim) {
	this.cdim = cdim;
}
public int getCoursefee() {
	return coursefee;
}
public void setCoursefee(int coursefee) {
	this.coursefee = coursefee;
}

   
}
