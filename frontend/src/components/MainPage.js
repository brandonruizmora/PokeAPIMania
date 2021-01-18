import React, { useState } from "react";
import SearchModal from "./SearchModal";
import AboutModal from "./AboutModal";
import InfoPokemonModal from "./InfoPokemonModal";
import TyposModal from "./TypeosModal";
import ContactModal from "./ContactModal";
import UploadPokemon from "./UploadPokemon";

const MainPage = () => {
  const [pokemonInfo, setpokemonInfo] = useState([]);
  const [pokemonData, setpokemonData] = useState({});

  const handleClickUpload = (pokemonName, pokemonDetail) => {
    console.log(pokemonName, pokemonDetail);
    handleSaveAPI(pokemonName, pokemonDetail);
  };

  const handleClickSearch = () => {
    handleGetAllAPI();
  };

  const handleClickDeletePokemon = (pokemonId) => {
    handleDeletePokemonAPI(pokemonId);
  };

  const handleClickPokemon = (pokemon) => {
    handleGetPokemonAPI(pokemon.pokemonId);
  };

  const handleResultDeletePokemonAPI = () => {
    handleGetAllAPI();
  }

  const handleDeletePokemonAPI = (pokemonId) => {
    var requestOptions = {
      method: "DELETE",
      redirect: "follow",
    };

    const proxyurl = "https://cors-anywhere.herokuapp.com/";
    const url =
      "https://cryptic-journey-63259.herokuapp.com/pokeapimania/api/pokemons/delete/" +
      pokemonId;

    fetch(proxyurl + url, requestOptions)
      .then((response) => response.text())
      .then((result) => handleResultDeletePokemonAPI(result))
      .catch((error) => console.log("error", error));
  };

  const handleResponseGetPokemonAPI = (result) => {
    setpokemonData(result);
  };

  const handleGetPokemonAPI = (pokemonId) => {
    var requestOptions = {
      method: "GET",
      redirect: "follow",
    };

    const proxyurl = "https://cors-anywhere.herokuapp.com/";
    const url =
      "https://cryptic-journey-63259.herokuapp.com/pokeapimania/api/pokemons/get/?pokemonId=" +
      pokemonId;

    fetch(proxyurl + url, requestOptions)
      .then((response) => response.json())
      .then((result) => handleResponseGetPokemonAPI(result))
      .catch((error) => console.log("error", error));
  };

  const handleResponseGetAllAPI = (result) => {
    setpokemonInfo(result);
  };

  const handleGetAllAPI = () => {
    var requestOptions = {
      method: "GET",
      redirect: "follow",
    };

    const proxyurl = "https://cors-anywhere.herokuapp.com/";
    const url =
      "https://cryptic-journey-63259.herokuapp.com/pokeapimania/api/pokemons/all";

    fetch(proxyurl + url, requestOptions)
      .then((response) => response.json())
      .then((result) => handleResponseGetAllAPI(result))
      .catch((error) => console.log("error", error));
  };

  const handleSaveAPI = (pokemonName, pokemonDetail) => {
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
      pokemon: pokemonName,
      detail: pokemonDetail,
      evolution: "true",
    });

    var requestOptions = {
      method: "POST",
      headers: myHeaders,
      body: raw,
      redirect: "follow",
    };

    const proxyurl = "https://cors-anywhere.herokuapp.com/";
    const url =
      "https://cryptic-journey-63259.herokuapp.com/pokeapimania/api/pokemons/save";

    fetch(proxyurl + url, requestOptions)
      .then((response) => response.text())
      .then((result) => console.log(result))
      .catch((error) => console.log("error", error));
  };

  return (
    <div>
      <div className="container-fluid fondo">
        <div className="row alto align-items-center justify-content-center text-center text-light">
          <div className="col-md-8">
            <div className="display-1">
              <i className="fas fa-cog fa-spin"></i>
            </div>
            <h1 className="display-4">PokéAPIMania</h1>
            <p className="lead mb-md-5">
              Lorem ipsum dolor sit, amet consectetur adipisicing elit.
              Distinctio, praesentium! Tempore, natus. Cumque nemo ipsa aliquid,
              cupiditate aut deleniti reprehenderit.
            </p>
            <hr className="bg-light" />
            <button
              type="button"
              className="btn btn-outline-light mb-2 mb-sm-0 mx-1"
              data-bs-toggle="modal"
              data-bs-target="#searchmodal"
              onClick={handleClickSearch}
            >
              Pokémones
            </button>
            <button
              type="button"
              className="btn btn-outline-light mb-2 mb-sm-0 mx-1"
              data-bs-toggle="modal"
              data-bs-target="#typosmodal"
            >
              Tipos
            </button>
            <button
              type="button"
              className="btn btn-outline-light mb-2 mb-sm-0 mx-1"
              data-bs-toggle="modal"
              data-bs-target="#uploadmodal"
            >
              Subir
            </button>
            <button
              type="button"
              className="btn btn-outline-light mb-2 mb-sm-0 mx-1"
              data-bs-toggle="modal"
              data-bs-target="#aboutmodal"
            >
              Nosotros
            </button>
            <button
              type="button"
              className="btn btn-outline-light mb-2 mb-sm-0 mx-1"
              data-bs-toggle="modal"
              data-bs-target="#contactmodal"
            >
              Contacto
            </button>
          </div>
        </div>
      </div>
      <SearchModal
        pokemonInfo={pokemonInfo}
        handleClickPokemon={handleClickPokemon}
      />
      <AboutModal />
      <InfoPokemonModal
        pokemonData={pokemonData}
        handleClickDeletePokemon={handleClickDeletePokemon}
      />
      <TyposModal />
      <ContactModal />
      <UploadPokemon handleClickUpload={handleClickUpload} />
    </div>
  );
};

export default MainPage;
