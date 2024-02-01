package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cmh_pj")
public class Campanha {
	
	@Id
	@Column(name = "cd_cmh")
	private Long codigoCampanha;

	@Column(name = "nm_cmh")
	private String nomeCampanha;

	@Column(name = "tx_dcr_cmh")	
	private String textoDescricaoCampanha;
	
	@Column(name = "dt_inc_cmh")	
	private LocalDate dataInicioCampanha;
	
	@Column(name = "dt_fim_cmh")
	private LocalDate dataFimCampanha;
	
	@Column(name = "qt_brn_ctra")	
	private Integer quantidadeBrindeCarteira;
	
	@Column(name = "qt_brn_cli")
	private Integer quantidadeBrindeCliente;
	
	@ManyToOne
	@JoinColumn(name = "cd_pbco_alvo_cmh")
	private PublicoAlvo publicoAlvo;
	
	

	public Long getCodigoCampanha() {
		return codigoCampanha;
	}

	public void setCodigoCampanha(Long codigoCampanha) {
		this.codigoCampanha = codigoCampanha;
	}

	public String getNomeCampanha() {
		return nomeCampanha;
	}

	public void setNomeCampanha(String nomeCampanha) {
		this.nomeCampanha = nomeCampanha;
	}

	public String getTextoDescricaoCampanha() {
		return textoDescricaoCampanha;
	}

	public void setTextoDescricaoCampanha(String textoDescricaoCampanha) {
		this.textoDescricaoCampanha = textoDescricaoCampanha;
	}

	public LocalDate getDataInicioCampanha() {
		return dataInicioCampanha;
	}

	public void setDataInicioCampanha(LocalDate dataInicioCampanha) {
		this.dataInicioCampanha = dataInicioCampanha;
	}

	public LocalDate getDataFimCampanha() {
		return dataFimCampanha;
	}

	public void setDataFimCampanha(LocalDate dataFimCampanha) {
		this.dataFimCampanha = dataFimCampanha;
	}

	public Integer getQuantidadeBrindeCarteira() {
		return quantidadeBrindeCarteira;
	}

	public void setQuantidadeBrindeCarteira(Integer quantidadeBrindeCarteira) {
		this.quantidadeBrindeCarteira = quantidadeBrindeCarteira;
	}

	public Integer getQuantidadeBrindeCliente() {
		return quantidadeBrindeCliente;
	}

	public void setQuantidadeBrindeCliente(Integer quantidadeBrindeCliente) {
		this.quantidadeBrindeCliente = quantidadeBrindeCliente;
	}

	public PublicoAlvo getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}


	
	

}
