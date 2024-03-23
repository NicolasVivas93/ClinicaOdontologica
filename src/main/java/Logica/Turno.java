
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    private String hora;
    private String obsTurno;
    
    // Relaciones
    @ManyToOne
    @JoinColumn(name = "id_odontologo")
    private Odontologo odontologo; // N a 1
    
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente; // N a 1

    public Turno() {
    }

    public Turno(int id, Date fecha, String hora, String obsTurno,
            Odontologo odontologo, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.obsTurno = obsTurno;
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObsTurno() {
        return obsTurno;
    }

    public void setObsTurno(String obsTurno) {
        this.obsTurno = obsTurno;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
