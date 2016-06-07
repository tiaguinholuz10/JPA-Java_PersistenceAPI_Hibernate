package br.com.tt.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLASSE_PROFESSOR")
public class Professor extends Pessoa {
	private static final long serialVersionUID = 1L;
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
