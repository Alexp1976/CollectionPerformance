package com.teste;

import java.util.Objects;

public class Aluno {

	private int matricula;
	private String nome;

	public Aluno(int matricula) {		
		this.matricula = matricula;
		this.nome = "Aluno" + matricula;		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula, nome);
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
		return matricula == other.matricula && Objects.equals(nome, other.nome);
	}
	
}
