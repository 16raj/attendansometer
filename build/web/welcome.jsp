<%-- 
    Document   : welcome
    Created on : 2 Apr, 2020, 5:41:40 PM
    Author     : Windows
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance</title>
        <style>
        table,td,th{
        border: solid 1px black;
        width: 60%;
        border-collapse: collapse;
        }
        .btn1{
            border-radius: 5px;
            background-color: dodgerblue;
        }
        </style>
    </head>
    <body>
        <%
             if(session.getAttribute("userid")==null)
            {
                response.sendRedirect("login.jsp");
            }
             
             String clas=request.getParameter("class");
            String sql="select userid,name from register where class=?";
            String url="jdbc:mysql://localhost:3306/studant";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,clas);
            ResultSet rs=ps.executeQuery();
                    %>        
        <form  style="text-align:right" action="logoutservlet" method="post">
            <input class="btn1" type="button" value="change password" onclick="location.href='setpassword.jsp'">
            <input class="btn1" type="submit"  value="logout">
        </form>
         <h1>Welcome to our site</h1>
         <form action="" action="">
            Class<input type="text" name="class" required="required"><br><br>
            <input type="submit" value="save">
            </form><br><br><br>
    <center>
        <form  action="welcomeservlet" method="post" >
            Subjectid<input type="text" name="subjectid" required="required"><br><br>
            Subject&nbsp&nbsp<input type="text" name="subject" required="required"><br><br>
            date&nbsp&nbsp&nbsp&nbsp&nbsp<input type="datetime-local" name="date" required="required"><br><br>
              <table>
            <tr>
                <th>Enrollment No.</th>
                <th>Student name</th>
                <th>Attended</th>
                 </tr>
                  <% while(rs.next()){%>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><input type="text" name="attendance" required="required" size="45"></td>
                         </tr>
             <%}%>
            </table>
            <input type="submit" value="save">
        </form>
       </center>
    </body>
</html>
