//Estrutura do for (exemplo)
for (var i = 0; i < 10; i++) {
    console.log(i);
}

// Ordem de execução
// 1º) var i = 0; -- atribuição e definição
// 2º) i < 10; --  condição a ser seguida
// 3º) console.log(i); -- entra no bloco loop e fazer o que tiver no algoritmo
// 4º) i++ --- agora sim o incrementador. 

const cars = ["carro ", "carro 2", "carro 3"];

console.log(cars[1]);


//TABUADA EXEMPLO 01 -- o algoritmo já faz direto do 1 -10
for (let i = 1; i <= 10; i++ ) {
    console.log('==================================')
	for (let y = 1; y <= 10; y++) {
		console.log(i + ' * ' + y + ' = ' + i*y);
  }
}


//TABUADA EXEMPLO 02 -- solicitando ao usuário
let numero = prompt('Digite um número que quer a tabuada: ')
for (let y = 1; y <= 10; y++) {
    console.log(numero + ' * ' + y + ' = ' + numero * y);
}
