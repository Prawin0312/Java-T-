class Person
{
 int ssn;
 String  name;
 int age;
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
    public Student(int rno,int m1,int m2,int m3,int ssn,String name,int age)
    { 
     super(ssn,name,age);
     this.rno=rno;
       this.m1=m1;
       this.m2=m2;
       this.m3=m3;
     }
    public void setRno(int Rno)
   {
    this.rno=rno;
   }
   public void setM1(int m1)
   {
   this.m1=m1;
   }
   public void setM2(int m2)
   {
   this.m2=m2;
   }
   public void setM3(int m3)
   {
   this.m3=m3;
   }
     public int getRno(){return  rno;}
     public int getM1(){return m1;}
     public int getM2(){return m2;}
     public int getM3(){return m2;}
     public int getTotalMarks(){return m1+m2+m3;}
  }  
   class Pgstudent extends Student
  {
    String opsub;
    public Pgstudent(String opsub,int rno,int m1,int m2,int m3,int ssn,String name,int age)
  {
    super(rno,m1,m2,m3,ssn,name,age);
    this.opsub=opsub;
  }
   public void setOpsub(String opsub){this.opsub=opsub;}
   public String getOpsub(){return opsub;}
  }
  class test
 { 
      public static void main(String[] args)
     {
      Pgstudent sm = new Pgstudent("Telugu",101,90,99,45,5428,"John",17);
           System.out.println(sm.getOpsub());
           System.out.println(sm.getM1());
           System.out.println(sm.getM2());
           System.out.println(sm.getM3());
           System.out.println(sm.getSsn());
	   System.out.println(sm.getName());
           System.out.println(sm.getAge());
           System.out.println(sm.getTotalMarks());		
 }
 }

 
 