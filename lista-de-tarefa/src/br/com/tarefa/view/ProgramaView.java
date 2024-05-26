package br.com.tarefa.view;

import java.util.Scanner;

public class ProgramaView {
	Scanner teclado = new Scanner(System.in);

	public void mensagemBoasVindas() {
		String mensagem = "Olá, Seja bem vindo ao Programa"
				+ " Lista de Tarefas !<>Esteja atualizado<>!";

		System.out.println(mensagem);
	}
	
	public void menuOpcao() {
		System.out.println("A - Cadastrar pessoa");
		System.out.println("B - Adicionar tarefa");
		System.out.println("C - Vincular prestador a tarefa");
		System.out.println("D - Informar o percentual de uma tarefa");
		System.out.println("S - Para sair do programa");
	}
	
	public void informaOpcao() {
		System.out.println("Digite a opção: ___");
	}
	
	//exemplo fomr cadastro de pessoa
	public void formularioCadastroPessoa() {
		inputText("Nome");
		inputText("Idade");
		inputText("E-mail");
		inputText("Endereço completo");
		
		String[] tipoPessoaArray = new String[]{"Requisitante", "Prestador"};
		inputCombo(tipoPessoaArray);
	}
	
	public void inputText(String text) {
		System.out.println("Digite o/a " + text +  ":");
	}
	
	public void inputCombo(String[] opcaoArray) {
		for (int i = 0; i < opcaoArray.length; i++) {
			System.out.println(i+1 + " - " + opcaoArray[i]);
		}
	}
}
