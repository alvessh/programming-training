package br.com.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaComum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> lista1 = lerLista(scanner, "Lista1");

		List<Integer> lista2 = lerLista(scanner, "Lista2");

		Integer soma = calcularSomaElementosComuns(lista1, lista2);

		System.out.println("Soma dos elementos comuns = " + soma);

		scanner.close();
	}

	public static List<Integer> lerLista(Scanner scanner, String nomeLista) {
		List<Integer> lista = new ArrayList<>();

		System.out.println("Digite os elementos da " + nomeLista + " separados por espaço: ");
		String[] elementos = scanner.nextLine().split(" ");

		for (String elemento : elementos) {
			lista.add(Integer.parseInt(elemento));
		}

		return lista;
	}

	public static Integer calcularSomaElementosComuns(List<Integer> lista1, List<Integer> lista2) {
		Integer soma = 0;

		for (Integer elemento : lista1) {
			if (lista2.contains(elemento)) {
				soma += elemento;
			}
		}
		return soma;
	}
}