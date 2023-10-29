# Laços de Repetição (Loops)

## O Que São Laços de Repetição?

Imagine que você tem uma caixa cheia de brinquedos e quer brincar com todos eles, um por um. Em vez de pegar cada brinquedo separadamente, você pode usar um "loop" para pegar um brinquedo, brincar com ele, e depois pegar o próximo, e assim por diante.
Tipos de Laços:

Existem dois tipos principais de loops:

## O Loop "for":

O loop "for" é como um contador. Você diz quantas vezes quer fazer algo, e ele faz isso para você.

Exemplo:

```javascript

for (let i = 0; i < 5; i++) {
  console.log("Número " + i);
}
```
Isso imprimiria os números de 0 a 4 no console.

## O Loop "while":

O loop "while" é como uma pergunta. Ele pergunta se algo é verdadeiro e, se for, ele continua fazendo isso.

Exemplo:

```javascript

let contador = 0;

while (contador < 5) {
  console.log("Número " + contador);
  contador++;
}
```
Isso também imprimiria os números de 0 a 4 no console.
Comparação com Brinquedos:

Pense nos loops como pegar e brincar com os brinquedos. O loop "for" diz "pegue cinco brinquedos". O loop "while" diz "pegue brinquedos enquanto houver mais na caixa".
Por Que Usamos Loops?

Usamos loops quando temos muitas coisas para fazer que são parecidas. Em vez de fazer a mesma coisa várias vezes, usamos um loop para fazer isso automaticamente.
Exemplo Prático:

Suponha que temos uma lista de nomes e queremos saudar cada pessoa:

```javascript

let nomes = ["Alice", "Bob", "Charlie", "David", "Eve"];

for (let i = 0; i < nomes.length; i++) {
  console.log("Olá, " + nomes[i] + "!");
}
```
Isso imprimiria:

```css

Olá, Alice!
Olá, Bob!
Olá, Charlie!
Olá, David!
Olá, Eve!
```

## Conclusão:

Os loops nos ajudam a fazer coisas repetitivas de forma rápida e eficiente, como brincar com todos os nossos brinquedos em uma caixa.