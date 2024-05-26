package br.com.tarefa.model;

public class StatusModel {
	private Integer id;
	private String descricao; //Pendente, Andamento, Concluido, Pausado
	
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
}