package br.com.desafio;

public class InverteArray {
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5 };

		for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
	}
}
