<%-- 
    Document   : welcomestudent
    Created on : 14 Apr, 2020, 12:03:41 AM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>JSP Page</title>
    </head>
    <body>
       <%
            if(session.getAttribute("userid")==null)
            {
                response.sendRedirect("login.jsp");
            }
            %> 
                    
        <form  style="text-align: right"action="logoutservlet" method="post">
            <input type="button" value="change password" onclick="location.href='setpassword.jsp'">
            <input type="submit"  value="logout">
        </form>
            <form action=" " method=" ">
            <input type="button" onclick="location.href='attendancedate.jsp'" value="Date wise attendance">
            <input type="button" onclick="location.href='attendance.jsp'" value="subject wise attendance">
            </form>
    </body>
</html>
