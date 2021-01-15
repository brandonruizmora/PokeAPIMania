import React from "react";
import SearchModal from "./SearchModal";
import AboutModal from './AboutModal';
import InfoPokemonModal from './InfoPokemonModal';
import TyposModal from './TypeosModal';

const MainPage = () => {
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
            data-bs-target="#productos"
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
            data-bs-target="#infopokemodal"
          >
            Contacto
          </button>
        </div>
      </div>
    </div>
    <SearchModal />
    <AboutModal />
    <InfoPokemonModal />
    <TyposModal />
    </div>
  );
};

export default MainPage;
