package br.com.tarefa.database;

import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.model.StatusModel;
import br.com.tarefa.model.TarefaModel;
import br.com.tarefa.model.TarefaPessoaModel;

public class DatabaseManager {
	private static Database<PessoaModel> pessoaDatabase;
	private static Database<TarefaModel> tarefaDatabase;
	private static Database<StatusModel> statusDatabase;
	private static Database<TarefaPessoaModel> tarefaPessoaDatabase;
	
	public static synchronized Database<PessoaModel> getPessoaDatabase() {
		if (pessoaDatabase == null) {
			pessoaDatabase = new Database<>();
		}
		return pessoaDatabase;
	}
	
	public static synchronized Database<TarefaModel> getTarefaDatabase() {
		if (tarefaDatabase == null) {
			tarefaDatabase = new Database<>();
		}
		return tarefaDatabase;
	}
	
	public static synchronized Database<StatusModel> getStatusDatabase() {
		if (statusDatabase == null) {
			statusDatabase = new Database<>();
		}
		return statusDatabase;
	}
	
	public static synchronized Database<TarefaPessoaModel> getTarefaPessoaDatabase() {
		if (tarefaPessoaDatabase == null) {
			tarefaPessoaDatabase = new Database<>();
		}
		return tarefaPessoaDatabase;
	}
}