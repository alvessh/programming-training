package br.com.desafio;

/*
 * Problemática

	João tinha uma quantia, gastou 35% e ainda ficou com R$ 97,50. 
	Qual o valor que João tinha inicialmente?

	Solução

	Implemente um programa em Java que resolva qual 
	problemática considerando que pode haver mudanças de percentual e Personagens.
 */
public class QuantiaX {
	public static void main(String[] args) {
		String personagem = "João";
		
		Double valorSobrou =97.50 ;
		Double percentualGastoEmDecimal = 35 / 100.0;
		Double valorInicial = valorSobrou / (1 - percentualGastoEmDecimal);
		
		System.out.println(personagem + " tinha inicialmente: R$ " + valorInicial);
	}
}