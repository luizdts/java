package com.jsfprimefaces.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsfprimefaces.model.Empresa;

public class SchemaGeneration {
	
	
	public static void main(String[] args) {		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-persistence");
		
		EntityManager em = emf.createEntityManager();
		
		List<Empresa> lista = em.createQuery("from empresa", Empresa.class)
				.getResultList();
		
		System.out.println(lista);
		
		em.close();
		emf.close();
	}
	
}
