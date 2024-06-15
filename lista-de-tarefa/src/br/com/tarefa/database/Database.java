package br.com.tarefa.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.tarefa.model.Model;

public class Database<T extends Model> {
	private HashMap<Integer, T> db = new HashMap<>();

	public void insert(T model) {
		if (model != null && model.getId() != null) {
			db.put(model.getId(), model);
		} else {
			System.out.println("Model ou ID não pode ser nulo");
		}
	}

	public void update(T model) {
		if (model != null && model.getId() != null) {
			Integer id = model.getId();
			if (db.containsKey(id)) {
				db.put(id, model);
			} else {
				System.out.println("Registro não encontrado para atualização");
			}
		} else {
			System.out.println("Model ou ID não pode ser nulo");
		}
	}

	public List<T> selectAll() {
		return new ArrayList<>(db.values());
	}

	public void delete(Integer id) {
		if (id != null && db.containsKey(id)) {
			db.remove(id);
		} else {
			System.out.println("ID não pode ser nulo, ou registro não encontrado");
		}
	}

	public T selectById(Integer id) {
		return db.get(id);
	}
}