package br.com.questionario;

import java.util.Scanner;

public class QuestaoOito {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append("O que é o JVM?\n"
				+ "	a) É o ambiente de execução Java oferecido gratuitamente pela Sun.\n"
				+ "	b) É o kit de desenvolvimento Java oferecido gratuitamente pela Sun.\n"
				+ "	c) Máquina Virtual Java. É o programa que faz um .class java poder ser executado.\n"
				+ "	d) Conjunto de bibliotecas para desenvolvimento voltado aos dispositivos móveis.\n"
				+ "");
		
		System.out.println(sb.toString());
		
		String resposta = scanner.nextLine(); 

		if (resposta.equalsIgnoreCase("c")) {
			System.out.println("c) Máquina Virtual Java. É o programa que faz um .class java poder ser executado. - CORRETO");
		} else {
			System.out.println("INCORRETO.");
		}
	}
}
