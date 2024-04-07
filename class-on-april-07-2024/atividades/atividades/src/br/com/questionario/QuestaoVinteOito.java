package br.com.questionario;

public class QuestaoVinteOito {

	public static void main(String[] args) {
		int numero01 = 10;

		numero01 =  numero01 + 15;

		numero01 = numero01 - 20;

		numero01 = numero01 + numero01;

		numero01 = 50;

		numero01 = numero01 * 2;

		numero01 = numero01 / 1;

		numero01 = numero01 / numero01;

		numero01 = numero01 + 9;

		System.out.println(numero01);

		for (int i = 5; i <= numero01; i++) {
			if (i == 5) {
				numero01 = -2;
			}
			System.out.println(i);
			System.out.println(numero01);
		}

		String nome = "Alves";
		String nickname = "arroz";

		if (numero01 == -2) {
			System.out.println("Nome: " + nome + ", Nickname: " + nickname);
		}

		int numero02 = numero01;

		numero02 = 23;

		numero02 = numero02 + 23;

		numero02 = 46 - 40;

		System.out.println(numero02);

		int j = 0;
		for (int z = 0; z == 6; z = z + 2) {
			System.out.println(z);
			j = z;
		}

		for (int z = 0; z <= numero02; z = z + 2) {
			if (j == 0) {
				System.out.println(z);
			}
		}

	}
}