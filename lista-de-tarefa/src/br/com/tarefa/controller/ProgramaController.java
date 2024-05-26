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
		} while (opcao.equals("S") == false);
	}
}
