/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web1.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web1.dao.registerdao;
import web1.dao.registerteacherdao;
import web1.model.registersql;
import web1.model.registerteachersql;

/**
 *
 * @author Windows
 */
@WebServlet(name = "registerteacherservlet", urlPatterns = {"/registerteacherservlet"})
public class registerteacherservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerteacherservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerteacherservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
         public class Validation{
         public boolean email_Validation(String email){
          boolean status=false;
          String email_Pattern="^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
          Pattern pattern=Pattern.compile(email_Pattern);
Matcher matcher=pattern.matcher(email);
if(matcher.matches()){
status=true;
}
else{
status=false;
}
return status;
      }
          public boolean mobileno_Validation(String mobileno)
 {
     boolean stat=false;
      String pattern = "[6-9][0-9]{9}";  
      Pattern pat=Pattern.compile(pattern);
      Matcher match=pat.matcher(mobileno);
      if(match.matches()){
          stat=true;
          }
      else{
          stat=false;
      }
      return stat;
 }
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try{
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phno = req.getParameter("phno");
        String pass = req.getParameter("pass");
        String userid = req.getParameter("userid");
        String branch=req.getParameter("branch");
        Validation v=new Validation();
        boolean status=v.email_Validation(email);
        boolean stat=v.mobileno_Validation(pass);
        if(status==true)
  {  
  if(stat=true)
  {
      if(phno.length()<10||phno.length()>10)
            {
              resp.sendRedirect("alertregister.jsp");
            }
      else
      {
           registerteacherdao r =new registerteacherdao(name, email, phno, pass,userid,branch);
        registerteachersql rc = new registerteachersql();
        int i = rc.registerteacher(r);
        if (i>=0) {
           resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("registerteacher.jsp");
        }
    }
  }
    }
        else{
           resp.sendRedirect("alertregister.jsp");
        }
    }
    catch(Exception e){
    e.printStackTrace();
}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
