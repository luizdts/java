package jsfprimefaces.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import jsfprimefaces.entities.Aluno;

public class AlunoRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	@Inject
	private EntityManager em;
	
	public AlunoRepository() {	
	}
	
	public Aluno findAluno(Long id) {
		return em.find(Aluno.class, id);
	}
	
	public List<Aluno> findAll() {
		return em.createQuery("from Aluno", Aluno.class).getResultList();
		//TypedQuery<Aluno> query = manager.createQuery("from Aluno", Aluno.class);
		//return query.getResultList();
	}
	
	
	public void inserirAluno(Aluno aluno) {
		em.merge(aluno);
	}
	
	public void remover(Aluno aluno) {
		aluno = findAluno(aluno.getId());
		em.remove(aluno);
	}
	
	public Aluno update(Aluno aluno) {
		return em.merge(aluno);
	}
}
