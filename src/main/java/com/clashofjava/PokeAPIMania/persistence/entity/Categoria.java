package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String categoria;

    @OneToMany(mappedBy = "tipo")
    private List<Evolucion> evolucion;

    public List<Evolucion> getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(List<Evolucion> evolucion) {
        this.evolucion = evolucion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
