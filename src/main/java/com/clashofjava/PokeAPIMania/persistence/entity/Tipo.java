package com.clashofjava.PokeAPIMania.persistence.entity;
/**
 * Clase Tipo
 *
 * Contiene los campos de la tabla Tipo de la base de datos y a que variables se asignan
 *
 * @author clash of java
 * @version 1.0
 */
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "nombre_tipo")
    private String nombreTipo;

    @OneToMany(mappedBy = "tipo")
    private List<Evolucion> evolucion;

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public List<Evolucion> getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(List<Evolucion> evolucion) {
        this.evolucion = evolucion;
    }
}
