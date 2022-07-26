package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OrdenandoTempoDeAula {
	
	public static void main(String[] args) {
		
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("JavaS", 150));
		cursos.add(new Cursos("Java 8", 133));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparingInt(Cursos::getAlunos));
	
	
	
	}

}
