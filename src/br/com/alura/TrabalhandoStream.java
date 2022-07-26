package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrabalhandoStream {
	
	public static void main(String[] args) {
		
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("JavaS", 150));
		cursos.add(new Cursos("Java 8", 133));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparingInt(Cursos::getAlunos));
		
		//imprimindo nome dos cursos com mais de 50 alunos
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.forEach(c -> System.out.println(c.getNome()));
	
		//imprimindo alunos dos cursos com mais de 50 alunos
		Stream<String> nomes = cursos.stream().map(Cursos::getNome);
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.map(c -> c.getAlunos())
		.forEach(System.out::println);
		
		//pegando o primeiro curso apenas com mais de 50
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.findFirst();
		
		//fazendo a média dos alunos nos cursos
		cursos.stream()
		.mapToInt(c -> c.getAlunos())
		.average();
		
		//passando estes cursos pra uma lista
		List<Cursos> cursosFiltrados = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.collect(Collectors.toList());
		
		
	}

}
