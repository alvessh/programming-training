package br.com.questionario;

public class QuestaoVinteQuatro {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		boolean resultadoE = a && b;
		System.out.println(resultadoE);
		boolean resultadoOu = a || b;
		System.out.println(resultadoOu);
		boolean resultadoNaoA = !a;
		System.out.println(resultadoNaoA);
		boolean resultadoNaoB = !b;
		System.out.println(resultadoNaoB);
	}
}
