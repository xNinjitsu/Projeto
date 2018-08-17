/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a
 */
@WebServlet(name = "juroscomposto", urlPatterns = {"/juroscomposto.php"})
public class juroscomposto extends HttpServlet {

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
                    out.println("<title>Calculo de Juros-composto</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<a href='home'>Voltar<br/></a>");
                    out.println("<form> "
                    + "Capital: <br/><input type='Text' name='cap'/><br/> "
                    +"Taxa de juros: <br/><input type='Text' name='tx'/><br/> "
                     + "Tempo de aplicação: <br/><input type='Text' name='t'/><br/> "
                    + "<input type='submit' value='Enviar'/></form");
                    double cap = Integer.parseInt(request.getParameter("cap"));
                    double tx = Double.parseDouble(request.getParameter("tx"));
                    double t = Double.parseDouble(request.getParameter("t"));
                    double r = cap*Math.pow((1+tx),t);
                    out.println("<caption><br/>Resultado</caption>");
                    for(int i=1;i<=t;i++)
                    {
                    out.println("<table border='1'>"
                      + "<tr><td>nome</td><td>  </td></tr>"+ "</table>");
                          }
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
