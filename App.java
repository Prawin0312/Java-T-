package com.deloitte.thirdmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.thirdmvn.hibthird.entity.Aadharcard;
import com.deloitte.thirdmvn.hibthird.entity.Courses;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Person;
import com.deloitte.thirdmvn.hibthird.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.addAnnotatedClass(Courses.class);
      cfg.addAnnotatedClass(Student.class);
      cfg.configure();
      SessionFactory factory=cfg.buildSessionFactory();
      Session session = factory.openSession();
      //Aadharcard ac= new Aadharcard(7001,"Govt. of India",new Date(1999,10,10));
      //Person p1= new Person("Ajay",26,"Hitc city",ac);
      //Transaction trans= session.beginTransaction();
      /*Person p1= session.get(Person.class,"Ajay");
      if(p1!=null)
      {
    	  System.out.println(p1.getAddress()+" "+p1.getAge());
    	  Aadharcard ac= p1.getAcard();
    	  System.out.println(ac.getAid()+" "+ac.getIssueAuth()+" "+ac.getIssueDate());
      }
      Aadharcard ac1=session.get(Aadharcard.class, 7001);
      if(ac1!=null)
      {
    	  System.out.println(ac1.getIssueAuth()+" "+ac1.getIssueDate());
    	  Person p= ac1.getPerson();
    	  System.out.println(p.getName()+" "+p.getAddress()+" "+p.getAge());
      }
      //session.save(ac);
      //session.save(p1);
      //trans.commit();*/
     
      
       
      /*Employee e1= new Employee(101,"Ajay",1000);
      Employee e2= new Employee(102,"Vijay",12000);
      Employee e3= new Employee(103,"Uday",92000);
      Employee e4= new Employee(104,"Vinay",10000);
      ArrayList<Employee> el1= new ArrayList<Employee>();
      ArrayList<Employee> el2=new ArrayList<Employee>();
      el1.add(e1);
      el2.add(e2);
      el1.add(e3);
      el2.add(e4);
      Department d1= new Department(10,"Sales",el1);
      Department d2 = new Department(20,"Marketing",el2);
      session.save(e1); session.save(e2); session.save(e3);
      session.save(e4); session.save(d1); session.save(d2);
      session.beginTransaction().commit();*/
      
      
     /* Department d= session.get(Department.class,20);
      if(d!=null)
      {
    	  System.out.println(d.getDname()+" "+d.getDeptno());
    	  for(Employee e: d.getElist())
    		  System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
      }*/
      /*Department d = session.get(Department.class,20);
      session.delete(d);
      session.beginTransaction().commit();*/
      /*Department d = session.get(Department.class,20);
      if(d!=null)
      {
    	  System.out.println(d.getDeptno()+" "+d.getDname());
    	  for(Employee e: d.getElist())
    		  System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
    	  Employee e = session.get(Employee.class,101);
    	  if(e!=null)
    	  {
    		  System.out.println(e.getEmpname()+" "+e.getSalary()); 
    		  System.out.println(e.getDept().getDeptno()+" "+e.getDept().getDname());
    	  }
      }*/
      Courses c = session.get(Courses.class, 7001);
      if(c!=null)
      {
    	  System.out.println(c.getCname()+" "+c.getDuration());
    	  for(Student s:c.getSlist())
    		  System.out.println(s.getSid()+" "+s.getSname()+" "+s.getAddress());
      }
      Student s= session.get(Student.class,102);
      if(s!=null)
      {
    	  System.out.println(s.getSname()+" "+s.getAddress());
    	  for(Courses c1:s.getClist())
             System.out.println(c1.getCid()+" "+ c1.getCname()+" "+c1.getDuration());  	  
      }
      session.close();
      factory.close();
    }
}