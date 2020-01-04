<%@page import="com.del.assign.Courses,com.del.assign.CoursesDAO" %>
<%
   Courses c =(Courses)request.getAttribute("crs");
   if(c==null) c= new Courses();
%>
<html>
<body>
    <form action="CoursesCrudServlet">
     <table align=center width=30% height=30% bgcolor=lightgreen border=1px solid black>
      <caption><h3>Course Management</h3></caption>
     <tr>
         <th>Course Id :</th>
         <td><input type=text name=courseid value=<%=c.getCourseid()%>></td>
     </tr>
     <tr>
         <th>Course Name :</th>
         <td><input type=text name=coursename value=<%=c.getCoursename()%>></td>
     </tr>
     <tr>
         <th>Course Duration(M) :</th>
         <td><input type=text name=cdim value=<%=c.getCdim()%>></td>
     </tr>
     <tr>
         <th>Course fee :</th>
         <td><input type=text name=coursefee value=<%=c.getCoursefee()%>></td>
     </tr>
     <tr>
         <td><center><input type=submit value=Add_Record name="sub"></center></td>
         <td><input type=submit value=Show_Record name="sub"></td>
     </tr>
     <tr>
         <td><center><input type=submit value=Delete_Record name="sub"></center></td>
         <td><input type=submit value=Modify_Record name="sub"></td>
     </tr>
     </table>
    </form>
</body>
</html>