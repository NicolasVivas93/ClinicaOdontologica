
package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
    private boolean obraSocial;
    private String tipoSangre;
    
    // Relaciones
    @OneToOne
    private Responsable responsable; // Relacion 1 a 1
    
    @OneToMany(mappedBy = "paciente")
    private List<Turno> turnos; // Relacion 1 a N

    public Paciente() {
    }

    public Paciente(boolean obraSocial, String tipoSangre,
            Responsable responsable, List<Turno> turnos, int id, String nombre,
            String apellido, String dni, String telefono, String domicilio,
            Date fechaNac) {
        super(id, nombre, apellido, dni, telefono, domicilio, fechaNac);
        this.obraSocial = obraSocial;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.turnos = turnos;
    }


    public boolean tieneObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
}
