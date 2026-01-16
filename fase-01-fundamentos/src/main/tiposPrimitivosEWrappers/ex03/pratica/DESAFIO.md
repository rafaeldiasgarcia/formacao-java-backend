# Desafio: Conversor de Moedas para E-commerce Internacional

## Cenário

Você precisa converter uma lista de preços em Reais (BRL) para Dólares (USD).

## Problema

Receba um `List<String>` com preços (ex: `"10.50"`, `"50.00"`, `"invalid"`).

### Requisitos:

1. A taxa de câmbio é fixa: **5.15**
2. Descarte valores inválidos
3. Aplique a conversão
4. O resultado deve ter apenas **2 casas decimais**, usando arredondamento bancário (`HALF_EVEN`)
5. Imprima: `"R$ [original] = US$ [convertido]"`

## Estrutura Esperada

```java
public void converterMoedas(List<String> precosBRL) {
    // Sua implementação aqui
}
```

## Dica

Lembre-se que para converter BRL para USD, você **divide** pelo valor do dólar.

## Conceitos Aplicados

- `BigDecimal` para precisão monetária
- Conversão de String para BigDecimal
- `RoundingMode.HALF_EVEN` (arredondamento bancário)
- Tratamento de exceções (`NumberFormatException`)
- Imutabilidade do BigDecimal
