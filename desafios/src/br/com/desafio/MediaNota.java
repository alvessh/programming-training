package br.com.desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Descrição

	Média de notas: Escreva um programa em Java que 
	solicite ao usuário que insira três notas e calcule a média dessas notas.
 */

public class MediaNota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		Double nota2 = scanner.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		Double nota3 = scanner.nextDouble();
		
		Double media = (nota1 + nota2 + nota3) / 3;
		Long mediaArredondada = Math.round(media);
		
		DecimalFormat mediaArr = new DecimalFormat("##.00");
		
		System.out.println("A média é: " + media);
		
		System.out.println("A média arr: " + mediaArredondada);
		
		System.out.println("A média arr 2: " + mediaArr.format(media));
		
		//O método `printf` é usado para formatar strings em Java. 
		//Ele é parte da classe `PrintStream` que `System.out` pertence. 
		//A sintaxe básica do método é:
		// 
		//Arredondando a média para 3 casas decimais
		/*
		 * System.out.printf(format, args);

		   format: uma string que contém o texto a ser impresso e especificadores de formato.
		   args: os argumentos que serão inseridos nos especificadores de formato.
		 */
		System.out.printf("A média é: %.3f%n", media);
		/*
		 *     "A média é: ": Esse texto será impresso exatamente como está.
		    	%.3f: Este especificador de formato será substituído pelo valor 
		    	da variável media, formatado como um número de ponto flutuante com duas casas decimais.
		    	%n: Adiciona uma nova linha após a impressão.
		 */
	}
}