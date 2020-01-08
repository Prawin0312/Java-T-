package com.deloitte.thirdmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.thirdmvn.hibthird.entity.Aadharcard;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Person;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
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
      Department d2 = new Department(20,"Markerting",el2);
      session.save(e1); session.save(e2); session.save(e3);
      session.save(e4); session.save(d1); session.save(d2);
      session.beginTransaction().commit();*/
      
      
      Department d= session.get(Department.class,20);
      if(d!=null)
      {
    	  System.out.println(d.getDname()+" "+d.getDeptno());
    	  for(Employee e: d.getElist())
    		  System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
      }
      session.close();
      factory.close();
    }
}