package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pcr_bb")
public class Parceiro implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_cli")
	private Long id;
	
	@Column(name = "in_pcr_bb")
	private String indicadorParceiro;
	
	@Column(name = "cd_prf_depe")
	private Long codigoPrefixoDependencia;
	
	@Column(name = "nr_cc_cli")
	private Long numeroContaCorrente;
	
	@OneToMany
	@JoinColumn(name = "cd_cli")
	private List<Brinde> brindes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndicadorParceiro() {
		return indicadorParceiro;
	}

	public void setIndicadorParceiro(String indicadorParceiro) {
		this.indicadorParceiro = indicadorParceiro;
	}

	public Long getCodigoPrefixoDependencia() {
		return codigoPrefixoDependencia;
	}

	public void setCodigoPrefixoDependencia(Long codigoPrefixoDependencia) {
		this.codigoPrefixoDependencia = codigoPrefixoDependencia;
	}

	public Long getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(Long numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	
	
	
	public List<Brinde> getBrindes() {
		return brindes;
	}

	public void setBrindes(List<Brinde> brindes) {
		this.brindes = brindes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parceiro other = (Parceiro) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Parceiro [id=" + id + ", indicadorParceiro=" + indicadorParceiro + ", codigoPrefixoDependencia="
				+ codigoPrefixoDependencia + ", numeroContaCorrente=" + numeroContaCorrente + "]";
	}
	

	
}
