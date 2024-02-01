package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class BrindeCampanhaId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "cd_brn")
	private Long brindeId;
	
	@Column(name = "cd_cmh")
	private Long campanhaId;
	
	
}
