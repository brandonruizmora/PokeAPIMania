package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.service.PokemonService;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemones")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    public List<Pokemon> getAll(){
        return pokemonService.getAll();
    }
}
