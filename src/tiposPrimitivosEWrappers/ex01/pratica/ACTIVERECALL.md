# Active Recall - Tipos Primitivos e Wrappers

## Perguntas e Respostas

### Questão 1: Comparação de Wrappers com ==

**Pergunta:** Se eu declarar `Integer x = 1000;` e `Integer y = 1000;`, o resultado de `x == y` será `true` ou `false`? Por quê?

**Resposta:** `false`, pois `==` compara localização da memória, não os conteúdos.

---

### Questão 2: Alocação de Memória

**Pergunta:** Qual a diferença fundamental de onde a memória é alocada para um `long` (primitivo) versus um `Long` (wrapper)?

**Resposta:** O `long` (primitivo) é armazenado na **Stack** (quando é variável local), contendo o valor diretamente. Já o `Long` (Wrapper) é um objeto completo, então ele é alocado na **Heap**, e a variável contém apenas uma referência (endereço) para esse objeto.

---

### Questão 3: Generics e Primitivos

**Pergunta:** Por que eu não posso criar uma lista assim: `List<double> precos = new ArrayList<>();`? O que devo fazer no lugar?

**Resposta:** Porque as listas (Generics) em Java só aceitam **Objetos** (tipos de referência), e primitivos não são objetos. No lugar, você deve usar a classe Wrapper correspondente:

```java
List<Double> precos = new ArrayList<>();
```

---

## Dicas para Memorização

- **`==` para Wrappers**: Compara referências, não valores. Use `.equals()` para comparar conteúdos.
- **Stack vs Heap**: Primitivos são rápidos (Stack), Wrappers são objetos (Heap).
- **Generics**: Sempre use Wrappers, nunca primitivos.


