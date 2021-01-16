package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipos_pokemones")
public class TiposPokemones {

    @EmbeddedId
    private TiposPokemonesPK id;

    @Column(name = "id_tipo_primario")
    private Integer idTipoPrimario;

    @Column(name = "id_tipo_secundario")
    private Integer idTipoSecundario;

    @ManyToOne
    @MapsId("idPokemon")
    @JoinColumn(name = "id_pokemon", insertable = false, updatable = false)
    private Pokemon pokemon;

    public Integer getIdTipoPrimario() {
        return idTipoPrimario;
    }

    public void setIdTipoPrimario(Integer idTipoPrimario) {
        this.idTipoPrimario = idTipoPrimario;
    }

    public Integer getIdTipoSecundario() {
        return idTipoSecundario;
    }

    public void setIdTipoSecundario(Integer idTipoSecundario) {
        this.idTipoSecundario = idTipoSecundario;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
