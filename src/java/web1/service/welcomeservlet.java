/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web1.service;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import web1.dao.welcomedao;
import web1.model.welcomesql;

/**
 *
 * @author Windows
 */
@WebServlet(name = "welcomeservlet", urlPatterns = {"/welcomeservlet"})
public class welcomeservlet extends HttpServlet {

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
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
         
        int attendance=0;
        int total=0;
        double percent=0;
        HttpSession session=req.getSession(); 
        String subjectid = req.getParameter("subjectid");
        String subject = req.getParameter("subject");
        String attended = req.getParameter("attendance");
        String date = req.getParameter("date");
        String userid=(String)session.getAttribute("userid");
        String userid1=req.getParameter("userid1");
         if(attended.equals("P")||attended.equals("p"))
           {
            attendance=attendance+1;
            total=total+1;
            percent=((attendance)*100)/total;
           }
           else if(attended.equals("A")||attended.equals("a"))
                   {
                   total=total+1;
                   percent=((attendance)*100)/total;
                   }
        welcomedao r =new welcomedao(subjectid, subject, attended,attendance, total, date,percent,userid,userid1);
        
        welcomesql rc = new welcomesql();
        int i = rc.attendance(r);
       
                
        if (i>=0) {
             resp.sendRedirect("welcome.jsp");
        } else {
            resp.sendRedirect("welcome.jsp");
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
