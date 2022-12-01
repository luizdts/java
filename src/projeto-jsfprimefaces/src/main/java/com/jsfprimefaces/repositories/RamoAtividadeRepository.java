package com.jsfprimefaces.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.jsfprimefaces.model.RamoAtividade;

public class RamoAtividadeRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager em;
	
	public RamoAtividadeRepository() {
		
	}
	
	public RamoAtividadeRepository(EntityManager em) {
		this.em = em;
	}
	
	public List<RamoAtividade> find(String descricao){
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<RamoAtividade> criteriaQuery = criteriaBuilder.createQuery(RamoAtividade.class);	
		Root<RamoAtividade> root = criteriaQuery.from(RamoAtividade.class);	
		criteriaQuery.select(root);	
		criteriaQuery.where(criteriaBuilder.like(root.get("descricao"), descricao + "%"));
		
		TypedQuery<RamoAtividade> query = em.createQuery(criteriaQuery);
		
		return query.getResultList();
	}
}
