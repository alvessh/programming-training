package br.com.tarefa.view;

import java.util.List;
import java.util.Scanner;

import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.model.TarefaModel;

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

	public void informaOpcaoInvalida() {
		System.out.println("Você informou uma opção inválida!");
	}

	public void tabelaPessoa(List<PessoaModel> pessoaList) {
		System.out.println("===============================================================");
		System.out.println("ID" + " - " + "Nome" + " - " + "Idade" + " - " + "E-mail" + " - " + "Endereço" + " - " + "Tipo da pessoa");
		System.out.println("===============================================================");
		
		for (int i = 0; i < pessoaList.size(); i++) {
			PessoaModel pessoaModel = pessoaList.get(i);
			
			Integer id = pessoaModel.getId();
			String nome = pessoaModel.getNome();
			Integer idade = pessoaModel.getIdade();
			String email = pessoaModel.getEmail();
			String endereco = pessoaModel.getEndereco();
			Integer tipoPessoa = pessoaModel.getTipoPessoa();
			String tipoPessoaStr = null;
			if (tipoPessoa == 1) {
				tipoPessoaStr = "Requisitante";
			} else if (tipoPessoa == 2 ) {
				tipoPessoaStr = "Prestador";
			} else {
				tipoPessoaStr = "Inválido";
			}
			
			System.out.println(id + " - " + nome + " - " + idade + " - " + email + " - " + endereco + " - " + tipoPessoaStr);
		}
		
		System.out.println("=====================Dados da pessoa=====================");
	}
	
	public void tabelaTarefa(List<TarefaModel> tarefaList) {
		System.out.println("===============================================================");
		System.out.println("ID" + " - " + "Descrição" + " - " 
		+ "Requisitante" + " - " + "Status" + " - " + "Prestador");
		System.out.println("===============================================================");
		
		for (int i = 0; i < tarefaList.size(); i++) {
			TarefaModel tarefaModel = tarefaList.get(i);
			
			Integer id = tarefaModel.getId();
			String descricao = tarefaModel.getDescricao();
			String nomeRequisitante = tarefaModel.getPessoaRequisitante().getNome();
			String status = tarefaModel.getStatus().getDescricao();
			String nomePrestador = tarefaModel.getPessoaPrestador().getNome();
			
			System.out.println(id + " - " + descricao + " - " + nomeRequisitante + " - " + status + " - " + nomePrestador);
		}
		
		System.out.println("=====================Dados da tarefa=====================");
	}
}
