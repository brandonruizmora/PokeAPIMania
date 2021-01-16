package com.clashofjava.PokeAPIMania.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipos_pokemones")
public class TipoPokemones {

    @Column(name = "id_tipo_primario")
    private String idTipoPrimario;

    @Column(name = "id_tipo_secundario")
    private String idTipoSecundario;

    @ManyToOne
    @JoinColumn(name = "id_pokemon", insertable = false, updatable = false)
    private Pokemones pokemones;

    public String getIdTipoPrimario() {
        return idTipoPrimario;
    }

    public void setIdTipoPrimario(String idTipoPrimario) {
        this.idTipoPrimario = idTipoPrimario;
    }

    public String getIdTipoSecundario() {
        return idTipoSecundario;
    }

    public void setIdTipoSecundario(String idTipoSecundario) {
        this.idTipoSecundario = idTipoSecundario;
    }

    public Pokemones getPokemones() {
        return pokemones;
    }

    public void setPokemones(Pokemones pokemones) {
        this.pokemones = pokemones;
    }
}
