package br.com.tarefa.controller;
import java.util.List;
import java.util.Scanner;

import br.com.tarefa.database.Database;
import br.com.tarefa.database.DatabaseManager;
import br.com.tarefa.model.PessoaModel;
import br.com.tarefa.view.ProgramaView;

public class PessoaController {
	Scanner teclado = new Scanner(System.in);

	public void cadastroPessoa() {
		Database<PessoaModel> pessoaDatabase = DatabaseManager.getPessoaDatabase();
		
		ProgramaView prvi = new ProgramaView();
		PessoaModel pessoaModel = new PessoaModel();
		
		prvi.inputText("Nome");
		String nome = teclado.nextLine();
		pessoaModel.setNome(nome);
		
		prvi.inputText("Idade");
		Integer idade = teclado.nextInt();
		pessoaModel.setIdade(idade);
		
		prvi.inputText("E-mail");
		String email = teclado.nextLine();
		pessoaModel.setEmail(email);
		teclado.nextLine();
		
		prvi.inputText("Endereço completo");
		String endereco = teclado.nextLine();
		pessoaModel.setEndereco(endereco);
		
		String[] tipoPessoaArray = new String[]{"Requisitante", "Prestador"};
		prvi.inputText("Tipo da pessoa");
		prvi.inputCombo(tipoPessoaArray);
		Integer opcaoTipoPessoa = teclado.nextInt();
		pessoaModel.setTipoPessoa(opcaoTipoPessoa);
		
		teclado.nextLine();
		
		pessoaDatabase.insert(pessoaModel);
	}

	public void listarPessoa() {
		Database<PessoaModel> pessoaDatabase = DatabaseManager.getPessoaDatabase();		
		
		ProgramaView prvi = new ProgramaView();
		
		List<PessoaModel> pessoaList = pessoaDatabase.selectAll();
		
		prvi.tabelaPessoa(pessoaList);
	}
}