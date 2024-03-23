
package Persistencia;

import Logica.Odontologo;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.jvm.hotspot.utilities.U1Array;

public class ControladoraPersistencia {
    
    HorarioJpaController horarioJPA = new HorarioJpaController();
    OdontologoJpaController odontologoJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responJPA = new ResponsableJpaController();
    SecretarioJpaController secreJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    
    
    // Usuario
    public void crearUsuario(Usuario usuario) {
        usuarioJPA.create(usuario);
    }
    
    public List<Usuario> traerUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJPA.findUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario) {
        try {
            usuarioJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    
    // Odontologo
    public void crearOdontologo(Odontologo odonto) {
        odontologoJPA.create(odonto);
    }
    
}
