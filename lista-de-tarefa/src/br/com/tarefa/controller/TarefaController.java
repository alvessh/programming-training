package br.com.tarefa.controller;
import java.util.List;
import java.util.Scanner;

import br.com.tarefa.database.Database;
import br.com.tarefa.database.DatabaseManager;
import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.model.StatusModel;
import br.com.tarefa.model.TarefaModel;
import br.com.tarefa.utils.ConstantUtils;
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
		
		teclado.nextLine();
		
		prvi.inputText("número do Requisitante");
		Integer pessoaRequisitanteId = teclado.nextInt();
		
		PessoaModel pessoaRequisitanteModel = DatabaseManager.getPessoaDatabase().selectById(pessoaRequisitanteId);
		tarefaModel.setPessoaRequisitante(pessoaRequisitanteModel);
		
		tarefaModel.setPercentual(0);
		StatusModel status = DatabaseManager.getStatusDatabase().selectById(ConstantUtils.PEDENTE);
		tarefaModel.setStatus(status);
		
		tarefaDatabase.insert(tarefaModel);
		
		teclado.nextLine();
	}

	public void listarTarefa() {
		Database<TarefaModel> tarefaDatabase = DatabaseManager.getTarefaDatabase();
		ProgramaView prvi = new ProgramaView();
		
		List<TarefaModel> tarefaList = tarefaDatabase.selectAll();
		
		prvi.tabelaTarefa(tarefaList);
	}

	public void vincularPrestador() {
		ProgramaView prvi = new ProgramaView();
		
		prvi.inputText(" o código data tarefa");
		Integer tarefaId = teclado.nextInt();
		
		prvi.inputText(" o código do prestador de serviço");
		Integer pessoaPrestadorId = teclado.nextInt();
		
		//vou buscar na base de dados tanto a tarefa quanto o pessoa prestador
		
		PessoaModel pessoaPrestadorModel = DatabaseManager
				.getPessoaDatabase().selectById(pessoaPrestadorId);
		
		if (pessoaPrestadorModel.getTipoPessoa() != 2) {
			System.out.println("A pessoa informada não é prestadora de serviço.");
			return;
		}
		
		Database<TarefaModel> tarefaDatabase = DatabaseManager
				.getTarefaDatabase();
		
		TarefaModel tarefaModel = tarefaDatabase.selectById(tarefaId);
		
		tarefaModel.setPessoaPrestador(pessoaPrestadorModel);
		
		//atualizado o tarefa model no banco de dados, agora com o prestador.
		tarefaDatabase.update(tarefaModel);
	}

	public void informaPercentual() {
		ProgramaView prvi = new ProgramaView();
		
		prvi.inputText(" o codigo da tarefa");
		Integer tarefaId = teclado.nextInt();
		
		Database<TarefaModel> tarefaDabase = DatabaseManager
				.getTarefaDatabase();
		
		TarefaModel tarefaModel = tarefaDabase.selectById(tarefaId);
		
		if (tarefaModel == null) {
			System.out.println("A tarefa informada "
					+ "com o código: "+ tarefaId + ", não existe.");
			
			return;
		}
		
		prvi.inputText(" o percentual realizado");
		Integer percentual = teclado.nextInt();
		
		tarefaModel.setPercentual(percentual);
		
		if (percentual > 0 && percentual < 100) {
			StatusModel status = DatabaseManager
					.getStatusDatabase()
					.selectById(ConstantUtils.ANDAMENTO);
			
			tarefaModel.setStatus(status);	
		} else if (percentual == 100) {
			StatusModel status = DatabaseManager
					.getStatusDatabase()
					.selectById(ConstantUtils.CONCLUIDO);
			
			tarefaModel.setStatus(status);
		}
		tarefaDabase.update(tarefaModel);
	}
}