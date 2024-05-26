package br.com.tarefa.controller;

import java.util.Scanner;

import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.view.ProgramaView;

public class PessoaController {
	Scanner teclado = new Scanner(System.in);
	
	public void cadastroPessoa() {
		ProgramaView prvi = new ProgramaView();
		PessoaModel pemo = new PessoaModel();
		
		prvi.inputText("Nome");
		String nome = teclado.nextLine();
		pemo.setNome(nome);
		
		prvi.inputText("Idade");
		Integer idade = teclado.nextInt();
		pemo.setIdade(idade);
		
		prvi.inputText("E-mail");
		String email = teclado.nextLine();
		pemo.setEmail(email);
		teclado.nextLine();
		
		prvi.inputText("Endereço completo");
		String endereco = teclado.nextLine();
		pemo.setEndereco(endereco);
		
		String[] tipoPessoaArray = new String[]{"Requisitante", "Prestador"};
		prvi.inputText("Tipo da pessoa");
		prvi.inputCombo(tipoPessoaArray);
		Integer opcaoTipoPessoa = teclado.nextInt();
		pemo.setTipoPessoa(opcaoTipoPessoa);
		
		teclado.close();
	}
}