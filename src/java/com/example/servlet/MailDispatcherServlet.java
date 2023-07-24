/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.servlet;


import com.example.ejb.MailSenderBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author devel
 */
@WebServlet(name = "MailDispatcherServlet", urlPatterns = {"/MailDispatcherServlet"})
@SuppressWarnings("serial")
public class MailDispatcherServlet extends HttpServlet {


    //@EJB
   // private MailSenderBean mailSender;

  com.example.ejb.MailSenderBean mailSender = new com.example.ejb.MailSenderBean();

    

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
        
        // Get form inputs
        String toEmail = request.getParameter("email");
    String subject = request.getParameter("subject");
    String message = request.getParameter("message");
     

     // Sender's email ID and password
    String fromEmail = "ashudhikale389@gmail.com";
     String username = "ashudhikale389";
    String password = "fdfetsjbghzchadq";
 //   String password = "Ashu@1998";
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            mailSender.sendEmail(fromEmail, username, password, toEmail, subject, message);
             
           out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Mail Status</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    background-color: #f2f2f2;");
        out.println("    margin: 0;");
        out.println("    padding: 20px;");
        out.println("}");

        out.println(".container {");
        out.println("    max-width: 500px;");
        out.println("    margin: 0 auto;");
        out.println("    background-color: #fff;");
        out.println("    padding: 30px;");
        out.println("    border-radius: 5px;");
        out.println("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
        out.println("}");

        out.println("h1 {");
        out.println("    text-align: center;");
        out.println("    color: #333;");
        out.println("}");

        out.println(".success-message {");
        out.println("    text-align: center;");
        out.println("    margin-top: 30px;");
        out.println("    color: #006400;");
        out.println("    font-weight: bold;");
        out.println("    font-size: 20px;");
        out.println("}");

        out.println(".back-link {");
        out.println("    display: block;");
        out.println("    text-align: center;");
        out.println("    margin-top: 20px;");
        out.println("    color: #333;");
        out.println("    text-decoration: none;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Mail Status</h1>");
        out.println("<p class=\"success-message\">Mail sent successfully!</p>");
        out.println("<p>Click <a class=\"back-link\" href=\"emailClient.jsp\">here</a> to go back.</p>");
        out.println("</div>");
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
