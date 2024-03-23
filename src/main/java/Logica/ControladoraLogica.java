
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Usuario
    
    public void crearUsuario(Usuario usuario) {
        controlPersis.crearUsuario(usuario);
    }
    
    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void eliminarUsuario(int id) {
        controlPersis.eliminarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario) {
        controlPersis.editarUsuario(usuario);
    }

    public boolean comprobarUsuario(String nombreUsuario, String contrasenia) {
        
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                if (usuario.getContrasenia().equalsIgnoreCase(contrasenia)) {
                    ingreso = true;
                } else {
                    ingreso = false;
                }
            }                    
        }   
        
        return ingreso;        
    }
    
    // Odontologo
    
    public void crearOdontologo(Odontologo odonto) {
        controlPersis.crearOdontologo(odonto);
    }
    
}
