package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Professor extends Pessoa {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "professor_seq", sequenceName = "professor_seq", allocationSize = 1)
	@GeneratedValue(generator = "professor_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String pisPasep;
	private Double salario;
	private String turno;

	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, String pisPasep, Double salario, String turno) {
		super(nome, cpf);
		this.pisPasep = pisPasep;
		this.salario = salario;
		this.turno = turno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
