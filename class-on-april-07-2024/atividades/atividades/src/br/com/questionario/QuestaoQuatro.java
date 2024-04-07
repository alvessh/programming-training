package br.com.questionario;

import java.util.Scanner;

public class QuestaoQuatro {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("O que era o Star7?\n"
				+ "	a) Um avançado PDA\n"
				+ "	b) Um navegador para Web\n"
				+ "	c) Um sistema operacional\n"
				+ "	d) Uma linguagem de programação\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) Um avançado PDA - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
