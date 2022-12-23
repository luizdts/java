package jsfprimefaces.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import jsfprimefaces.entities.Pessoa;

public class PessoaRepository implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager em;
	
	public PessoaRepository() {
	}

	public PessoaRepository(EntityManager em) {
		this.em = em;
	}
	
	public Pessoa findById(Long id) {
		return em.find(Pessoa.class, id);
	}
	public List<Pessoa> findAll(){
		return em.createQuery("from Pessoa", Pessoa.class).getResultList();
	}
	
	public Pessoa insert(Pessoa pessoa) {
		return em.merge(pessoa);
	}
	
	public void remove(Pessoa pessoa) {
		pessoa = findById(pessoa.getId());
		em.remove(pessoa);
	}
	
}
