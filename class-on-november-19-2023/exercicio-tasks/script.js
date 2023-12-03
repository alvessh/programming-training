let tarefas = []; // Lista de tarefas

function criarTabela(listaTarefas) {
    let htmlTabela = `
        <table id="lista-de-tarefas">
            <tr>
                <th>Descrição da tarefa</th>
                <th>Status da tarefa</th>
                <th>Responsável pela tarefa</th>
                <th>Ações</th>
            </tr>`;

    listaTarefas.forEach((tarefa, index) => {
        let descricaoTarefa = `<td id="descricao-${index}">${tarefa.descricao}</td>`;
        if (tarefa.status === 'Cancelada') {
            descricaoTarefa = `<td id="descricao-${index}" style="text-decoration: line-through;">${tarefa.descricao}</td>`;
        }

        htmlTabela += `
            <tr>
                ${descricaoTarefa}
                <td id="status-${index}">${tarefa.status}</td>
                <td id="responsavel-${index}">${tarefa.responsavel}</td>
                <td>
                    <button class="concluir-btn" onclick="alterarStatus(${index})">Concluir</button>
                    <button class="alterar-desc-btn" onclick="alterarDescricao(${index})">Alterar Descrição</button>
                    <button class="alterar-resp-btn" onclick="alterarResponsavel(${index})">Alterar Responsável</button>
                    <button class="cancelar-btn" onclick="cancelarTarefa(${index})">Cancelar</button>
                </td>
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

function alterarStatus(index) {
    if (tarefas[index].status === 'Pendente') {
        tarefas[index].status = 'Concluído';
        document.getElementById(`status-${index}`).textContent = 'Concluído';
    }
}

function alterarDescricao(index) {
    const novaDescricao = prompt('Digite a nova descrição:');
    if (novaDescricao !== null && novaDescricao.trim() !== '') {
        tarefas[index].descricao = novaDescricao;
        document.getElementById(`descricao-${index}`).textContent = novaDescricao;
    }
}

function alterarResponsavel(index) {
    const novoResponsavel = prompt('Digite o novo responsável:');
    if (novoResponsavel !== null && novoResponsavel.trim() !== '') {
        tarefas[index].responsavel = novoResponsavel;
        document.getElementById(`responsavel-${index}`).textContent = novoResponsavel;
    }
}

function cancelarTarefa(index) {
    tarefas[index].status = 'Cancelada';
    document.getElementById(`status-${index}`).textContent = 'Cancelada';
    document.getElementById(`descricao-${index}`).style.textDecoration = 'line-through';
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