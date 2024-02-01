package com.example.demo.dados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.PublicoAlvo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CrudPblicoAlvo {
	
	@PersistenceContext
	EntityManager manager;
	
	public List<PublicoAlvo> listar(){
		return manager.createQuery("from PublicoAlvo").getResultList();
	}
	
	@Transactional
	public void salvar(PublicoAlvo publico) {
		manager.persist(publico);
	}

}
