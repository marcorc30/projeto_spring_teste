package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "im_brn_pj")

@Data
@NoArgsConstructor
public class ImagemBrinde implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_brn")
	private Long id;
	
	
	@Column(name = "nr_seql_tx_brn")
	private Long numeroSequencialTextoBrinde = 1l;
	
	@Column(name = "tx_im_brn")
	private String textoImagemBrinde;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "cd_brn")
	private Brinde brinde;


}
