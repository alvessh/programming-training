package br.com.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 

Média de uma Lista de Números:

    Requisitos: Escreva um programa Java que calcule a média de uma lista de números 
    fornecida pelo usuário. Utilize uma lista para armazenar os números.
    
    Exemplo de entrada de dados: [10, 20, 30, 40, 50]
    Saída esperada: Média = 30
 * 
 */

public class MediaListaNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a lista de números separados por vírgula e entre colchetes:");
		System.out.print("Exemplo de entrada de dados: [10, 20, 30, 40, 50]\nEntrada: ");
		String listaNuemros = scanner.nextLine();

		List<Integer> numeros = extrairNumeros(listaNuemros);

		Double media = calcularMedia(numeros);

		System.out.println("Média = " + media);

		scanner.close();
	}

	public static List<Integer> extrairNumeros(String numeros) {
		List<Integer> listaDeNumeros = new ArrayList<>();

		numeros = numeros.replaceAll("\\[|\\]|\\s", "");

		String[] partes = numeros.split(",");

		for (String parte : partes) {
			try {
				int numero = Integer.parseInt(parte.trim());
				listaDeNumeros.add(numero);
			} catch (NumberFormatException e) {
				//sigo a vida..
			}
		}

		return listaDeNumeros;
	}

	public static Double calcularMedia(List<Integer> numeros) {
		if (numeros.isEmpty()) {
			return 0.0;
		}

		Double soma = 0.0;
		for (int numero : numeros) {
			soma += numero;
		}

		Double media = (soma / numeros.size());
		return media;
	}
}