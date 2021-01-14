package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipoPokemon")
public class TipoPokemon {

    @EmbeddedId
    private TipoPokemonPK id;

    @ManyToOne
    @MapsId("idPokemon")
    @JoinColumn(name = "id_pokemon", insertable = false, updatable = false)
    private Pokemon pokemon;

    @ManyToOne
    @JoinColumn(name = "id_tipo", insertable = false, updatable = false)
    private Tipo tipo;

    public TipoPokemonPK getId() {
        return id;
    }

    public void setId(TipoPokemonPK id) {
        this.id = id;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
