package jsfprimefaces.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.entities.Pessoa;
import jsfprimefaces.services.CadastroAlunoService;
import jsfprimefaces.utils.FacesMessages;

@Named
@ViewScoped
public class AlunoControllerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroAlunoService service;
	
	@Inject
	private FacesMessages messages;
	
	@Inject
	private Aluno aluno;
	
	@Inject
	private Pessoa pessoa;
	
	private List<Aluno> listaAlunos;
	
	public void findAll() {
		listaAlunos = service.findAll();
	}
	
	public void salvar() {
		messages.info("Aluno cadastrado com sucesso.");
	}
	
	public void deletar(Long id) {
		
		service.deletar(aluno);
		
		messages.info("Aluno excluído com sucesso.");
	}
	
	public Aluno update(Aluno aluno) {
		return aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}
	
	public String redirectListaAlunos() {
		return "ListaAlunos.xhtml?faces-redirect=true";
	}
	
	public String redirectNovoAluno() {
		return "CadastroAluno?faces-redirect=true";
	}
}
