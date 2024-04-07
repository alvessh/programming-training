package br.com.questionario;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String operacao;
		Double resultado = 0.0;
		Integer acrescentador = 12;
		
		System.out.println ("Digite um numero: ");
		Double numero1 = scanner.nextDouble();

		scanner.nextLine();
		System.out.println ("Tipo de conta: (+, -, *, /, %) ");	  
		operacao = scanner.nextLine();

		System.out.println ("Digite outro numero: ");
		Double numero2 = scanner.nextDouble();


		if (operacao.equals("+")) {
			resultado = numero1 + numero2;

			resultado += acrescentador;
		} else if (operacao.equals("-")) {
			resultado = numero1 - numero2;
			
			
		}
		
		System.out.println("Soma é igual: " + resultado);
	}
}