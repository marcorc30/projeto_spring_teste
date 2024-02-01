package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "brn_pj")

@Data
@NoArgsConstructor
public class Brinde implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_brn")
	private Long codigoBrinde;
		
	
	
	@OneToOne(mappedBy = "brinde", cascade = CascadeType.ALL)
	private ImagemBrinde imagemBrinde;
	
	@Column(name = "nm_brn")
	private String nomeBrinde;
	
	@Column(name = "vl_brn")
	private BigDecimal valorBrinde;
	
	@Column(name = "cd_hash_brn")
	private String codigoHashBrinde;
	
	@Column(name = "cd_tip_etga_brn")
	private Long codigoTipoEntregaBrinde;
	
	@Column(name = "tx_dcr_brn")
	private String textoDescricaoBrinde;
	
	@Column(name = "qt_pto_rsgt_brn")
	private Long quantidadePontosDescricaoBrinde;
	

	
	
}
