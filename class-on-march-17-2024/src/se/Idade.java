package se;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		Integer idade = scanner.nextInt();
		
//		System.out.println("Informe a sua fjasdkfjlksd: ");
//		String batata = scanner.nextLine();
		
		if (idade >= 18) {
			System.out.println("A Pessoa é maior de idade");
		} else {
			System.out.println("Menor de idade");
		}

	}
}