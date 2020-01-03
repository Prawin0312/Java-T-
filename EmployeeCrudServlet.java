package com.del.second.entity;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EmployeeCrudServlet")
public class EmployeeCrudServlet extends HttpServlet
{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String submit=request.getParameter("sub");
		EmployeeDAO edao=new EmployeeDAO();
		Employee e = new Employee();
		String message="Succesfully";
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		if(submit.contentEquals("Add_Employee") || submit.contentEquals("Modify_Employee"))
		{
			e.setName(request.getParameter("empname"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setDoj(Date.valueOf(request.getParameter("doj")));
		
			if(submit.equals("Add_Employee"))
			{
				edao.insertEmployee(e);
				message=message+"inserted Record";	
			}
			else
			{
				edao.ModifyEmployee(e);
				message=message+"Modified Record";
			}
			
		}
		else if(submit.equals("Delete_Employee"))
		{
			if(edao.removeEmployee(e.getEmpid()))
				message=message+"Record Deleted";
			else
				message="deletion fail";
		}
		out.print("<h1><center>"+message+"</center></h1>");
	}

}
