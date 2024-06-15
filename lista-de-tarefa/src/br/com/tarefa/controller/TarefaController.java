package br.com.tarefa.controller;
import java.util.List;
import java.util.Scanner;

import br.com.tarefa.database.Database;
import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.model.TarefaModel;
import br.com.tarefa.view.ProgramaView;

public class TarefaController {
	Scanner teclado = new Scanner(System.in);
	Database<TarefaModel> db = new Database<TarefaModel>();
	
	public void cadastroTarefa(Database<PessoaModel> pessoaDatabase) {
		ProgramaView prvi = new ProgramaView();
		TarefaModel tarefaModel = new TarefaModel();
		
		prvi.inputText("nome da tarefa");
		String descricao = teclado.nextLine();
		tarefaModel.setDescricao(descricao);
		
		prvi.inputText("número do Requisitante");
		Integer pessoaRequisitanteId = teclado.nextInt();
		
		PessoaModel pessoaRequisitanteModel = new PessoaModel();
		pessoaRequisitanteModel.setId(pessoaRequisitanteId);
		
		pessoaRequisitanteModel = pessoaDatabase.selectById(pessoaRequisitanteModel.getIdComPrefixo());
		
		tarefaModel.setPessoaRequisitante(pessoaRequisitanteModel);
		
		tarefaModel.setPercentual(0);
		tarefaModel.getStatus().setId(1);
		
		db.insert(tarefaModel);
	}

	public void listarTarefa() {
		ProgramaView prvi = new ProgramaView();
		
		List<TarefaModel> tarefaList = db.selectAll();
		
		prvi.tabelaTarefa(tarefaList);
	}
}