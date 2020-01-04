<%@page import="com.del.second.entity.Employee,com.del.second.entity.EmployeeDAO" %>
<%
   Employee e =(Employee)request.getAttribute("emp");
   if(e==null) e= new Employee();
%>
<html>
<body>
    <form action="EmployeeCrudServlet">
     <table align=center width=50% bgcolor=lightblue>
     <tr>
         <th>Employee Id</th>
         <td><input type=text name=empid value=<%=e.getEmpid()%>></td>
     </tr>
     <tr>
         <th>Employee Name</th>
         <td><input type=text name=empname value=<%=e.getName()%>></td>
     </tr>
     <tr>
         <th>Employee Salary</th>
         <td><input type=text name=salary value=<%=e.getSalary()%>></td>
     </tr>
     <tr>
         <th>Employee DOJ</th>
         <td><input type=date name=doj value=<%=e.getDoj()%>></td>
     </tr>
     <tr>
         <td><input type=submit value=Add_Employee name="sub"></td>
         <td><input type=submit value=Show_Employee name="sub"></td>
     </tr>
     <tr>
         <td><input type=submit value=delete_Employee name="sub"></td>
         <td><input type=submit value=modify_Employee name="sub"></td>
     </tr>
     </table>
    </form>
</body>
</html>