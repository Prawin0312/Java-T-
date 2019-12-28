import java.util.LinkedList;
class Students
{
int id;
String name;
int age;
public Students(int id,String name,int age){this.id=id; this.name=name; this.age=age;}
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public void setAge(int age){this.age=age;}
public int getId(){return id;}
public String getName(){return name;}
public int getAge(){return age;}
}
class training extends Students
{
int trid;
String trname;
public training(int trid,String trname,int id,String name,int age)
{
	super(id,name,age);
	this.trid=trid;
	this.trname=trname;
}
public void setTrid(int trid){this.trid=trid;}
public void setTrname(String trname){this.trname=trname;}
public int getTrid(){return trid;}
public String getTrname(){return trname;}
public String toString()
{
  return "training id is:"+trid+"\nname "+trname+"\nStudent id is "+id+"\n name "+name+"\nage "+age; 
}
}
class Exam
{
public static void main(String[] args)
{
LinkedList<training> t = new LinkedList<>();
t.add(new training(101,"Java",1010,"Ajay",21));
t.add(new training(102,"Python",1011,"Babu",22));
t.add(new training(103,"R+",1012,"Arun",23));
t.add(new training(104,"C++",1013,"Vijay",19));
for(training X :t)
System.out.println(X);
}
}


