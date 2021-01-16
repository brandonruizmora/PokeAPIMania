package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pokemones")
public class Poqemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private Integer idPokemon;

    private String pokemon;

    private String detalle;

    private Boolean evolucion;

    public Integer getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Integer idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(Boolean evolucion) {
        this.evolucion = evolucion;
    }
}
