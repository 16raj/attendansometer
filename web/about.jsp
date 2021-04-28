<%-- 
    Document   : about
    Created on : 29 Apr, 2020, 3:28:02 PM
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About</title>
            <link href="css/css1.css" rel="stylesheet" type="text/css">
            <script>
                $(document).ready(function(){
    $(window).scroll(function(){
        var scroll=$(window).scrollTop();
        if(scroll>300){
            $("#topbar").css("background","goldenrod");
        }
        else{
            $("#topbar").css("background","activecaption");
        }
    });
});
            </script>
    </head>
    <body id="body1">
        <header>
            <nav>
           <div id="topbar">
                    <span><h1 id="top1">Maharishi Institute Of Technology</h1></span>
                    <span id="body2">
                    <span><a class="link" href="Home.jsp">Home</a></span>
                    <span><a class="link" href="Gallery.jsp">Gallery</a></span>
                    <span><a class="link" href="Contact.jsp">Contact</a></span>
                    <span><a class="link" href="login.jsp">Login</a></span>
                    <span><a class="link" href="about.jsp">About US</a></span>
                    </span>
                </div>
        </nav>
        </header>
        <main>
            <section>
                
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
