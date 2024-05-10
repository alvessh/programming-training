package br.com.estruturadedados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDeNumeros {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Integer[] arrayNumero = new Integer[10];
		List<Integer> listaNumero = new ArrayList<Integer>();
		
		int i = 0;
		do {
			System.out.println("Informe o " + (i+1) +  "º número: ");
//			arrayNumero[i] = scanner.nextInt();
			listaNumero.add(scanner.nextInt());
			
			i++;
		} while(i < 9);
		
		Integer somaTotal = 0;
		for (int y = 0; y < listaNumero.size(); y++) {
//			somaTotal += arrayNumero[y];
			somaTotal += listaNumero.get(y);
		}
		
		System.out.println("A soma total dos números informados é: " + somaTotal);
	}

}
