/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a
 */
@WebServlet(name = "jurossimples", urlPatterns = {"/jurossimples.php"})
public class jurossimples extends HttpServlet {

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
            out.println("<title>Soma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='Home.php'>Voltar</a></h4>");
            out.println("<h4>M = P x ( 1 + ( i x n ))</h4>");            
            out.println("<form>");
            out.println("Capital inicial: <input type='text' name='P'/>");
            out.println("Juros:<input type='text' name='i'/>");
            out.println("Período: <input type='text' name='n'/><br><br>");
            out.println("<input type='submit' name='Result' value='Calcular'/>");
            out.println("</form>");
            DecimalFormat df = new DecimalFormat("###,##0.00");
            double P = Double.parseDouble(request.getParameter("P"));
            double i = Double.parseDouble(request.getParameter("i"));
            double n = Double.parseDouble(request.getParameter("n"));
            double Result = P*(1+(i/100)*(n/360));
            out.println("<h2>O montante é = R$"+(df.format(Result))+"</h2>");
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
