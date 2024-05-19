package br.com.desafio;

/*
 * Descrição

	Tabuada: Escreva um programa em Java que exiba 
	a tabuada de multiplicação do número inteiro 
	1 até o número inteiro 10.
 */
public class Tabuada {
	public static void main(String[] args) {
		//1 * 1 = 1
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("TABUADA DO NÚMERO: " + i);
			for (int y = 1; y <=10; y++) {
				int resultado = i * y;
				System.out.println(i + " X " + y + " = " + resultado);
			}
		}
	}
}