# Desafio: Sistema de Instrumentos Musicais

## Cenário

Vamos criar um sistema simples para instrumentos musicais usando classes abstratas e interfaces.

## Sua Missão

1. Crie uma **Interface** chamada `Afinavel` com o método `afinar()`
2. Crie uma **Classe Abstrata** chamada `Instrumento` com:
   - O atributo `marca`
   - Um construtor que recebe a marca
   - Um método abstrato `tocar()`
3. Crie uma **Classe Concreta** `Violao` que:
   - Herda de `Instrumento`
   - Implementa `Afinavel`
   - Implementa os métodos `tocar()` e `afinar()`
4. Na classe `Main`, crie um violão e chame os métodos

## Output (Saída esperada)

```
O violão da marca [marca] está tocando...
Afinando o violão...
```

## Dica

Use `abstract class` para criar a classe abstrata e `implements` para implementar a interface.
