let tarefas = []; // Lista de tarefas

function criarTabela(listaTarefas) {
    let htmlTabela = `
        <table id="lista-de-tarefas">
            <tr>
                <th>Descrição da tarefa</th>
                <th>Status da tarefa</th>
                <th>Responsável pela tarefa</th>
            </tr>`;

    listaTarefas.forEach(tarefa => {
        htmlTabela += `
            <tr>
                <td>${tarefa.descricao}</td>
                <td>${tarefa.status}</td>
                <td>${tarefa.responsavel}</td>
            </tr>`;
    });

    htmlTabela += '</table>';

    return htmlTabela;
}

function adicionarTarefa(descricao, responsavel) {
    const novaTarefa = {
        descricao: descricao,
        status: 'Pendente',
        responsavel: responsavel
    };
    tarefas.push(novaTarefa);

    // Atualizar a tabela na DOM com as novas tarefas
    const tabelaAtualizada = criarTabela(tarefas);
    document.getElementById('lista-de-tarefas').innerHTML = tabelaAtualizada;
}

function add(event) {
    event.preventDefault(); // Impede o envio do formulário

    const descricao = document.getElementById('descricao').value;
    const responsavel = document.getElementById('responsavel').value;

    adicionarTarefa(descricao, responsavel);

    // Limpa os campos do formulário após adicionar a tarefa
    document.getElementById('descricao').value = '';
    document.getElementById('responsavel').value = '';
}