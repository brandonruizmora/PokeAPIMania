package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pokemon")
    private Integer idPokemon;

    @Column(name="nombre_pokemon")
    private String nombrePokemon;

    @OneToMany(mappedBy = "pokemon")
    private List<TipoPokemon> tipoPokemon;

    public Integer getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Integer idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public List<TipoPokemon> getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(List<TipoPokemon> tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }
}
