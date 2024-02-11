package modificador.acesso;

public class Pessoa {
	protected String nome;
	private Integer idade = 12;

	//INFORMA A IDADE
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	//BUSCA A IDADE INFORMADA
	public Integer getIdade() {
		return this.idade;
	}
	
	protected String getNome() {
		return this.nome;
	}
}
