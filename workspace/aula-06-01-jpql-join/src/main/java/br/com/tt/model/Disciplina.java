package br.com.tt.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the disciplinas database table.
 * 
 */
@Entity
@Table(name = "disciplinas")
@NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DISCIPLINAS_CODDISC_GENERATOR", sequenceName = "DISCIPLINAS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DISCIPLINAS_CODDISC_GENERATOR")
	@Column(name = "cod_disc", unique = true, nullable = false)
	private Integer codDisc;

	@Column(name = "cod_disc_equiv")
	private Integer codDiscEquiv;

	@Column(name = "nom_disc", nullable = false, length = 60)
	private String nomDisc;

	@Column(name = "qtd_cred", nullable = false)
	private Integer qtdCred;

	// bi-directional many-to-one association to Curriculo
	@OneToMany(mappedBy = "disciplina")
	private List<Curriculo> curriculos;

	// bi-directional one-to-one association to Disciplina
	@OneToOne
	@JoinColumn(name = "cod_disc", nullable = false, insertable = false, updatable = false)
	private Disciplina disciplina1;

	// bi-directional one-to-one association to Disciplina
	@OneToOne(mappedBy = "disciplina1")
	private Disciplina disciplina2;

	// bi-directional many-to-many association to Disciplina
	@ManyToMany
	@JoinTable(name = "pre_requisitos", joinColumns = {
			@JoinColumn(name = "cod_disc_pre", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "cod_disc", nullable = false) })
	private List<Disciplina> disciplinas1;

	// bi-directional many-to-many association to Disciplina
	@ManyToMany(mappedBy = "disciplinas1")
	private List<Disciplina> disciplinas2;

	public Disciplina() {
	}

	public Integer getCodDisc() {
		return this.codDisc;
	}

	public void setCodDisc(Integer codDisc) {
		this.codDisc = codDisc;
	}

	public Integer getCodDiscEquiv() {
		return this.codDiscEquiv;
	}

	public void setCodDiscEquiv(Integer codDiscEquiv) {
		this.codDiscEquiv = codDiscEquiv;
	}

	public String getNomDisc() {
		return this.nomDisc;
	}

	public void setNomDisc(String nomDisc) {
		this.nomDisc = nomDisc;
	}

	public Integer getQtdCred() {
		return this.qtdCred;
	}

	public void setQtdCred(Integer qtdCred) {
		this.qtdCred = qtdCred;
	}

	public List<Curriculo> getCurriculos() {
		return this.curriculos;
	}

	public void setCurriculos(List<Curriculo> curriculos) {
		this.curriculos = curriculos;
	}

	public Curriculo addCurriculo(Curriculo curriculo) {
		getCurriculos().add(curriculo);
		curriculo.setDisciplina(this);

		return curriculo;
	}

	public Curriculo removeCurriculo(Curriculo curriculo) {
		getCurriculos().remove(curriculo);
		curriculo.setDisciplina(null);

		return curriculo;
	}

	public Disciplina getDisciplina1() {
		return this.disciplina1;
	}

	public void setDisciplina1(Disciplina disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public Disciplina getDisciplina2() {
		return this.disciplina2;
	}

	public void setDisciplina2(Disciplina disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public List<Disciplina> getDisciplinas1() {
		return this.disciplinas1;
	}

	public void setDisciplinas1(List<Disciplina> disciplinas1) {
		this.disciplinas1 = disciplinas1;
	}

	public List<Disciplina> getDisciplinas2() {
		return this.disciplinas2;
	}

	public void setDisciplinas2(List<Disciplina> disciplinas2) {
		this.disciplinas2 = disciplinas2;
	}

}