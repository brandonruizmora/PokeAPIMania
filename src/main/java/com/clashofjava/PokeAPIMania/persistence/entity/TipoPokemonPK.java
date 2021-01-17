package com.clashofjava.PokeAPIMania.persistence.entity;
/**
 * Clase TiposPokemonPK
 *
 * Contiene los campos de la tabla TiposPokemonPK de la base de datos y a que tabla esta relacionada sus llaves compuestas
 *
 * @author clash of java
 * @version 1.0
 */
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
