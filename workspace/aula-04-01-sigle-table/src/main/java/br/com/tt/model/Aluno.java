package br.com.tt.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CLASSE_ALUNO")
public class Aluno extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private String matricula;
	private String curso;
	private String turma;
	private Double nota;
	public Aluno() {
		super();
	}
	public Aluno( String nome, String cpf, String matricula) {
		super(cpf, nome);
		this.matricula = matricula;
	}
	public Aluno(String nome, String cpf,  
						String matricula, String curso) {
		super(cpf, nome);
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}

	

	
	

}
