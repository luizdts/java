package jsfprimefaces.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jsfprimefaces.entities.Pessoa;
import jsfprimefaces.repositories.PessoaRepository;
import jsfprimefaces.services.CadastroPessoaService;
import jsfprimefaces.utils.FacesMessages;

@Named
@ViewScoped
public class PessoaControllerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaRepository repository;
	
	@Inject
	private CadastroPessoaService service;
	
	@Inject
	private Pessoa pessoa;
	
	private List<Pessoa> listaPessoa;
	
	@Inject
	private FacesMessages messages;
	
	private Converter idConverter;
	
	public void findAll() {
		listaPessoa = repository.findAll();
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
