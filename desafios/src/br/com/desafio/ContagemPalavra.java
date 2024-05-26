package br.com.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a frase:");
		String frase = scanner.nextLine();

		Map<String, Integer> contagem = contarPalavrasUnicas(frase);

		for (String palavra : contagem.keySet()) {
			System.out.println(palavra + ": " + contagem.get(palavra));
		}

		scanner.close();
	}

	public static Map<String, Integer> contarPalavrasUnicas(String frase) {
		Map<String, Integer> mapContagemPalavra = new HashMap<>();

		// Divide a frase em palavras usando espaço como delimitador
		//o céu está azul e o sol está brilhando
		String[] palavras = frase.split(" ");

		for (String palavra : palavras) {
		
			palavra = palavra.toLowerCase();

			// Se a palavra já estiver no mapa, incrementa sua contagem,
			//caso contrário, adiciona ao mapa com contagem 1
			if (mapContagemPalavra.containsKey(palavra)) {
				mapContagemPalavra.put(palavra, mapContagemPalavra.get(palavra) + 1);
			} else {
				mapContagemPalavra.put(palavra, 1);
			}
		}

		return mapContagemPalavra;
	}
}