package br.com.desafio;

import java.util.Map;
import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> listaDeProdutos = new HashMap<Integer, String>();
		listaDeProdutos.put(1, "Batata");
		listaDeProdutos.put(2, "Banana");
		listaDeProdutos.put(3, "Maça");
		listaDeProdutos.put(4, "Uva");
		listaDeProdutos.put(5, "Pera");
		listaDeProdutos.put(6, "Pitai");
		listaDeProdutos.put(7, "Abobora");
		listaDeProdutos.put(8, "Abacate");
		listaDeProdutos.put(9, "Morango");
		listaDeProdutos.put(10, "Cenoura");
		
//		System.out.println(listaDeProdutos.keySet());
		for (int key : listaDeProdutos.keySet()) {
			System.out.println(listaDeProdutos.get(key));
		}

	}
}
