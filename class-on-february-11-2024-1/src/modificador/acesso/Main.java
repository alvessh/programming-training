package modificador.acesso;

public class Main {
	
	public static void main(String args[]) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println(pessoa.getIdade()); //12 || 
		System.out.println(pessoa.nome);
		
		pessoa.setIdade(10);
		
		System.out.println(pessoa.getIdade()); // 10 

		pessoa.setIdade(50);
		System.out.println(pessoa.getIdade()); // 50
	}

}
