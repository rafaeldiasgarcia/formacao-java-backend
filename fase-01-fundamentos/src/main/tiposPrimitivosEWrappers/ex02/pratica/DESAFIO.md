# Desafio: Migração de Dados de Legado

## Cenário

Você está recebendo dados de um sistema moderno (IDs são `long`, Avaliações são `double` de 0.0 a 10.0) e precisa exportar para um sistema legado jurássico (IDs são `int`, Avaliações são notas inteiras de 0 a 10).

## Sua Missão

**Implemente um método:**

```java
public void processarDados(long[] ids, double[] notas)
```

### Requisitos:

1. Itere pelos dados
2. Converta o ID de `long` para `int`
   - Se o ID for maior que `Integer.MAX_VALUE`, lance uma mensagem de erro **"ID X ignorado: Overflow"** e pule para o próximo
   - Use a classe `Math` para validar
3. Converta a nota de `double` para `int` usando **arredondamento** (9.6 deve virar 10, não 9)
4. Imprima: `"ID: [id_convertido] | Nota: [nota_convertida]"`

## Dica

Use `Math.toIntExact()` para conversão segura de IDs e `Math.round()` para arredondamento de notas.

## Conceitos Aplicados

- Narrowing Casting (long → int)
- Validação de Overflow
- Arredondamento vs Truncamento
- Tratamento de exceções
