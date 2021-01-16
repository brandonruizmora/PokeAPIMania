package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.service.PokemonService;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/all")
    public List<Pokemon> getAll(){
        return pokemonService.getAll();
    }
}
