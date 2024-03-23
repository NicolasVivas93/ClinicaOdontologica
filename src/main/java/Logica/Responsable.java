
package Logica;


import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona {
    
    private String relacionParentesco;

    public Responsable() {
    }

    public Responsable(String relacionParentesco, int id, String nombre,
            String apellido, String dni, String telefono, String domicilio,
            Date fechaNac) {
        super(id, nombre, apellido, dni, telefono, domicilio, fechaNac);
        this.relacionParentesco = relacionParentesco;
    }

    

    

    public String getRelacionParentesco() {
        return relacionParentesco;
    }

    public void setRelacionParentesco(String relacionParentesco) {
        this.relacionParentesco = relacionParentesco;
    }
    
    
    
}
