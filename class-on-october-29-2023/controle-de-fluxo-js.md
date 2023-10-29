# Introdução ao Controle de Fluxo:

Controle de fluxo é como dizemos ao computador o que fazer, dependendo de certas condições. Pense nisso como dar instruções para um robô!
a. Condições:

    Igual a (===): Pergunte ao robô se duas coisas são exatamente iguais.
    Maior (>), Menor (<), Maior ou Igual (>=), Menor ou Igual (<=): Pergunte ao robô sobre o tamanho das coisas.
    Diferente (!==): Pergunte se duas coisas são diferentes.

# Comandos Básicos:
a. if-else:

    Se (if): Diz ao robô para fazer algo se uma condição for verdadeira.
    Senão (else): Diz ao robô o que fazer se a condição for falsa.

Por exemplo:

```javascript

if (condicao) {
  // Faça isso se a condição for verdadeira
} else {
  // Faça isso se a condição for falsa
}
```

b. else if:

    Senão Se (else if): Permite adicionar mais condições!

Por exemplo:

```javascript

if (condicao1) {
  // Faça isso se a condição1 for verdadeira
} else if (condicao2) {
  // Faça isso se a condição2 for verdadeira
} else {
  // Faça isso se nenhuma das condições for verdadeira
}
```

# Exemplo Prático:

Vamos fazer um programa simples que pergunta a idade e diz se a pessoa é criança, adolescente ou adulto.

```javascript

let idade = 9; // Experimente mudar a idade!

if (idade < 13) {
  console.log("Você é uma criança.");
} else if (idade >= 13 && idade < 18) {
  console.log("Você é um adolescente.");
} else {
  console.log("Você é um adulto.");
}
```

- Tente mudar o valor de idade para ver como o programa responde!

4. Exercício:

Tente fazer um programa que pergunta o nome da pessoa e depois diz "Olá, [nome]" se o nome for "Alice" ou "Bob". Se for outro nome, ele pode dizer "Desculpe, não te reconheço.".