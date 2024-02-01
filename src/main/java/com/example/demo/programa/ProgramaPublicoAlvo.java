package com.example.demo.programa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.MimospringApplication;
import com.example.demo.dados.CrudPblicoAlvo;
import com.example.demo.model.PublicoAlvo;


public class ProgramaPublicoAlvo {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(MimospringApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CrudPblicoAlvo crud = applicationContext.getBean(CrudPblicoAlvo.class);
		
		PublicoAlvo publicoNovo = new PublicoAlvo();
		publicoNovo.setCodigoCampanhaSistema(544l);
		publicoNovo.setCodigoTipoCarteira(545l);
		
		crud.salvar(publicoNovo);
		
		
		
		crud.listar().forEach(publico -> System.out.println("Publico " + publico.getCodigoTipoCarteira()));
		
	}
	
}
