# Active Recall - Tipos Primitivos e Wrappers

## Questão 1: Casting e Truncamento
**Pergunta:** O que acontece se eu fizer `int x = (int) 5.99;`? O resultado é 6 ou 5? Qual o nome técnico disso?

**Resposta:** O resultado é 5, pois o Java corta as casas decimais. O nome técnico disso é **truncamento**.

---

## Questão 2: Divisão entre Inteiros
**Pergunta:** Explique por que `double x = 5 / 2;` resulta em 2.0 e não 2.5.

**Resposta:** Porque os números 5 e 2 são `int`, então o sistema faz a conta como inteiros e só depois salva como `double`, perdendo as casas decimais.

---

## Questão 3: Conversão Segura de Long para Int
**Pergunta:** Qual método estático da classe `Math` (introduzido no Java 8) eu devo usar para converter um `long` para `int` garantindo que, se houver overflow, uma exceção será lançada?

**Resposta:** `Math.toIntExact(valor)`
