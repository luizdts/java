package jsfprimefaces.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.repositories.AlunoRepository;

public class CadastroAlunoService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoRepository alunos;
	
	@Transactional
	public void salva(Aluno aluno) {
		alunos.inserirAluno(aluno);
	}
	
	@Transactional
	public void deletar(Aluno aluno) {
		alunos.remover(aluno);
	}
	

	public void editar(Aluno aluno) {
		alunos.update(aluno);
	}
	
	public List<Aluno> findAll(){
		return alunos.findAll();
	}
}
