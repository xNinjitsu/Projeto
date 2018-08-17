/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ana
 */
@WebServlet(urlPatterns = {"/Home.php"})
public class HomeServlet extends HttpServlet {

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
            out.println("<title>Servlet HomeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //Nome dos integrandes 
            out.println("<center><h1>Integrantes da Equipe</h1></center>");
            out.println("<center><h3>Ana Paula Otiai</h3></center>");
            out.println("<center><h3>Eduardo Ribas Emmerich</h3></center>");
            out.println("<center><h3>Nicole de Souza Medina</h3></center>");
            
            // Cria linha
            out.println("<hr>");
            
            out.println("<center><h2>Aplicação</h2></center>\n");
            out.println("<h2><a href=\"Home.php\"></a></h2>");
            out.println("<center><h2><a href=\"jurossimples.php\">Juros Simples</a></h2></center>\n");
            out.println("<center><p>É aquele em que a taxa de juros incide somente sobre o capital.<br/><strong>Juros</strong>:é a remuneração pelo uso de um capital,por um determinado tempo, a uma taxa previamente combinada.<br/>"
                    + "<strong>Capital:</strong> é o valor ao qual se aplica uma taxa,obtendo-se o juro.<br/><strong>Taxa:</strong> é o porcentagem da remuneração do capital,em relação a uma unidade de tempo.<br/></p></center>");
            out.println("<center><h2><a href=\"juroscomposto.php\">Juros Compostos</a></h2></center>\n" +
"           <center><p>No juro composto,os juros gerados pelo capital são acrescentados ao capital inicial,aumentando-o. "
                     + "A cada período o juro é calculado sobre o capital inicial agregado dos juros correspondentes aos períodos anteriores.</p></center>");
            out.println("<hr>");
            
            
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
