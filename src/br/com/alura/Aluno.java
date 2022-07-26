package br.com.alura;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int i) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = i;
	}
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno)obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Matr�cula " + this.numeroMatricula; 
	}
	
	
	
	
}
