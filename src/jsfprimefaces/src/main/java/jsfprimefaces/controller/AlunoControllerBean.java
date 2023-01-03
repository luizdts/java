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
	
	private Aluno aluno;

	private Pessoa pessoa;
	
	private List<Aluno> listaAlunos;
	
	private Converter alunoConverter;
	
	public void novoAluno() {
		aluno = new Aluno();
		
		aluno.setPessoa(new Pessoa());
	}
	
	public void edicaoAluno() {
		alunoConverter = new IdConverter(Arrays.asList(aluno));
	}
	
	public void findAll() {
		listaAlunos = service.findAll();
	}

	public void salvar() { // salva o aluno (botao novo aluno)

		service.salva(aluno);
		messages.info("Aluno cadastrado com sucesso.");
	}
	
	public void salvaAluno() { // tentativa de inserir o aluno na pag de cadastro
		aluno = new Aluno();
		
		aluno.setMatricula(aluno.getMatricula());
		aluno.setAnoDeEntrada(aluno.getAnoDeEntrada());
		aluno.setPessoa(new Pessoa());
		
		service.salva(aluno);
		messages.info("Aluno cadastrado com sucesso.");
	}
	
	public void delete() {
		
		service.deletar(aluno);
		
		aluno = null;
		
		messages.info("Aluno excluído com sucesso.");
	}
	
	public Aluno update(Aluno aluno) {
		service.editar(aluno);
		
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
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public boolean isAlunoSelect() {
    	return aluno != null && aluno.getId() != null;
    }
	
	public String redirectListaAlunos() {
		return "ListaAlunos?faces-redirect=true";
	}
	
	public String redirectNovoAluno() {
		return "CadastroAluno?faces-redirect=true";
	}
}
