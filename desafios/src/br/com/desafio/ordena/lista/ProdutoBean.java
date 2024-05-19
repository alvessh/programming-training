package br.com.desafio.ordena.lista;

public class ProdutoBean {
	private String nome;
	private Double preco;

	//Construtor..
	public ProdutoBean(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public String toString() {
		return "{nome: \"" + nome + "\", preço: " + preco + "}";
	}
}
