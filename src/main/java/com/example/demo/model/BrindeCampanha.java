package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cmh_brn_pj")
@Data
public class BrindeCampanha {
	
	@EmbeddedId
	private BrindeCampanhaId brindeCampanhaId;
		
	@Column(name = "in_cmh_brn_pj_atv")
	private String ativo;
	
	
}
