import java.util.HashSet;
import java.util.Iterator;
class Employee
{
int empid;
String ename;
double salary;
public Employee(int empid,String ename,double salary)
{
this.empid=empid;
this.ename=ename;
this.salary=salary;
}
public void display()
{
  System.out.println(empid+"  "+ename+"   "+salary);
}
public int hashCode()
{
 return empid;
}
public boolean equals(Object obj)
{
 Employee e=(Employee)obj;
 return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
}
}
class test10
{
public static void main(String[] args)
  {
     HashSet<Employee> hs = new HashSet<Employee>();
     hs.add(new Employee(101,"Ajay",2000));
     hs.add(new Employee(102,"Vijay",3000));
     hs.add(new Employee(103,"uday",4000));
     hs.add(new Employee(103,"uday",4000));
     for(Employee e: hs)
     e.display();
     Iterator<Employee> itr = hs.iterator();
     while(itr.hasNext());
     itr.next().display();
     
  }
}