
package Servlets;

import Logica.ControladoraLogica;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvOdontologo", urlPatterns = {"/SvOdontologo"})
public class SvOdontologo extends HttpServlet {

    ControladoraLogica controladoraLogica = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String domicilio = request.getParameter("domicilio");
        String fechaNac = request.getParameter("fechaNac"); // Lo guarda en formato yyyy-MM-dd
        String especialidad = request.getParameter("especialidad");        
        
        Date fecha = new Date();
        // Formateo de fecha para pasar de String a Date
        try {          
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            fecha = formato.parse(fechaNac);           
        } catch (ParseException ex) {
            Logger.getLogger(SvOdontologo.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        
        Odontologo odontologo = new Odontologo();
        odontologo.setDni(dni);
        odontologo.setNombre(nombre);
        odontologo.setApellido(apellido);
        odontologo.setTelefono(telefono);
        odontologo.setDomicilio(domicilio);
        odontologo.setFechaNac(fecha);
        odontologo.setEspecialidad(especialidad);
        
        controladoraLogica.crearOdontologo(odontologo);
        response.sendRedirect("index.jsp");
              
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
