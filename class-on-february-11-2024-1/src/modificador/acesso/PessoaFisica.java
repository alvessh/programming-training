package modificador.acesso;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	private String getNomePessoaFisica() {
		return super.getNome();
	};
}
