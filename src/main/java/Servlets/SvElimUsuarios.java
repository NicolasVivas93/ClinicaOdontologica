
package Servlets;

import Logica.ControladoraLogica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvElimUsuarios", urlPatterns = {"/SvElimUsuarios"})
public class SvElimUsuarios extends HttpServlet {

    ControladoraLogica contLogica = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        contLogica.eliminarUsuario(idUsuario);
        response.sendRedirect("SvUsuarios");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
