
package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable {
    
    private String especialidad;
    
    // Relaciones
    @OneToOne
    private Horario horarioAtencion; // 1 a 1
    @OneToOne
    private Usuario usuario; // 1 a 1
    
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> listaTurnos; // 1 a N

    public Odontologo() {
    }

    public Odontologo(String especialidad, Horario horarioAtencion,
            Usuario usuario, List<Turno> listaTurnos, int id, String nombre,
            String apellido, String dni, String telefono, String domicilio,
            Date fechaNac) {
        super(id, nombre, apellido, dni, telefono, domicilio, fechaNac);
        this.especialidad = especialidad;
        this.horarioAtencion = horarioAtencion;
        this.usuario = usuario;
        this.listaTurnos = listaTurnos;
    }

    

  
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(Horario horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
        
    
}
