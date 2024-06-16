package br.com.tarefa.controller;

import br.com.tarefa.database.Database;
import br.com.tarefa.database.DatabaseManager;
import br.com.tarefa.model.StatusModel;
import br.com.tarefa.utils.ConstantUtils;

public class StatusController {
	
	public void cadastro() {
		Database<StatusModel> db = DatabaseManager.getStatusDatabase();
		
		StatusModel status1 = new StatusModel();
		status1.setId(ConstantUtils.PEDENTE);
		status1.setDescricao("Pendente");
		db.insert(status1);
		
		StatusModel status2 = new StatusModel();
		status2.setId(ConstantUtils.ANDAMENTO);
		status2.setDescricao("Andamento");
		db.insert(status2);
		
		StatusModel status3 = new StatusModel();
		status3.setId(ConstantUtils.CONCLUIDO);
		status3.setDescricao("Concluido");
		db.insert(status3);
	}
}
