# Desafio: Sobrecarga de Construtores

## Cenário

Você já tem uma classe `Personagem` com um construtor que recebe nome e força. Agora você precisa adicionar flexibilidade ao sistema.

## Sua Missão

1. Na classe `Personagem`, mantenha o construtor atual
2. Crie um segundo construtor que receba apenas o `nome`
3. Dentro desse novo construtor, defina a `this.forca` como `10` (padrão para novatos/monstros fracos)
4. No `Main`, crie um objeto `Personagem campones = new Personagem("Camponês");` (sem passar a força)
5. Imprima o nome e a força do camponês para confirmar que ele nasceu com força 10

## Dica

Use sobrecarga de construtores para dar valores padrão quando o usuário não informar todos os dados.
