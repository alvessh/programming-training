# Explicação dos Conceitos de Orientação a Objetos

## 1. Classes e Objetos

**Classes** são modelos ou "blueprints" que definem as propriedades (atributos) e comportamentos (métodos) de um tipo de objeto. **Objetos** são instâncias dessas classes.

- **Exemplo de Classes:**
  - `Model`
  - `PessoaModel`
  - `TarefaModel`
  - `Database`
  - `DatabaseManager` (implementando o padrão Singleton)

- **Exemplo de Objetos:**
  - `pessoa1`, `pessoa2` (instâncias de `PessoaModel`)
  - `tarefa1` (instância de `TarefaModel`)
  - `pessoaDatabase`, `tarefaDatabase` (instâncias de `Database`)
  - `DatabaseManager.getPessoaDatabase()`, `DatabaseManager.getTarefaDatabase()` (instâncias Singleton do `Database`)

## 2. Herança

**Herança** permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse), promovendo reuso e extensão de código.

- **Exemplo no Código:**
  - `PessoaModel` e `TarefaModel` herdam de `Model`. Isso significa que ambos os modelos compartilham a mesma estrutura básica definida em `Model`, mas podem adicionar ou modificar comportamentos específicos.

## 3. Polimorfismo

**Polimorfismo** permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Isso é possível através de interfaces e classes abstratas.

- **Exemplo no Código:**
  - O `Database<T extends Model>` usa polimorfismo para tratar diferentes tipos de `Model` (`PessoaModel`, `TarefaModel`) de maneira uniforme.

## 4. Encapsulamento

**Encapsulamento** é o conceito de esconder os detalhes internos de um objeto e expor apenas o necessário através de métodos públicos. Isso protege os dados e reduz a complexidade.

- **Exemplo no Código:**
  - Os atributos das classes (`PessoaModel`, `TarefaModel`) são privados e acessados/modificados através de métodos públicos (`getId`, `setId`, `getNome`, etc.).

## 5. Abstração

**Abstração** envolve simplificar sistemas complexos escondendo os detalhes de implementação e expondo apenas a funcionalidade essencial.

- **Exemplo no Código:**
  - A classe `Model` é uma classe abstrata que define a estrutura básica (`getId`, `setId`) que todas as subclasses (`PessoaModel`, `TarefaModel`) devem implementar. Não se preocupa com os detalhes específicos de cada tipo de modelo.

## 6. Generics

**Generics** permitem que classes, interfaces e métodos operem em tipos especificados pelo cliente, proporcionando um maior nível de abstração e segurança de tipos em tempo de compilação.

- **Exemplo no Código:**
  - A classe `Database<T extends Model>` é genérica, permitindo que ela funcione com qualquer tipo que estenda `Model`, como `PessoaModel` e `TarefaModel`.

### **Classe `T`**

A letra `T` é uma convenção comumente usada em Java para representar um tipo genérico. Ela é usada em declarações de classe, interface ou método para indicar que uma classe ou método é genérico e pode operar em qualquer tipo de dado.

- **Uso no Código**:
  - Em `Database<T extends Model>`, `T` é um tipo genérico que estende `Model`. Isso significa que `T` pode ser qualquer classe que herde de `Model`, como `PessoaModel` ou `TarefaModel`.
  - `T` é utilizado em métodos como `insert`, `update`, `selectAll`, `delete`, onde representa o tipo dos objetos armazenados no banco de dados. Por exemplo, `Database<PessoaModel>` representa um banco de dados de pessoas, enquanto `Database<TarefaModel>` representa um banco de dados de tarefas.

### **Benefícios do Uso de `T`**

- **Flexibilidade**: `T` permite que `Database` seja reutilizado com diferentes tipos de modelos sem precisar criar uma classe separada para cada tipo.
- **Segurança de Tipos**: O uso de `T` garante que os tipos de dados passados para `Database` sejam verificados em tempo de compilação, reduzindo erros relacionados a tipos em tempo de execução.
- **Abstração**: `T` abstrai o tipo de dados armazenados no banco de dados, permitindo que a implementação interna da classe `Database` seja independente do tipo de modelo.

## 7. Singleton

**Singleton** é um padrão de projeto que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.

- **Exemplo no Código:**
  - A classe `DatabaseManager` implementa o padrão Singleton para gerenciar instâncias únicas do banco de dados para diferentes tipos de modelos (`PessoaModel` e `TarefaModel`).

### **Classe `DatabaseManager`**

A classe `DatabaseManager` garante que haja apenas uma instância do `Database` para cada tipo de modelo.

## Uso do synchronized

O modificador `synchronized` em métodos estáticos garante que apenas uma thread possa acessar o método por vez. Isso é crucial para o padrão Singleton em ambientes multithreaded, pois previne a criação de múltiplas instâncias do singleton.

### Exemplo no Código:
- Os métodos `getPessoaDatabase()` e `getTarefaDatabase()` são sincronizados para garantir que apenas uma instância de cada banco de dados seja criada, mesmo que múltiplas threads tentem acessar esses métodos simultaneamente.

## Benefícios do Uso de Singleton

- **Controle de Instância**: Garante que apenas uma instância de cada `Database` exista, evitando inconsistências.
- **Acesso Global**: Fornece um ponto global de acesso às instâncias do banco de dados.
- **Inicialização Tardia**: Instâncias são criadas apenas quando necessárias, economizando recursos.
