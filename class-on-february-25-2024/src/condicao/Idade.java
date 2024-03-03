package condicao;

public class Idade {
	public static void main(String[] args) {
		int idade = 250;
		
		if (idade < 0 || idade > 130 ) {
			System.out.println("Idade inválida!");
		} else if (idade > 0 && idade < 18) {
			System.out.println("Menor que 18!");
		} else {
			System.out.println("Maior que 18");
		}

	}
}
