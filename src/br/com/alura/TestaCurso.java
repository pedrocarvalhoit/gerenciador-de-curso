package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", ""
				+ "Paula Silveira.");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Ceiando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecões", 22));
		
		
		System.out.println(javaColecoes.getAulas());
		
		
	}

}
