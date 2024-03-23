
package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona implements Serializable {
    
    private String sector;
    
    // Relaciones
    @OneToOne
    private Usuario usuario; // 1 a 1
    
    public Secretario() {
    }

    public Secretario(String sector, Usuario usuario, int id, String nombre,
            String apellido, String dni, String telefono, String domicilio,
            Date fechaNac) {
        super(id, nombre, apellido, dni, telefono, domicilio, fechaNac);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
