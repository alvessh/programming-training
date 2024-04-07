package br.com.questionario;

import java.util.Scanner;

public class QuestaoCinco {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("O que é o JDK?\n"
				+ "	a) É o kit de desenvolvimento Java oferecido gratuitamente pela Sun.\n"
				+ "	b) Java Development Kit, um sistema operacional\n"
				+ "	c) Java Design BatataFrita Kit, um conjunto de ferramentas de design\n"
				+ "	d) Java Development Fast Food, um guia de conhecimento sobre Java\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("a")) {
			System.out.println("a) É o kit de desenvolvimento Java oferecido gratuitamente pela Sun. - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
