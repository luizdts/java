package jsfprimefaces.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import jsfprimefaces.entities.Aluno;
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
	
	public Pessoa findPessoa(Long id) {
		return em.find(Pessoa.class, id);
	}
	public List<Pessoa> findAll(){
		return em.createQuery("from Pessoa", Pessoa.class).getResultList();
	}
	
	public void inserirPessoa(Pessoa pessoa) {
		em.persist(pessoa);
	}
	
	public void remover(Pessoa pessoa) {
		pessoa = findPessoa(pessoa.getId());
		em.remove(pessoa);
	}
	
	public Pessoa update(Pessoa pessoa) {
		return em.merge(pessoa);
	}
	
}
