# Analogia: A Régua de Borracha vs. O Papel Quadriculado

## double / float (Ponto Flutuante)

Imagine medir uma mesa com uma **régua de borracha que estica**. É muito rápida de usar, mas para medidas exatas, ela falha. O computador aproxima o valor usando potências de 2 (binário), e nem todo número decimal (base 10) cabe perfeitamente lá.

## BigDecimal

É como desenhar em um **papel quadriculado**. Cada dígito ocupa um quadrado exato. É mais lento para desenhar (mais pesado na memória/CPU), mas a precisão é absoluta.

---

## O Fato Chocante

Em Java `double`, **0.1 + 0.2 NÃO é igual a 0.3**. É igual a `0.30000000000000004`.

---

## Por que usar? (A Regra do Dinheiro)

| Recurso | double (Primitivo) | BigDecimal (Objeto) | Veredito Sênior |
|---------|-------------------|---------------------|-----------------|
| Precisão | Aproximada (IEEE 754) | Exata (Arbitrária) | Jamais use double para dinheiro. |
| Performance | Extremamente Rápido (Hardware) | Lento (Software) | Use double para física, coordenadas (GPS), gráficos. |
| Operadores | `+`, `-`, `*`, `/` | Métodos: `.add()`, `.multiply()` | BigDecimal é verboso, mas necessário. |
| Imutabilidade | Não se aplica | Imutável | `valor.add(10)` não muda o valor original, retorna um novo! |

