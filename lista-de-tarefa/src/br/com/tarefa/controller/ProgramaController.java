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
				//cadastar tarefa
				tarefaController.cadastroTarefa();
			} else if (opcao.equals("C")) {
				//listar pessoa
				pessoaController.listarPessoa();
				
				//Vincular prestador a tarefa
				tarefaController.vincularPrestador();
			} else if (opcao.equals("D")) {
				//Informar percentual de uma tarefa
			} else {
				inicio.informaOpcaoInvalida();
			}
		} while (opcao.equals("S") == false);
	}
}
