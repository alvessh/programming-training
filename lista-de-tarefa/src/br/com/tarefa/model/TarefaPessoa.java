package br.com.tarefa.model;

public class PessoaTarefa {
	
	private Integer id;
	private Pessoa pessoaPrestador;
	private Tarefa tarefa;
	
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