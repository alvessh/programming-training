package br.com.questionario;

public class QuestaoNove {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("Referente a Assinatura do método da imagem abaixo, escreva o que é cada item.\n"
				+ "public static void main(String ... x) { \n"
				+ "public:\n"
				+ "static:\n"
				+ "void:\n"
				+ "main(String …x):\n"
				+ "");

		System.out.println(sb.toString());	
		
		
		System.out.println(">>>>RESPOSTA CORRETA>>>>");
		System.out.println("\n");
		System.out.println("public: MODIFICAR DE ACESSO");
		System.out.println("static: MODIFICAR DE ESTADO");
		System.out.println("void: TIPOS DE RETORNO");
		System.out.println("main(String ...x): NOME DO MÉTODO E PARAMETROS");

	}
}
