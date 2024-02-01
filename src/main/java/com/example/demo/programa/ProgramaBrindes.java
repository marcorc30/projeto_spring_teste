package com.example.demo.programa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.example.demo.MimospringApplication;
import com.example.demo.dados.CrudBrindes;
import com.example.demo.model.Brinde;
import com.example.demo.model.ImagemBrinde;

public class ProgramaBrindes {
	
	public static void main(String[] args) {
		
		//iniciar uma aplicacao spring
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(MimospringApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CrudBrindes crud = applicationContext.getBean(CrudBrindes.class);
		
		
		Brinde brinde = new Brinde();
		
		brinde.setCodigoHashBrinde("asfasdfas");
		brinde.setCodigoTipoEntregaBrinde(1l);
		brinde.setQuantidadePontosDescricaoBrinde(20l);
		brinde.setValorBrinde(new BigDecimal(20));
		brinde.setNomeBrinde("sorvete");
		
		ImagemBrinde imagem = new ImagemBrinde();
//		imagem.setId(6l); //com MapsId essa linha não é necessária
		imagem.setNumeroSequencialTextoBrinde(545l);
		imagem.setTextoImagemBrinde("ljlkjlk");
		
		brinde.setImagemBrinde(imagem);
		imagem.setBrinde(brinde);
		
		crud.salvar(brinde);

		
	}

}
