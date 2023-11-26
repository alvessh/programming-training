//Isso é uma função que vai receber os dados e salvar na base de dados.
function cadastrar(event) {
    event.preventDefault();

    var nome = document.getElementById("nome").value;
    console.log(nome)

    var dataNascimento = document.getElementById("dataNascimento").value;
    console.log(dataNascimento)

    var email = document.getElementById("email").value;
    var provider = document.getElementById("provider").value;
    console.log(email+provider)

    var endereco = document.getElementById("endereco").value;
    console.log(endereco)

    var senha = document.getElementById("senha").value;
    console.log(senha)

    var conteudo = document.getElementById("tabela");
    // conteudo.innerHTML += inicioTabela();
    //aqui são os titulos
    conteudo.innerHTML += addTitulo("Nome");
    conteudo.innerHTML +=  addDados(nome) ;
    conteudo.innerHTML += addTitulo("Data de Nascimento");
    conteudo.innerHTML +=  addDados(dataNascimento)
    conteudo.innerHTML += addTitulo("E-mail");
    conteudo.innerHTML +=  addDados(email+provider)
    conteudo.innerHTML += addTitulo("Endereço");
    conteudo.innerHTML +=  addDados(endereco)
    conteudo.innerHTML += addTitulo("Senha");
    conteudo.innerHTML +=  addDados(senha)
    
    //aqui são os dados
    // conteudo.innerHTML += fimTabela();
}

function addH1(text) {
    return "<h1>"+text+"</h1>";
}

function inicioTabela() {
    return "<table border='1'>";
}

function fimTabela() {
    return "</table>";
}

function addTitulo(titleText) {
    return "<tr> <th> "+titleText+ "</th></tr>";
}

function addDados(dataText) {
    return "<tr> <td> "+dataText+ "</td></tr>";
}