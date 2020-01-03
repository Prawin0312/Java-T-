package com.del.second.entity;
import java.sql.*;
import java.util.ArrayList;
import com.del.second.entity.Employee;
public class EmployeeDAO 
{
  public boolean insertEmployee(Employee emp)
  {
	  int count=0;
	  Connection con=null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("insert into employee values(?,?,?,?)");
		  pst.setInt(1, emp.getEmpid()); pst.setString(2,emp.getName());
		  pst.setDouble(3, emp.getSalary()); pst.setDate(4,emp.getDoj());
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
  public boolean ModifyEmployee(Employee emp)
  {
	  int count=0;
	  Connection con=null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("update employee set ename=?,salary=? where id =?");
		  pst.setString(1, emp.getName());
		  pst.setDouble(2, emp.getSalary());
		  pst.setInt(3,emp.getEmpid());
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
  public boolean removeEmployee(int id)
  {
	  int count=0;
	  Connection con=null;
	  PreparedStatement pst = null;
	  String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("delete from employee where id=?");
		  Employee emp = null;
		pst.setInt(1,emp.getEmpid());
		  count = pst.executeUpdate();
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

  public Employee getEmployee(int id)
  {
	  Employee emp1 =null;
	  Connection con=null;
	  PreparedStatement pst = null;
	  ResultSet rs=null;
	  String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("select * from employee where id = ?");
		  pst.setInt(1,emp1.getEmpid());
		  rs=pst.executeQuery();
		  if(rs.next())
			  emp1= new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4));
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
	  return emp1;
	}
  public ArrayList<Employee> getEmployee()
  {
	  ArrayList<Employee> elist=new ArrayList<Employee>();
	  Connection con=null;
	  PreparedStatement pst = null;
	  ResultSet rs=null;
	  String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con = DriverManager.getConnection(url,"scott","tiger");
		  pst=con.prepareStatement("select * from employee");
		 rs=pst.executeQuery();
		  while(rs.next())
		elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4)));
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
	  return elist;
	}
}
