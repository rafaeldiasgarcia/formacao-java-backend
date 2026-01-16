# Active Recall - BigDecimal e Precisão

## Questão 1: Imprecisão de Ponto Flutuante
**Pergunta:** Por que `0.1 + 0.2 == 0.3` retorna `false` em Java (double)?

**Resposta:** O computador guarda números em binário (0 e 1). Assim como 10/3 dá dízima no nosso mundo decimal (3.333...), o 0.1 dá "dízima" no mundo binário. O computador arredonda essa dízima binária, e a soma acaba ficando 0.30000000000000004 em vez de 0.3.

---

## Questão 2: Comparação de BigDecimal
**Pergunta:** Qual a diferença crucial entre `bd1.equals(bd2)` e `bd1.compareTo(bd2)` ao comparar 1.0 e 1.00?

**Resposta:** O `equals()` compara tudo, até a quantidade de casas decimais. O `compareTo()` compara apenas o valor numérico.

---

## Questão 3: Divisão com BigDecimal
**Pergunta:** O que acontece se eu fizer `bigDecimalValor.divide(outroValor)` e o resultado for uma dízima periódica (ex: 10/3) sem especificar o `RoundingMode`?

**Resposta:** O Java retorna um erro de dízima periódica, `ArithmeticException` (o Java entra em pânico porque precisaria de memória infinita para guardar o número).

