package br.com.tarefa.controller;

import java.util.Scanner;

import br.com.tarefa.view.ProgramaView;

public class ProgramaController {
	Scanner teclado = new Scanner(System.in);

	public void menu() {
		StatusController statusController = new StatusController();
		statusController.cadastro();

		ProgramaView inicio = new ProgramaView();
		inicio.mensagemBoasVindas();

		String opcao = "S";
		TarefaController tarefaController = new TarefaController();
		PessoaController pessoaController = new PessoaController();
		do {
			tarefaController.listarTarefa();
			
			inicio.menuOpcao();
			inicio.informaOpcao();
			opcao = teclado.nextLine();
			
			
			if (opcao.equals("A")) {
				
				//listar pessoa
				pessoaController.listarPessoa();

				//cadastrar pessoa
				pessoaController.cadastroPessoa();
				
			} else if (opcao.equals("B")) {
				//listar pessoa
				pessoaController.listarPessoa();
				
				//cadastar tarefa
				tarefaController.cadastroTarefa();
			} else if (opcao.equals("C")) {
				//listar pessoa
				pessoaController.listarPessoa();
				
				//listar tarefa
				tarefaController.listarTarefa();
				
				//Vincular prestador a tarefa
				tarefaController.vincularPrestador();
			} else if (opcao.equals("D")) {
				//listar tarefa
				tarefaController.listarTarefa();
				
				//Informar percentual de uma tarefa
				tarefaController.informaPercentual();
			} else {
				inicio.informaOpcaoInvalida();
			}
		} while (opcao.equals("S") == false);
	}
}
