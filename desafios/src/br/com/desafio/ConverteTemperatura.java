package br.com.desafio;

/*
 * Descrição

	Conversor de Temperatura: Implemente um programa em Java que converta 
	uma temperatura em graus Celsius para Fahrenheit e vice-versa.
 */

public class ConverteTemperatura {
	public static void main(String[] args) {
		System.out.println(converteCelsiusParaFahrenheit(10.0));
		System.out.println(converteFahrenheitParaCelsius(50.0));
	}
	
	// converter Celsius para Fahrenheit
	public static Double converteCelsiusParaFahrenheit(Double celsius) {
		Double calculo = (celsius * 1.8) + 32;
		return calculo;
	}

	// converter Fahrenheit para Celsius
	public static Double converteFahrenheitParaCelsius(Double fahrenheit) {
		Double calculo = (fahrenheit - 32) / 1.8;
		return calculo;
	}
}
