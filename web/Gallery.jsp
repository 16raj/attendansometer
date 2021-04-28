<%-- 
    Document   : Gallery
    Created on : 29 Apr, 2020, 3:29:19 PM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
           <link href="css/css1.css" rel="stylesheet" type="text/css">
           <link href="css/gallery.css" rel="stylesheet" type="text/css">
    </head>
    <body id="body1" style="background-size: 1370px 550px">
        <header>
            <div id="topbar">
                    <span><h1 id="top1">Maharishi Institute Of Technology</h1></span>
                    <span id="body2">
                    <span><a class="link" href="Home.jsp">Home</a></span>
                    <span><a class="link" href="Gallery.jsp">Gallery</a></span>
                    <span><a class="link" href="Contact.jsp">Contact</a></span>
                    <span><a class="link" href="login.jsp">Login</a></span>
                    <span><a class="link" href="about.jsp">About Us</a></span>
                    </span>
                </div>
        </header>
        <main>
            <section>
                <h1 style="color: green; margin-top:570px ;text-align: center;font-size: 50px">Gallery</h1>
                <table>
                    <tr>
                        <td><img class="img" src="images/IMG_20200430_104127.jpg" alt="Graduation image" width="300px" height="200px"> </td>
                        <td><img class="img" src="images/classroom.jpg" alt="classroom"></td>
                        <td><img class="img" src="images/image.jpg" alt="background image"></td>
                    </tr>
                    <div>
                    <tr>
                        <td><img class="img" src="images/alphabet-blur-books-close-up-301920.jpg" alt="Study"></td>
                        <td><img class="img" src="images/event.jpg" alt="Event at the college"></td>
                        <td><img class="img" src="images/convocation.jpg" alt="convocation"></td>
                   </tr>
                    </div>
                    <div>
                   <tr>
                       <td><img class="img" src="images/people-sitting-around-brown-wooden-table-under-white-pendant-1181435.jpg" alt="Meeting"></td>
                       <td><img class="img" src="images/library.jpg" alt="Student studying in a library"></td>
                       <td><img class="img" src="images/visit.jpg" alt="Industrial Visit"></td>
                   </tr>
                    </div>
                </table> 
            </section>
        </main>
         <footer>
            <nav>
            <div id="foot">
            <span><h1 id="head2">About Us</h1></span>
            <span><h1 id="head3">Contact Us</h1></span>
            </div>
                </nav>
        </footer>
         
    </body>

</html>
