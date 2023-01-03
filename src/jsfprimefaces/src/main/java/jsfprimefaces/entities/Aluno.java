package jsfprimefaces.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="graduacao.aluno")
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String matricula;
	private String ano_de_entrada;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa", referencedColumnName = "id", nullable = true)
	private Pessoa pessoa;
	
	public Aluno() {
	}
	
	public Aluno(Long id, String matricula, String anoDeEntrada) {
		this.id = id;
		this.matricula = matricula;
		this.ano_de_entrada = anoDeEntrada;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAnoDeEntrada() {
		return ano_de_entrada;
	}

	public void setAnoDeEntrada(String anoDeEntrada) {
		this.ano_de_entrada = anoDeEntrada;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + 
				", ano de entrada=" + ano_de_entrada + "]";
	}
}
