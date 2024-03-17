package se;

public class OperacaoAritmetico {
	public static void main(String[] args) {
		Integer x = 50;
		Integer y = 2;
		String operacao = "%";
		Integer resultado = 2;
		Integer acrescentador = 2;
		Integer multiplicador = 2;
		
		if (operacao.equals("+")) {
			resultado = x + y;
			
			resultado += acrescentador;
			
			resultado *= multiplicador;
			
			System.out.println("Soma é igual: " + resultado);
		} else if (operacao.equals("-")) {
			resultado = x - y;
			
			resultado += acrescentador;
			
			resultado *= multiplicador;
			
			System.out.println("Subtração é igual: " + resultado);
		} else if (operacao.equals("*")) {
			resultado = x * y;
			
			resultado += acrescentador;
			
			resultado *= multiplicador;
			
			System.out.println("Multiplicação é igual: " + resultado);
		} else if (operacao.equals("/")) {
			resultado = x / y;
			
			resultado += acrescentador;
			
			resultado *= multiplicador;
			
			System.out.println("Divisão é igual: " + resultado);
		} else {
			System.out.println("Operação inválida!");
		}
		
		

	}
}
