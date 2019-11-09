package br.com.fiap.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StartupUsuarioJson {

    @JsonProperty("startup")
    private String idStartp;

    @JsonProperty("usuario")
    private String uuidUsuario;

    public String getIdStartp() {
        return idStartp;
    }

    public void setIdStartp(String idStartp) {
        this.idStartp = idStartp;
    }

    public String getUuidUsuario() {
        return uuidUsuario;
    }

    public void setUuidUsuario(String uuidUsuario) {
        this.uuidUsuario = uuidUsuario;
    }
}
