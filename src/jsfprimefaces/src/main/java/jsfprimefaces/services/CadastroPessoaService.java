package jsfprimefaces.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.entities.Pessoa;
import jsfprimefaces.repositories.PessoaRepository;
import jsfprimefaces.utils.Transacional;

public class CadastroPessoaService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaRepository pessoas;
	
	@Transacional
	public void salva(Pessoa pessoa) {
		pessoas.inserirPessoa(pessoa);
	}
	
	@Transacional
	public void deletar(Pessoa pessoa) {
		pessoas.remover(pessoa);
	}
	

	public void editar(Pessoa pessoa) {
		pessoas.update(pessoa);
	}
	
	public List<Pessoa> findAll(){
		return pessoas.findAll();
	}
}
