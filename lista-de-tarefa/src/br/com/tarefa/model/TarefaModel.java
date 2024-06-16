package br.com.tarefa.model;

public class TarefaModel extends Model{
	private static Integer proximoId = 0;
	
	private Integer id;
	private String descricao;
	private StatusModel status;
	private Integer percentual;
	private PessoaModel pessoaPrestadorResponsavel;
	private PessoaModel pessoaRequisitante;
	
	public TarefaModel() {
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
	public StatusModel getStatus() {
		if (status == null) status = new StatusModel();
		return status;
	}
	public void setStatus(StatusModel status) {
		this.status = status;
	}
	public Integer getPercentual() {
		return percentual;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	public PessoaModel getPessoaPrestador() {
		if (pessoaPrestadorResponsavel == null) {
			pessoaPrestadorResponsavel = new PessoaModel();
		}
		return pessoaPrestadorResponsavel;
	}
	public void setPessoaPrestador(PessoaModel pessoaPrestador) {
		this.pessoaPrestadorResponsavel = pessoaPrestador;
	}
	public PessoaModel getPessoaRequisitante() {
		if (pessoaRequisitante == null) pessoaRequisitante = new PessoaModel();
		return pessoaRequisitante;
	}
	public void setPessoaRequisitante(PessoaModel pessoaRequisitante) {
		this.pessoaRequisitante = pessoaRequisitante;
	}
}