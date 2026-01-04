# Desafio: Contador de Personagens com Static

## Cenário

Vamos contar quantos personagens você criou até agora.

## Sua Missão

1. Na classe Personagem, crie um atributo: `public static int quantidade = 0;`
2. Agora vá nos seus dois Construtores e adicione a linha `quantidade++;` dentro de cada um
   - Isso fará o contador subir toda vez que alguém nascer
3. No Main, crie 3 personagens diferentes
4. No final do Main, imprima: "Total de personagens criados: " + Personagem.quantidade

## Dica

Lembre-se: variáveis static são acessadas pelo nome da Classe (Personagem.quantidade), não pelo nome do objeto (heroi.quantidade).

---
