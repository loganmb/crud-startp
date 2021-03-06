package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "STARTUP", uniqueConstraints = { @UniqueConstraint(columnNames = "STARTUP_ID") })
public class Startup implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STARTUP_ID", unique = true, nullable = false)
	private Integer startupId;

	@Column(name = "UUID_FOUNDER")
	//@JoinColumn(name = "CLIENTE_ID", table = "CLIENTE")
	private String uuidFounder;

	@Column(name = "NOME_FANTASIA", unique = true, nullable = false)
	private String nomeFantasia;

	@Column(name = "RAZAO_SOCIAL", unique = true)
	private String razaoSocial;

	@Column(name = "CNJP", unique = true)
	private String cnjp;

	@Column(name = "EMAIL", unique = true)
	private String email;

	@Column(name = "DATA_CADASTRO")
	private String dataCadastro;

	@Column(name = "RUA")
	private String rua;

	@Column(name = "BAIRRO")
	private String bairro;

	@Column(name = "NUMERO")
	private String numero;

	@Column(name = "CIDADE")
	private String cidade;

	@Column(name = "ESTADO")
	private String estado;

	@Column(name = "CEP")
	private String cep;

	@Column(name = "PAIS")
	private String pais;


 	public Integer getStartupId() {
		return startupId;
	}

	public void setStartupId(Integer startupId) {
		this.startupId = startupId;
	}

	public String getUuidFounder() {
		return uuidFounder;
	}

	public void setUuidFounder(String uuidFounder) {
		this.uuidFounder = uuidFounder;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
