package com.fatec.javabd.model;

import java.util.Objects;

public class Aluno {
	private String ra;
	private String nome;
	private String email;
	private String celular;
	private Integer semestre;
	
	public Aluno(String ra, String nome, String email, String celular, Integer semestre) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.semestre = semestre;
	}

	public Aluno() {}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(celular, email, nome, ra, semestre);
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
		return Objects.equals(celular, other.celular) && Objects.equals(email, other.email)
				&& Objects.equals(nome, other.nome) && Objects.equals(ra, other.ra)
				&& Objects.equals(semestre, other.semestre);
	}
}
