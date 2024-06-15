package br.com.tarefa.model;

public class StatusModel extends Model{
	private static Integer proximoId = 0;
	
	private Integer id;
	private String descricao; //Pendente, Andamento, Concluido, Pausado
	
	public StatusModel() {
		this.id = ++proximoId;
	}
	
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