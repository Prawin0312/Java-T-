package com.del.assign;
import java.sql.*;
import com.del.assign.Courses;
public class CoursesDAO 
{
   public boolean insertCourse(Courses c)
   {
	   int count=0;
	   Connection con=null;
	   PreparedStatement pst=null;
	   String url="jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection(url,"scott","tiger");
		   pst=con.prepareStatement("insert into courses values(?,?,?,?)");
		   pst.setInt(1,c.getCourseid()); pst.setString(2,c.getCoursename());
		   pst.setInt(3,c.getCdim()); pst.setInt(4, c.getCoursefee());
		   count=pst.executeUpdate();
	   }
	   catch (Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(pst!=null) pst.close();
			   if(con!=null) pst.close();
		   }
		   catch (Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
	   return count==1;
   }
   public boolean modifyCourse(Courses c)
   {
	   int count=0;
	   Connection con=null;
	   PreparedStatement pst=null;
	   String url="jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection(url,"scott","tiger");
		   pst=con.prepareStatement("update courses set coursename=?,cdim=?,coursefee=? where courseid=?");
		   pst.setString(1,c.getCoursename());pst.setInt(2,c.getCdim());
		   pst.setInt(3, c.getCoursefee());pst.setInt(4,c.getCourseid());
		   count=pst.executeUpdate();
	   }
	   catch (Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(pst!=null) pst.close();
			   if(con!=null) pst.close();
		   }
		   catch (Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
	   return count==1;
   }
   public boolean removeCourse(int courseid)
   {
	   int count=0;
	   Connection con=null;
	   PreparedStatement pst=null;
	   String url="jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection(url,"scott","tiger");
		   pst=con.prepareStatement("delete from courses where courseid=?");
		   pst.setInt(1,courseid);
		   count=pst.executeUpdate();
	   }
	   catch (Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(pst!=null) pst.close();
			   if(con!=null) pst.close();
		   }
		   catch (Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
	   return count==1;
   }
   public Courses getCourses(int courseid)
   {
	   Courses c1=null;
	   Connection con=null;
	   PreparedStatement pst=null;
	   ResultSet rs=null;
	   String url="jdbc:oracle:thin:@localhost:1521:orcl";
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection(url,"scott","tiger");
		   pst=con.prepareStatement("select * from courses where courseid=?");
		   pst.setInt(1,courseid);
		   rs=pst.executeQuery();
		   if(rs.next())
			   c1 = new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
	   }
	   catch (Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(pst!=null) pst.close();
			   if(con!=null) pst.close();
		   }
		   catch (Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
	   return c1;
   }
}
