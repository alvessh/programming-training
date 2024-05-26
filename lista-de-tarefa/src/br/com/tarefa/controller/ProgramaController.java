package br.com.tarefa.controller;

import java.util.Scanner;

import br.com.tarefa.view.ProgramaView;

public class ProgramaController {
	Scanner teclado = new Scanner(System.in);

	public void menu() {

		ProgramaView inicio = new ProgramaView();
		inicio.mensagemBoasVindas();

		String opcao = "S";
		do {
			inicio.menuOpcao();
			inicio.informaOpcao();
			opcao = teclado.nextLine();
			
			if (opcao.equals("A")) {
				//cadastrar pessoa
				PessoaController peco = new PessoaController();
				peco.cadastroPessoa();
				
			} else if (opcao.equals("B")) {
				//Adicionar tarefa
			} else if (opcao.equals("C")) {
				//Vincular prestador a tarefa
			} else if (opcao.equals("D")) {
				//Informar percentual de uma tarefa
			} else {
				inicio.informaOpcaoInvalida();
			}
		} while (opcao.equals("S") == false);
	}
}
