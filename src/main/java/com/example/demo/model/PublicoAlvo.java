package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pbco_alvo_cmh")
public class PublicoAlvo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_pbco_alvo_cmh")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoPublicoAlvo;
	
	@Column(name = "cd_cmh_crid_sis")
	private Long codigoCampanhaSistema;
	
	@Column(name = "cd_tip_ctra")
	private Long codigoTipoCarteira;

	public Long getCodigoPublicoAlvo() {
		return codigoPublicoAlvo;
	}

	public void setCodigoPublicoAlvo(Long codigoPublicoAlvo) {
		this.codigoPublicoAlvo = codigoPublicoAlvo;
	}

	public Long getCodigoCampanhaSistema() {
		return codigoCampanhaSistema;
	}

	public void setCodigoCampanhaSistema(Long codigoCampanhaSistema) {
		this.codigoCampanhaSistema = codigoCampanhaSistema;
	}

	public Long getCodigoTipoCarteira() {
		return codigoTipoCarteira;
	}

	public void setCodigoTipoCarteira(Long codigoTipoCarteira) {
		this.codigoTipoCarteira = codigoTipoCarteira;
	}
	
	

}
