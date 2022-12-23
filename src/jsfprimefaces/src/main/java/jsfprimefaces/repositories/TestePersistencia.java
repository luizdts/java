/*package jsfprimefaces.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jsfprimefaces.entities.Aluno;
import jsfprimefaces.entities.Pessoa;
*/
/*
public class TestePersistencia {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jsf");
		
		EntityManager em = emf.createEntityManager();
		
		AlunoRepository repository = new AlunoRepository(em);
	
		
*/		
		
/*		
		em.getTransaction().begin();
		Pessoa p1 = new Pessoa(null, "Teste", "13456789215");
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("20194567891");
		aluno1.setAnoDeEntrada("2019");
		aluno1.setPessoa(p1);

		repository.inserirAluno(aluno1);
		
		em.getTransaction().commit();
	
		repository.findAluno(7L);
		
		
		
		em.close();
		emf.close();
	}
	
}
*/