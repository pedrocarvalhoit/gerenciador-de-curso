package br.com.alura;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", ""
				+ "Paula Silveira.");
		
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Ceiando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecões", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 123123);
		Aluno a2 = new Aluno("Guilherme", 321321);
		Aluno a3 = new Aluno("Mauricio", 321321);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		System.out.println(alunos);
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println(alunosSincronizados);
		
	}

}
