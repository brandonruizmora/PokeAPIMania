import React from "react";

const AboutModal = () => {
  return (
    <div
      className="modal fade"
      id="aboutmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Nosotros
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
              <h1 className="display-1">PokéAPIMania</h1>
              <p className="lead mb-md-3">
                The Pokémon Términos de uso Aviso sobre la privacidad Página de
                Cookies Información legal ©2021 Pokémon
              </p>
              <hr className="bg-light" />
            </div>
            <div>
              <h1 className="display-2">PokéAPIMania</h1>
              <p className="lead mb-md-3">
                Brandon Ruiz Morales Juan Alejandro Rendon Lucio Erick Osvaldo
                Carreon Rivera Tere Griselda Valadez Hernandez
              </p>
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

export default AboutModal;
