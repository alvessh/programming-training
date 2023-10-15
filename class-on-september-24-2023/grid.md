A propriedade `grid-template-columns` está sendo usada aqui para definir as colunas de um layout de grade. Vamos analisar a expressão `repeat(6, minmax(100px, 1fr))`:

- `repeat(6, ...)`: indica que queremos repetir o padrão especificado seis vezes. No caso, estamos criando seis colunas.

- `minmax(100px, 1fr)`: é o padrão que estamos repetindo. Isso significa que cada coluna terá no mínimo 100 pixels de largura e no máximo uma fração do espaço disponível (1fr).

`minmax(100px, 1fr)`:

- `minmax(min, max)`: Esta função CSS define um intervalo entre os valores `min` e `max`. No nosso caso, `min` é `100px` e `max` é `1fr`.

- `100px`: Esta é a largura mínima que a coluna pode ter. Ou seja, ela nunca será menor que 100 pixels.

- `1fr`: Isso significa "uma fração do espaço disponível". Se houver espaço extra após o layout inicial ser calculado, esta coluna irá expandir para preencher esse espaço.

No contexto de `grid-template-columns`, isso significa que cada coluna terá pelo menos 100 pixels de largura, mas se houver mais espaço disponível, elas se expandirão de forma igual para ocupar o espaço extra.

Isso é especialmente útil para criar layouts responsivos, onde as colunas podem aumentar ou diminuir de tamanho dependendo do tamanho da tela ou do contêiner que as contém. O uso de `1fr` permite que o layout se adapte de forma flexível a diferentes tamanhos de tela.


- `padding: 20px 20px 0 20px;`: Define o preenchimento (espaço interno) do elemento `<header>`. O valor 20px se aplica ao topo, à direita, à parte inferior e à esquerda, respectivamente.

- `position: fixed;`: Torna o elemento `<header>` com uma posição fixa na página, ou seja, ele permanece no mesmo lugar mesmo quando a página é rolada.

- `top: 0;`: Define que o elemento `<header>` será alinhado no topo da página.

- `display: grid;`: Define o elemento como um contêiner de grade, permitindo o uso de layout de grade para organizar seus elementos filhos.

- `grid-gap: 5px;`: Define um espaço de 5 pixels entre as células da grade dentro do elemento `<header>`.

- `grid-template-columns: 1fr 4fr 1fr;`: Define o layout de colunas da grade. Aqui, a grade tem três colunas. A primeira e a terceira coluna têm uma fração do espaço disponível cada, enquanto a segunda coluna tem quatro frações. Isso significa que a segunda coluna é quatro vezes mais larga que as outras.

- `grid-template-areas: "nt mn mn sb . . . ";`: Define o layout das áreas da grade. Cada parte do cabeçalho tem um "nome" (nt, mn, sb) que pode ser referenciado em elementos filhos para especificar em qual área eles devem ser colocados.

- `background-color: var(--primary);`: Define a cor de fundo do elemento `<header>`. Está usando uma variável CSS chamada `--primary`.

- `width: 100%;`: Define a largura do elemento `<header>` como 100% do contêiner pai.

- `margin-bottom: 0px;`: Define a margem inferior do elemento `<header>` como 0 pixels.

No geral, essas regras de estilo estão configurando um cabeçalho fixo no topo da página, usando um layout de grade para organizar seu conteúdo em três áreas distintas (nt, mn, sb) e aplicando estilos de aparência e posicionamento.
