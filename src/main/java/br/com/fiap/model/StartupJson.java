package br.com.fiap.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartupJson {

	@JsonProperty("startup_id")
	private String startupId;

	@JsonProperty("uuid_founder")
	private String uuidFounder;

	@JsonProperty("nome_fantasia")
	@NotNull
	private String nomeFantasia;
	
	@JsonProperty("razao_social")
	private String razaoSocial;

	@JsonProperty("cnjp")
	private String cnjp;

	@JsonProperty("email")
	private String email;

	@JsonProperty("data_cadastro")
	private String dataCadastro;

	@JsonProperty("endereco")
	private EnderecoJson endereco;


	public String getStartupId() {
		return startupId;
	}

	public void setStartupId(String startupId) {
		this.startupId = startupId;
	}

	public String getUuidFounder() {
		return uuidFounder;
	}

	public void setUuidFounder(String uuidFounder) {
		this.uuidFounder = uuidFounder;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnjp() {
		return cnjp;
	}

	public void setCnjp(String cnjp) {
		this.cnjp = cnjp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnderecoJson getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoJson endereco) {
		this.endereco = endereco;
	}
}
