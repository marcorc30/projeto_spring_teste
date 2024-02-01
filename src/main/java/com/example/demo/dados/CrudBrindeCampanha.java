package com.example.demo.dados;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.BrindeCampanha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CrudBrindeCampanha {
	
	@PersistenceContext
	EntityManager manager;
	
	public List<BrindeCampanha> listar() {
		return manager.createQuery("from BrindeCampanha", BrindeCampanha.class).getResultList();				
	}
	
	@Transactional
	public void salvar(BrindeCampanha brindeCampanha) {
		manager.persist(brindeCampanha);
	}

}
