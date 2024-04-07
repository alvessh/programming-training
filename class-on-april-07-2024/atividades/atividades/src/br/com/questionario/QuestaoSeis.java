package br.com.questionario;

import java.util.Scanner;

public class QuestaoSeis {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Em que ano a Oracle adquiriu a Sun Microsystems?\n"
				+ "	a) 2009\n"
				+ "	b) 1996\n"
				+ "	c) 1991\n"
				+ "	d) 1994\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) 2009 - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
