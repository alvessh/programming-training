package br.com.desafio;

import java.util.Scanner;

/*
 * Descrição

	Implemente uma Calculadora de IMC

	Requisitos:

    O usuário deve inserir seu peso em quilogramas e sua altura em metros.
    O programa calculará o IMC usando a fórmula IMC = peso / (altura * altura).
    Com base no resultado do cálculo, o programa 
    fornecerá uma interpretação do IMC, 
    indicando se o usuário está dentro da faixa 
    de peso saudável, sobrepeso, obesidade.

 */

public class IMC {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite seu peso em quilogramas: ");
		Double peso = teclado.nextDouble();

		System.out.print("Digite sua altura em metros: ");
		Double altura = teclado.nextDouble();

		//Chamo o método calcularIMC.. 
		Double imc = calcularIMC(peso, altura);

		System.out.printf("Seu IMC é: %.2f\n", imc);

		// Agora vou interpretrar para ver em qual classe..
		interpretarIMC(imc);

		teclado.close();
	}

	public static Double calcularIMC(Double peso, Double altura) {
		Double imc = peso / (altura * altura);

		return imc;
	}
	
	/*
	 * 
	URL: https://ge.globo.com/eu-atleta/nutricao/post/2022/08/17/veja-qual-e-o-imc-ideal-e-como-calcular.ghtml
		Classificação do IMC de acordo com a OMS:

	    IMC <18,5kg/m2 - baixo peso
	    IMC >18,5 até 24,9kg/m2 - eutrofia (peso adequado)
	    IMC ≥25 até 29,9kg/m2 - sobrepeso
	    IMC >30,0kg/m2 até 34,9kg/m2 - obesidade grau 1
	    IMC >35kg/m2 até 39,9kg/m2 - obesidade grau 2
	    IMC > 40kg/m2 - obesidade extrema
	 */

	public static void interpretarIMC(Double imc) {
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu peso está dentro da faixa saudável.");
		} else if (imc >= 25 && imc < 29.9) {
			System.out.println("Você está com sobrepeso.");
		} else if (imc >= 30 && imc < 34.9) {
			System.out.println("obesidade grau 1.");
		} else if (imc >= 35 && imc < 39.9) {
			System.out.println("obesidade grau 2.");
		} else {
			System.out.println("Você está obeso.");
		}
	}
}