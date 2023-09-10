# HTML: HyperText Markup Language

O HTML (Linguagem de Marcação de Hipertexto) é a espinha dorsal da maioria das páginas da web. Ele fornece a estrutura básica para organizar o conteúdo em uma página.

## História do HTML

O **HTML** (Linguagem de Marcação de Hipertexto) desempenhou um papel fundamental na criação da World Wide Web, uma revolução que transformou a maneira como as pessoas compartilham e acessam informações online. Antes da web, a maioria dos documentos era estática e isolada. A World Wide Web, criada por Tim Berners-Lee, é uma plataforma que permite a interconexão de documentos e recursos em toda a Internet por meio de links hipertexto.

A **World Wide Web** (WWW ou simplesmente Web) é um sistema de informação global que permite a navegação por meio de documentos ligados por hipertexto. Hipertexto é um tipo de texto que contém links para outros documentos ou recursos, permitindo que os usuários cliquem em palavras ou imagens para acessar informações relacionadas. Isso criou uma rede interconectada de informações, permitindo que as pessoas navegassem e acessassem dados de forma eficiente, uma característica que é agora essencial para a forma como usamos a Internet.
Links de Texto

No início da World Wide Web, os links eram principalmente de texto. Isso significa que as pessoas podiam clicar em palavras ou frases em uma página e serem direcionadas para outra página relacionada. No entanto, esses links eram bastante simples e geralmente levavam a documentos de texto básicos.

Tim Berners-Lee percebeu que para a Web se tornar verdadeiramente poderosa, ela precisaria de uma linguagem para estruturar e formatar o conteúdo de uma maneira mais rica e significativa. Assim, ele desenvolveu o HTML, que permitia a criação de documentos com formatação e a adição de elementos como imagens e links, proporcionando uma experiência mais rica e dinâmica para os usuários.

Com o HTML, a Web evoluiu além dos simples links de texto para incluir gráficos, multimídia, formulários interativos e muito mais, pavimentando o caminho para o desenvolvimento das páginas web modernas que conhecemos hoje.

## Diferença entre HTML e HTML5

O HTML5 é a versão mais recente e avançada do HTML. Ele foi oficialmente lançado em outubro de 2014 e trouxe consigo uma série de melhorias e novos recursos em relação às versões anteriores.

Principais diferenças incluem:

- **Sintaxe e Estruturação Melhorada**: O HTML5 introduziu novos elementos semânticos como `<section>`, `<article>`, `<nav>`, `<header>`, `<footer>`, `<aside>`, `<main>`, que facilitam a organização do conteúdo.

- **Suporte a Mídia Aprimorado**: O HTML5 oferece suporte nativo a áudio e vídeo, eliminando a necessidade de plugins como o Adobe Flash.

- **APIs Avançadas**: Ele apresenta uma série de APIs que permitem funcionalidades avançadas, como a API de Geolocalização, a API de Armazenamento Local e a API de Canvas para gráficos dinâmicos.

- **Compatibilidade com Dispositivos Móveis**: O HTML5 foi projetado com foco na compatibilidade e responsividade para dispositivos móveis, tornando a criação de páginas web móveis mais eficiente.

- **Melhorias na Semântica**: O HTML5 enfatiza a semântica, permitindo que os desenvolvedores descrevam melhor a estrutura de uma página e seu conteúdo.

---

# Conceitos Básicos de HTML

## O que é uma tag no HTML?

Uma tag no HTML é uma instrução que define como um elemento deve ser exibido em uma página web. Cada tag é representada por pares de colchetes angulares, como `<tag>`. As tags geralmente têm uma forma de abertura `<tag>` e uma forma de fechamento `</tag>`. No entanto, algumas tags, como `<img>`, não têm um elemento de fechamento, pois são autossuficientes e não possuem conteúdo interno. Nesses casos, a tag é escrita como `<img>` e não requer um fechamento separado.

## Como Referenciar uma Tag?

Para referenciar uma tag no HTML, basta utilizá-la pelo seu nome, envolvida pelos símbolos `<` e `>`. Por exemplo, para criar um parágrafo, utilizamos a tag `<p>`.

## O que são Atributos (Propriedades) adicionadas aos elementos no HTML?

Atributos são informações adicionais que podem ser incluídas em uma tag HTML para fornecer configurações ou características específicas ao elemento. Eles são definidos dentro da tag e consistem em um nome e um valor, separados por um sinal de igual. Por exemplo, o atributo `href` em um link define o endereço da página para onde o link aponta.

## Como Funciona a Estrutura no HTML5?

O HTML5 introduziu elementos semânticos que ajudam a melhorar a estrutura e acessibilidade do conteúdo. Alguns exemplos incluem `<section>` para definir seções de uma página, `<article>` para conteúdo independente e completo, `<nav>` para a navegação e `<header>` e `<footer>` para cabeçalho e rodapé, respectivamente.

## Exemplos:

### Sintaxe Básica:

- Tags: Elementos como `<html>`, `<head>`, `<body>`, `<p>`, `<a>`, etc.
- Atributos: Propriedades adicionadas aos elementos, como `href`, `src`, `class`, etc.
- Estrutura: Como os elementos são aninhados e organizados hierarquicamente.

### Elementos de Texto:

- `<p>` para parágrafos.
- `<h1>`, `<h2>`, ..., `<h6>` para cabeçalhos.
- `<span>` o elemento <span> é usado para aplicar estilos específicos a partes individuais de texto dentro de um parágrafo ou qualquer outra parte do conteúdo HTML. Ele não possui nenhum significado semântico em si, mas é muito útil para aplicar estilos ou manipulações específicas por meio de CSS ou JavaScript.
- `<a>` para links.
- `<strong>` para texto em negrito.
- `<em>` para texto em itálico.
- `<br>` para quebrar linha.
- `<hr>` para criar uma linha horizontal.
- `<sub>` para texto subscrito.
- `<sup>` para texto sobrescrito.

### Listas:

- `<ul>`, `<ol>`, `<li>` para listas não ordenadas, ordenadas e itens de lista, respectivamente.

### Imagens e Mídia:

- `<img>` para inserir imagens.
- `<audio>` e `<video>` para conteúdo de áudio e vídeo.

### Links:

A tag `<a>` e os atributos `href` e `target` para criar links.

### Formulários:

- `<form>` para criar formulários.
- `<input>`, `<textarea>`, `<select>`, `<button>` para diferentes elementos de formulário.

### Estrutura Básica:

- `<html>`, `<head>`, `<title>`, `<meta>`, `<link>` para configurações gerais.
- `<body>` para o conteúdo visível da página.

### Comentários:

`<!-- ... -->` para adicionar comentários no código.

### Semântica:

- Elementos semânticos como `<section>`, `<article>`, `<nav>`, `<header>`, `<footer>`, `<main>` para melhorar a estrutura e acessibilidade.

### Links Externos:

Como incorporar folhas de estilo CSS e scripts JavaScript usando `<link>` e `<script>`.

---

# Vamos implementar exemplos
