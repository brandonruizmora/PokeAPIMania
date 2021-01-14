package com.clashofjava.PokeAPIMania.persistence.entity;

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
