package br.com.tarefa.teste;

import java.util.List;

import br.com.tarefa.database.Database;
import br.com.tarefa.model.PessoaModel;

public class CadastroPessoaTeste {
	public static void main(String[] args) {
		Database<PessoaModel> pessoaDatabase = new Database<>();

		PessoaModel pessoa1 = new PessoaModel();
		pessoa1.setNome("João");
		pessoa1.setEmail("joao@gmail");

		PessoaModel pessoa2 = new PessoaModel();
		pessoa2.setNome("Maria");
		pessoa2.setEmail("mr@gmail.com");

		pessoaDatabase.insert(pessoa1);
		pessoaDatabase.insert(pessoa2);

		// Buscar por ID
		PessoaModel foundPessoa1 = pessoaDatabase.selectById(pessoa1.getId());
		System.out.println(foundPessoa1.getNome());

		PessoaModel foundPessoa2 = pessoaDatabase.selectById(pessoa2.getId());
		System.out.println(foundPessoa2.getNome());

		// Listar todos os registros
		List<PessoaModel> pessoaModelList = pessoaDatabase.selectAll();
		for (PessoaModel p : pessoaModelList) {
			System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getEmail());
		}

		// Atualizando registros
		PessoaModel pessoaToUpdate = pessoaDatabase.selectById(foundPessoa2.getId());
		pessoaToUpdate.setNome("José");
		pessoaToUpdate.setEmail("js.gmail.oulotok.");
		pessoaDatabase.update(pessoaToUpdate);
		
		System.out.println("==================");
		// Listar todos os registros
		List<PessoaModel> pessoaModelList3 = pessoaDatabase.selectAll();
		for (PessoaModel p : pessoaModelList3) {
			System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getEmail());
		}

		// Deletar os registros
		pessoaDatabase.delete(pessoa1.getId());

		//após delete
		System.out.println("==================");
		List<PessoaModel> pessoaModelList1 = pessoaDatabase.selectAll();
		for (PessoaModel p : pessoaModelList1) {
			System.out.println(p.getNome() + " - " + p.getEmail());
		}
	}
}