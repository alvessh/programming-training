package br.com.questionario;

import java.util.Scanner;

public class QuestaoUm {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		sb.append("Qual foi o nome inicial do projeto que deu origem ao Java?\n"
				+ "	a) Projeto Green\n"
				+ "	b) Projeto Oak\n"
				+ "	c) Projeto Star7\n"
				+ "	d) Projeto Web Runner"
				+ "");
		System.out.println(sb.toString());

		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) Projeto Green - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
