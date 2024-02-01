package com.example.demo.dados;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Brinde;
import com.example.demo.model.ImagemBrinde;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CrudBrindes {

	@PersistenceContext
	private EntityManager manager;

	public List<Brinde> listar() {
		return manager.createQuery("from Brinde", Brinde.class).getResultList();

	}

	@Transactional
	public void salvar(Brinde brinde) {
		manager.persist(brinde);
	}
	
	@Transactional
	public void salvar(ImagemBrinde imagem) {
		manager.persist(imagem);
	}
	
}
