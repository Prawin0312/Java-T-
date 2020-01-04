package com.del.assign;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.assign.CoursesDAO;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
	    response.setContentType("text/html");
	    PrintWriter out= response.getWriter();
		String submit=request.getParameter("sub");
		CoursesDAO cdao = new CoursesDAO();
		Courses c=new Courses();
		String message ="Succesfully";
		c.setCourseid(Integer.parseInt(request.getParameter("courseid")));
		RequestDispatcher rd = request.getRequestDispatcher("CoursesCrud.jsp");
		if(submit.contentEquals("Add_Record") || submit.contentEquals("Modify_Record"))
		{
			c.setCoursename(request.getParameter("coursename"));
			c.setCdim(Integer.parseInt(request.getParameter("cdim")));
			c.setCoursefee(Integer.parseInt(request.getParameter("coursefee")));
		
			if(submit.equals("Add_Record"))
			{
				cdao.insertCourse(c);
				message=message+" Course inserted !";	
			}
			else
			{
				cdao.modifyCourse(c);
				message=message+" Course modified !";
			}
			
		}
		else if(submit.equals("Delete_Record"))
		{
			if(cdao.removeCourse(c.getCourseid()))
				message=message+" Course Deleted !";
			else
				message="deletion fail";
		}
		else if(submit.equals("Show_Record"))
		{
			c = cdao.getCourses(c.getCourseid());
			request.setAttribute("crs",c);
		}
		out.print("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
	}
   }

