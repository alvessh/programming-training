package br.com.desafio;

/*
 * Descrição

	Troco: Fazer um programa em Java que implemente 
	a solução de troco em uma operação de venda/compra.
 */
public class Troco {
	public static void main(String[] args) {
		// Comprei 2 produto  e deu o total de 50 reais,
		//entreguei para o atendente 100 reais, o atendente tem que me voltar 50 de troco

		Double valorTotalCompra = 200.0;
		Double valorTotalPago = 200.0;
		Double valorTroco = valorTotalPago - valorTotalCompra;

		if (valorTroco > 0) {
			System.out.println("Retornar para o cliente R$ " + valorTroco + " de troco.");
		} else if (valorTroco < 0) {
			System.out.println("Falta pagar R$ " + valorTroco*-1 + "");
		} else {
			System.out.println("Obrigado por comprar conosco, volte sempre!");
		}

	}
}
