package br.com.desafio.ordena.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenaListaProduto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ProdutoBean> listaDeProduto = new ArrayList<>();

		while (true) {
			System.out.print("Digite o nome do produto: ");
			String nome = scanner.nextLine();

			System.out.print("Digite o preço do produto: ");
			Double preco = scanner.nextDouble();

			scanner.nextLine(); 

			ProdutoBean novoProduto = new ProdutoBean(nome, preco);
			listaDeProduto.add(novoProduto);

			System.out.print("Digite 1 para continuar ou 2 para listar os produtos.");
			String opcao = scanner.nextLine();

			if (opcao.equals("2")) {
				break;
			}
		}

		// Ordenação da lista de produtos com base no preço
		//			Estamos trocando os elementos nas posições i e j da lista listaDeProduto. Vamos explicar cada linha:
		//		    listaDeProduto.set(j, listaDeProduto.get(i));:
		//		        Esta linha substitui o elemento na posição j da lista pelo elemento na posição i da lista. Isso é feito para mover o menor preço para a posição i.

		//		    listaDeProduto.set(i, temp);:
		//		        Esta linha substitui o elemento na posição i da lista pelo objeto temporário temp. O objeto temp é o produto que encontramos na posição j da lista que tem o menor preço. Isso é feito para mover o objeto temp para a posição i.

		//		A troca desses elementos garante que, em cada iteração do método de seleção, o elemento com o menor preço seja movido para a posição correta na lista, resultando na ordenação da lista de produtos com base no preço.
		for (int i = 0; i < listaDeProduto.size() - 1; i++) {
			for (int j = i + 1; j < listaDeProduto.size(); j++) {
				if (listaDeProduto.get(j).getPreco() < listaDeProduto.get(i).getPreco()) {
					ProdutoBean temp = listaDeProduto.get(j);
					listaDeProduto.set(j, listaDeProduto.get(i));
					listaDeProduto.set(i, temp);
				}
			}
		}

		for (ProdutoBean produto : listaDeProduto) {
			System.out.println(produto);
		}

		scanner.close();
	}
}