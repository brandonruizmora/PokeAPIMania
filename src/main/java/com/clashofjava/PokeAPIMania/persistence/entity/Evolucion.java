package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "evolucion")
public class Evolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evolucion")
    private Integer idEvolucion;

    @Column(name = "nombre_evolucion")
    private String nombreEvolucion;

    private Boolean evolucion;

    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @ManyToOne
    @JoinColumn(name = "id_tipo", insertable = false, updatable = false)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdEvolucion() {
        return idEvolucion;
    }

    public void setIdEvolucion(Integer idEvolucion) {
        this.idEvolucion = idEvolucion;
    }

    public String getNombreEvolucion() {
        return nombreEvolucion;
    }

    public void setNombreEvolucion(String nombreEvolucion) {
        this.nombreEvolucion = nombreEvolucion;
    }

    public Boolean getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(Boolean evolucion) {
        this.evolucion = evolucion;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
