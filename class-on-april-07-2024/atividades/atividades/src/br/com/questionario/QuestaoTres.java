package br.com.questionario;

import java.util.Scanner;

public class QuestaoTres {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Por que a linguagem Oak foi renomeada para Java?\n"
				+ "	a) Em homenagem a uma ilha da Indonésia\n"
				+ "	b) Por referência ao carvalho\n"
				+ "	c) Por ser uma abreviação de \"James\"\n"
				+ "	d) Por causa da cor verde\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) Em homenagem a uma ilha da Indonésia - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
