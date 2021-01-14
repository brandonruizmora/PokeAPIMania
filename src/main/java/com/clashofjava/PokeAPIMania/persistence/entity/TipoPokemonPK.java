package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TipoPokemonPK implements Serializable {

    @Column(name = "id_pokemon")
    private Integer idPokemon;

    @Column(name = "id_tipo")
    private Integer idTipo;

    public Integer getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Integer idPokemon) {
        this.idPokemon = idPokemon;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
}
