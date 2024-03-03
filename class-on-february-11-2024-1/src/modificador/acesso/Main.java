package modificador.acesso;

public class Main {
	
	public static void main(String args[]) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("João");
		pessoa.setNome("Itamar"); 
		pessoa.setNome("Itamar"); 
		pessoa.setNome("Itamar"); 
		pessoa.setNome("Barros");
		
//		System.out.println(pessoa.idade); // 26 || 20 || 10|| 5 
		System.out.println(pessoa.getNome()); //Barros
		System.out.println(pessoa.getNome()); //Barros
		System.out.println(pessoa.getNome()); //Barros
//		
		pessoa.setIdade(21);
		pessoa.setNome("Fredi");
		System.out.println(pessoa.getNome() + ", Tem " 
		+ pessoa.getIdade() + " anos de idade!"); //
	}

}
