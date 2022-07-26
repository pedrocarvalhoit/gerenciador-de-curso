package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		 Collection<String> alunos = new HashSet<>();
		 alunos.add("Rodrigo");
		 alunos.add("Pedro");
		 alunos.add("Victor");
		 alunos.add("Thamires");
		 alunos.add("lulu");
		 alunos.add("Raquel");
		
		 alunos.forEach(aluno -> {
			 System.out.println(aluno);
		 });
		 
		 for (String aluno : alunos) {
			System.out.println(aluno);
		}
		 
		 

	}

}
