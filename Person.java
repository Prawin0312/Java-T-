package javatraining;
public class Person implements java.io.Serializable
{
 int ssn;
 String  name;
 int age;
    
    public Person() {
	super();
}
	public Person(int ssn,String name,int age)
    { 
     this.ssn=ssn;
     this.name=name;
     this.age=age;
     }
    public void setSsn(int Ssn)
   {
    this.ssn=ssn;
   }
   public void setName(String name)
   {
    this.name=name;
   }
   public void setAge(int age)
   {
   this.age=age;
   }
     public int getSsn(){return  ssn;}
     public String getName(){return name;}
     public int getAge(){return age;}
 } 
  class Student extends Person
{
  int rno,m1,m2,m3;
 public Student(int ssn, String name, int age, int rno, int m1, int m2, int m3) {
	super(ssn, name, age);
	this.rno = rno;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	
}

public int getRno() {
	return rno;
}

public void setRno(int rno) {
	this.rno = rno;
}

public int getM1() {
	return m1;
}

public void setM1(int m1) {
	this.m1 = m1;
}

public int getM2() {
	return m2;
}

public void setM2(int m2) {
	this.m2 = m2;
}

public int getM3() {
	return m3;
}

public void setM3(int m3) {
	this.m3 = m3;
} 
  }  
