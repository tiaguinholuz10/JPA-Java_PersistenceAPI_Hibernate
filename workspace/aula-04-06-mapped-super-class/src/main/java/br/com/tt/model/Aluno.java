package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno extends Pessoa {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_seq", allocationSize = 1)
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String matricula;
	private String curso;
	private String turma;
	private Double nota;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, String matricula) {
		super(cpf, nome);
		this.matricula = matricula;
	}

	public Aluno(String nome, String cpf, String matricula, String curso) {
		super(cpf, nome);
		this.matricula = matricula;
		this.curso = curso;
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
