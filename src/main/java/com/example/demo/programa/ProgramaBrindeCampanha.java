package com.example.demo.programa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.example.demo.MimospringApplication;
import com.example.demo.dados.CrudBrindeCampanha;
import com.example.demo.dados.CrudPblicoAlvo;
import com.example.demo.model.BrindeCampanha;
import com.example.demo.model.BrindeCampanhaId;

public class ProgramaBrindeCampanha {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(MimospringApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		
		
		CrudBrindeCampanha crud = applicationContext.getBean(CrudBrindeCampanha.class);
		
		BrindeCampanha brindeCampanhaNovo = new BrindeCampanha();
		BrindeCampanhaId id = new BrindeCampanhaId();
		id.setBrindeId(27l);
		id.setCampanhaId(1l);
		brindeCampanhaNovo.setAtivo("N");
//		brindeCampanhaNovo.getBrindeCampanhaId().setBrindeId(27l);
//		brindeCampanhaNovo.getBrindeCampanhaId().setCampanhaId(1l);
		brindeCampanhaNovo.setBrindeCampanhaId(id);
	
		
		crud.salvar(brindeCampanhaNovo);
		
		
		
		
		crud.listar().forEach(brindeCampanha -> System.out.println(brindeCampanha.getBrindeCampanhaId().getBrindeId()));
		
	}

}
