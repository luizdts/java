package jsfprimefaces.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.entities.Pessoa;
import jsfprimefaces.repositories.PessoaRepository;
import jsfprimefaces.services.CadastroPessoaService;
import jsfprimefaces.utils.FacesMessages;

@Named
@ViewScoped
public class PessoaControllerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroPessoaService service;
	

	private Pessoa pessoa;
	
	private List<Pessoa> listaPessoa;
	
	@Inject
	private FacesMessages messages;
	
	private Converter pessoaConverter;
	
	public void novaPessoa() {
		pessoa = new Pessoa();
	}
	
	public void edicaoPessoa() {
		pessoaConverter = new PessoaConverter(Arrays.asList(pessoa));
	}
	
	public void findAll() {
		listaPessoa = service.findAll();
	}
	
	public void salvar() {
		
		service.salva(pessoa);
		messages.info("Pessoa salva com sucesso.");
	}
	
	public void deletar() {
		service.deletar(pessoa);
		pessoa = null;
		messages.info("Pessoa removida com sucesso.");
	}
	
	public Pessoa update(Pessoa pessoa) {
		service.editar(pessoa);
		
		return pessoa;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Pessoa> getListaPessoa() {
		return listaPessoa;
	}
	
	public void setListaPessoa(List<Pessoa> listaPessoa) {
		this.listaPessoa = listaPessoa;
	}
	
}
