Uma tabela em HTML é uma estrutura usada para exibir informações em linhas e colunas. Ela é construída usando as tags <table>, <tr>, <td>, e <th>. Aqui está uma explicação sobre essas tags e como elas funcionam:

```<table>```: Define a estrutura da tabela como um todo.
Exemplo:

```html

<table>
    <!-- Conteúdo da tabela -->
</table>
```

```<tr> (table row)```: Define uma linha na tabela.

Exemplo:

```html

<table>
    <tr> <!-- Uma linha -->
        <!-- Conteúdo das células nesta linha -->
    </tr>
</table>
```
```<td> (table data)```: Define uma célula na tabela dentro de uma linha (<tr>). Esta é usada para conter os dados da tabela.

Exemplo:

```html

<table>
    <tr>
        <td> Dado da célula </td>
        <td> Dado da célula </td>
        <td> Dado da célula </td>
        <td> Dado da célula </td>
        <td> Dado da célula </td>
        <!-- Outras células nesta linha -->
    </tr>
</table>
```

```<th> (table header)```: Define uma célula de cabeçalho na tabela. Geralmente é usada para títulos de colunas ou linhas.

Exemplo:

```html

    <table>
        <tr>
            <th> Título da coluna </th>
            <!-- Outros títulos de colunas -->
        </tr>
        <tr>
            <td> Dado da célula </td>
            <!-- Outras células nesta linha -->
        </tr>
    </table>
```
Aqui está um exemplo simples de uma tabela HTML com duas linhas e duas colunas:

```html

<table border="1">
    <tr>
        <th>Nome</th>
        <th>Idade</th>
    </tr>
    <tr>
        <td>João</td>
        <td>25</td>
    </tr>
    <tr>
        <td>Maria</td>
        <td>30</td>
    </tr>
</table>
```
Neste exemplo, <th> é usado para os títulos das colunas ("Nome" e "Idade"), enquanto <td> é usado para os dados das células.

Além disso, existem atributos adicionais que podem ser usados com as tags <table>, <tr>, <td>, e <th>, como colspan para mesclar células em colunas, rowspan para mesclar células em linhas, e outros atributos para estilização e formatação.

