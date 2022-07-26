package br.com.alura;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Rascunho {
	
	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate futuro = LocalDate.of(2099, 01, 25);
		System.out.println(futuro);
		
		LocalDate futuroDois = LocalDate.of(2099, Month.JANUARY, 25);
		
		//periodo entre as duas
		
		Period periodo = Period.between(agora, futuroDois);
		System.out.println(periodo);
		
		//formatando as datas
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		
		
		
	}
}
