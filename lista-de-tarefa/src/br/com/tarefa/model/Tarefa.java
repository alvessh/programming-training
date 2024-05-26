package br.com.tarefa.model;

public class Tarefa {
	
	private Integer id;
	private String descricao;
	private Status status;
	private Integer percentual;
	private Pessoa pessoaPrestadorResponsavel;
	private Pessoa pessoaRequisitante;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getPercentual() {
		return percentual;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	public Pessoa getPessoaPrestador() {
		return pessoaPrestadorResponsavel;
	}
	public void setPessoaPrestador(Pessoa pessoaPrestador) {
		this.pessoaPrestadorResponsavel = pessoaPrestador;
	}
	public Pessoa getPessoaRequisitante() {
		return pessoaRequisitante;
	}
	public void setPessoaRequisitante(Pessoa pessoaRequisitante) {
		this.pessoaRequisitante = pessoaRequisitante;
	}
}