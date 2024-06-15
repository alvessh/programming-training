package br.com.tarefa.controller;
import java.util.List;
import java.util.Scanner;

import br.com.tarefa.database.Database;
import br.com.tarefa.database.DatabaseManager;
import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.model.TarefaModel;
import br.com.tarefa.view.ProgramaView;

public class TarefaController {
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroTarefa() {
		Database<TarefaModel> tarefaDatabase = DatabaseManager.getTarefaDatabase();
		
		ProgramaView prvi = new ProgramaView();
		TarefaModel tarefaModel = new TarefaModel();
		
		prvi.inputText("nome da tarefa");
		String descricao = teclado.nextLine();
		tarefaModel.setDescricao(descricao);
		
		prvi.inputText("número do Requisitante");
		Integer pessoaRequisitanteId = teclado.nextInt();
		
		PessoaModel pessoaRequisitanteModel = DatabaseManager.getPessoaDatabase().selectById(pessoaRequisitanteId);
		tarefaModel.setPessoaRequisitante(pessoaRequisitanteModel);
		
		tarefaModel.setPercentual(0);
		tarefaModel.getStatus().setId(1);
		
		tarefaDatabase.insert(tarefaModel);
		
		teclado.nextLine();
	}

	public void listarTarefa() {
		Database<TarefaModel> tarefaDatabase = DatabaseManager.getTarefaDatabase();
		ProgramaView prvi = new ProgramaView();
		
		List<TarefaModel> tarefaList = tarefaDatabase.selectAll();
		
		prvi.tabelaTarefa(tarefaList);
	}
}