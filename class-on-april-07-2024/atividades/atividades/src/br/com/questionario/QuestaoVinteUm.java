package br.com.questionario;

public class QuestaoVinteUm {

	public static void main(String[] args) {
		for (int k = 15; k > 0; k++) {
			System.out.println("Resultado: " + k);

			if (k == 15) {
				k = -1;
			}
		}
	}
}
