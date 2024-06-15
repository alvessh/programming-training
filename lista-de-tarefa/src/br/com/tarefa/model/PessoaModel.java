package br.com.tarefa.model;

public class PessoaModel extends Model {
	private static Integer proximoId = 0;
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String email;
	private String endereco;
	private Integer tipoPessoa; //1 - Requisitante || 2 - Prestador
	
	public PessoaModel() {
		this.id = ++proximoId;
	}

	@Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}