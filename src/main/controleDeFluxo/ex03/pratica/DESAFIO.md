# Desafio: Diário de Notas

## Cenário

Você precisa criar um programa para um professor registrar as notas de uma turma pequena. O sistema deve ter um menu interativo e validações de segurança.

## Requisitos Técnicos (Obrigatório usar)

**Array:** Crie um vetor (`double[]`) para guardar no máximo 5 notas.

**Do-While:** Para manter o menu rodando até o usuário pedir para sair.

**Switch:** Para selecionar as opções do menu.

**If/Else:** Para verificar se o vetor (diário) já está cheio antes de adicionar uma nota (A "Blindagem" que falamos antes!).

**While:** Para validação de entrada (explicado abaixo).

**For:** Para listar todas as notas cadastradas.

## Funcionalidades do Menu

### Opção 1: Adicionar Nota

- Verifique se ainda há espaço no array (se cadastrou menos de 5 notas).

- Se estiver cheio: Mostre "Erro: Diário lotado!".

- Se tiver espaço: Peça a nota.

- **Desafio Extra (While):** Use um while para garantir que a nota seja válida (entre 0 e 10). Enquanto o usuário digitar algo como -5 ou 15, repita a pergunta: "Nota inválida, digite novamente".

- Salve a nota no array e aumente o contador.

### Opção 2: Exibir Notas

- Use um for para mostrar todas as notas cadastradas até o momento.

### Opção 3: Calcular Média

- Some todas as notas cadastradas e divida pela quantidade de notas.

- **If/Else:** Se a média for maior ou igual a 7.0, imprima "Turma Aprovada". Senão, "Turma em Recuperação".

### Opção 0: Sair

- Encerra o programa.

## Output (Saída esperada)

```
--- DIÁRIO UNIFIO ---
1. Adicionar Nota
2. Listar Notas
3. Calcular Média Geral
0. Sair
Opção: 1

Digite a nota: 15
Valor inválido! Digite a nota (0-10): -2
Valor inválido! Digite a nota (0-10): 8.5
Nota adicionada!

--- DIÁRIO UNIFIO ---
Opção: 1
(Usuario tenta adicionar a 6ª nota...)
Erro: Diário lotado! Não é possível adicionar mais notas.
```

## Dicas para Resolver

- Você vai precisar de uma variável inteira (ex: `indice` ou `contador`) começando em 0 para saber quantas notas já foram cadastradas.

- No for de listar, use `i < contador` (e não o tamanho total do array), senão você vai listar zeros de posições vazias.

- Para o while de validação da nota, a lógica é: "Enquanto nota for menor que 0 OU nota for maior que 10... pergunte de novo".
