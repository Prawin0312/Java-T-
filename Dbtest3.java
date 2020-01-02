package com.del.entity;
import com.del.entity.Student;
import java.sql.Date;
import com.del.entity.StudentDAO;
public class Dbtest3 
{
   public static void main(String[] args)
   {
	   Student s = new Student(11,"Raja",18,new Date(1999,10,12));
	   StudentDAO sdao =new StudentDAO();
	   if(sdao.insertStudent(s))
		   System.out.println("inserted");
	   else
		   System.out.println("failed");
   }
}
