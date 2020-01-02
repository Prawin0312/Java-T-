package com.del.entity;
import java.sql.*;
import com.del.entity.Student;
public class StudentDAO 
{
	public boolean insertStudent(Student s)
	{
		int count=0;
		Connection con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = (Connection) DriverManager.getConnection(url,"scott","tiger");
			 pst=con.prepareStatement("insert into student values(?,?,?,?)");
			 pst.setInt(1,s.getRno()); pst.setString(2,s.getName());
			 pst.setInt(3, s.getAge()); pst.setDate(4,s.getDob());
			 count=pst.executeUpdate();
		}
		 catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	  return count==1;
	}
     public boolean ModifyStudent(Student s)
       {

 		int count=0;
 		Connection con=null;
 		PreparedStatement pst=null;
 		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
 		try
 		{
 			  Class.forName("oracle.jdbc.driver.OracleDriver");
 			  con = (Connection) DriverManager.getConnection(url,"scott","tiger");
 			 pst=((java.sql.Connection) con).prepareStatement("update student set name=?,age=? where rno=?");
 			 pst.setString(1, s.getName()); pst.setInt(2,s.getAge()); pst.setInt(3,s.getRno());
 			 count=pst.executeUpdate();
 		}
 		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	  return count==1;
     }
     public boolean removeStudent(Student s)
     {

		int count=0;
		Connection con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		try
		{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = (Connection) DriverManager.getConnection(url,"scott","tiger");
			 pst=((java.sql.Connection) con).prepareStatement("delete from student where rno=?");
			 pst.setInt(1,s.getRno());
			 count=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	  return count==1;
   }
     public Student getStudent(int rno)
     {
        Student s1=null;
		Connection con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		ResultSet rs = null;
		try
		{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = (Connection) DriverManager.getConnection(url,"scott","tiger");
			 pst=((java.sql.Connection) con).prepareStatement("select * from student where rno=?");
			 pst.setInt(1,rno);
			 rs=pst.executeQuery();
			 if(rs.next())
				 s1= new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	  return s1;
   }
   
}
