package se;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double resultado = 0.0;
		
		System.out.println("Informe o primeiro número: ");
		Double num1 = scanner.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		Double num2 = scanner.nextDouble();
		
		System.out.println("Opções:");
		System.out.println("+  Somar");
		System.out.println("-  Subtrair");
		System.out.println("* Multiplicar");
		System.out.println("/ Dividir");
		System.out.println("% Tirar a porcentagem");
		
		scanner.nextLine();
		System.out.println("Digite a operação deseja: ");
		String operacao = scanner.nextLine();
		
		if (operacao.equals("+")) {
			resultado = num1 + num2;
			resultado += 12;
		} else if (operacao.equals("-"))  {
			resultado = num1 - num2;
			resultado -= 5;
		} else if (operacao.equals("*"))  {
			resultado = num1 * num2;
			resultado /= 2;
		} else if (operacao.equals("/"))  {
			resultado = num1 / num2;
			resultado *= 2;
		} else if (operacao.equals("%"))  {
			//100
			//10
			
			Double percentagemEmDecimal = num2 / 100;
			resultado = num1 * percentagemEmDecimal;
		} else {
			System.out.println("Operador Inválido!");
		}
		
		System.out.println("Resultado é : " + resultado );
	}
}
