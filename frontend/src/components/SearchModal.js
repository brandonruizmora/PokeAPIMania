import React from "react";

const SearchModal = () => {
  return (
    <div
      className="modal fade"
      id="searchmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Busca a tu amigo pokémon
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
            <div className="row">
              <div className="col-md-12 mb-3 mb-0">
                <form>
                  <div className="mb-3 d-flex">
                    <input type="text" className="form-control" />
                    <button className="btn btn-outline-light ms-1">
                      <i className="fas fa-search"></i>
                    </button>
                  </div>
                </form>
              </div>
              <div className="col-md-12 mb-3 mb-0">
                <div class="list-group">
                  <a
                    href="#"
                    class="list-group-item list-group-item-action active"
                    aria-current="true"
                    data-bs-toggle="modal"
                    data-bs-target="#infopokemodal"
                  >
                    Charmander
                  </a>
                  <a href="#" class="list-group-item list-group-item-action">
                    Dapibus ac facilisis in
                  </a>
                  <a href="#" class="list-group-item list-group-item-action">
                    Morbi leo risus
                  </a>
                  <a href="#" class="list-group-item list-group-item-action">
                    Porta ac consectetur ac
                  </a>
                  <a
                    href="#"
                    class="list-group-item list-group-item-action disabled"
                    tabindex="-1"
                    aria-disabled="true"
                  >
                    Vestibulum at eros
                  </a>
                </div>
              </div>
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

export default SearchModal;
