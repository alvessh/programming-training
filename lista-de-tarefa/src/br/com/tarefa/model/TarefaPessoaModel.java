package br.com.tarefa.model;

public class TarefaPessoaModel extends Model{
	private static Integer proximoId = 0;
	
	private Integer id;
	private TarefaModel tarefa;
	private PessoaModel pessoaPrestador;
	
	public TarefaPessoaModel() {
		this.id = ++proximoId;
	}
	
	@Override
	public String getIdComPrefixo() {
        return "TAREFA_PESSOA_" + this.id;
    }
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TarefaModel getTarefa() {
		return tarefa;
	}
	public void setTarefa(TarefaModel tarefa) {
		this.tarefa = tarefa;
	}
	public PessoaModel getPessoaPrestador() {
		return pessoaPrestador;
	}
	public void setPessoaPrestador(PessoaModel pessoaPrestador) {
		this.pessoaPrestador = pessoaPrestador;
	}
}