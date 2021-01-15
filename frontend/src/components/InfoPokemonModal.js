import React from "react";
import img from "../img/pokecharmnader.png";

const InfoPokemonModal = () => {
  return (
    <div
      className="modal fade"
      id="infopokemodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Pokémon
            </h5>
            <a type="button" data-bs-dismiss="modal" aria-label="Close">
              <span className="fa-layers fa-fw">
                <i className="fas fa-circle colorT"></i>
                <i
                  className="fa-inverse fas fa-times"
                  data-fa-transform="shrink-6"
                ></i>
              </span>
            </a>
            </div>
          <div className="modal-body">
            <div>
              <h7 className="display-1"></h7>
               <p className="lead mb-md-1">
               CHARMANDER
              </p>
              <hr className="bg-light" />
            </div>
            <div className="modal-body">
            <div>
              <h7 className="display-1"></h7>
               <p className="lead mb-md-1">
               Este Pokémon nace con una llama en la punta de la cola.
               Prefiere las cosas calientes.
               Dicen que cuando llueve le sale vapor de la punta de la cola.
               Si la llama se apagara, el Pokémon se debilitaría. "
              </p>
              <hr className="bg-light" />
            </div>
            <div>
              <h7 className="display-1"></h7>
               <p className="lead mb-md-1">
               Categoria | Fuego 
              </p>
              <hr className="bg-light" />
            </div>
            <div>
              <h7 className="display-1"></h7>
               <p className="lead mb-md-1">
               Evolucion | Charmeleon
              </p>
              <hr className="bg-light" />
            </div>
              <hr className="bg-light" />
            </div>           
          </div>
          <div className="modal-footer">
            <button
              type="button"
              className="btn btn-danger"
              data-bs-dismiss="modal"
            >
              Cerrar
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default InfoPokemonModal;
