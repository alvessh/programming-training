package br.com.tarefa.model;

public class TarefaPessoa {
	
	private Integer id;
	private Tarefa tarefa;
	private Pessoa pessoaPrestador;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Tarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	public Pessoa getPessoaPrestador() {
		return pessoaPrestador;
	}
	public void setPessoaPrestador(Pessoa pessoaPrestador) {
		this.pessoaPrestador = pessoaPrestador;
	}
}