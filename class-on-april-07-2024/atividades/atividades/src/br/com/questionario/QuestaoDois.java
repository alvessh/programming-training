package br.com.questionario;

import java.util.Scanner;

public class QuestaoDois {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Quem assumiu a coordenação do projeto que deu origem ao Java?\n"
				+ "	a) James Gosling\n"
				+ "	b) Jonathan Payne\n"
				+ "	c) Patrick Naughton\n"
				+ "	d) Sun Microsystems\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) James Gosling - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
