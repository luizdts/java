package jsfprimefaces.services;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import jsfprimefaces.entities.Pessoa;
import jsfprimefaces.repositories.PessoaRepository;

public class CadastroPessoaService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaRepository pessoas;
	
	@Transactional
	public void save(Pessoa pessoa) {
		pessoas.insert(pessoa);
	}
	
	@Transactional
	public void delete(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
}
