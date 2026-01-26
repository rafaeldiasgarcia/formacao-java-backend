# 🏆 Desafios: Dominando Collections

## Challenge 1: TO DO LIST (List)
**Cenário:** Você está criando um app simples de To-Do List.
**Sua Missão:** 
1. Crie uma `ArrayList` de strings. 
2. Adicione 3 tarefas. 
3. Remova a segunda tarefa (pelo índice). 
4. Imprima as tarefas restantes.

---

## Challenge 2: O Filtro de Convidados (Set)
**Cenário:** Um formulário web recebeu inscrições duplicadas de e-mails para um evento.
**Sua Missão:** 
1. Crie uma `List` com os seguintes e-emails: `["a@a.com", "b@b.com", "a@a.com", "c@c.com"]`. 
2. Converta essa lista para um `HashSet` para remover automaticamente as duplicatas.
3. Imprima o tamanho da lista original vs o tamanho do Set final.

---

## Challenge 3: O Dicionário de Gírias (Map)
**Cenário:** Você quer criar um tradutor de gírias dev.
**Sua Missão:** 
1. Crie um `HashMap` onde as chaves são as gírias (ex: "Bug", "Deploy") e os valores são as descrições. 
2. Adicione 3 termos. 
3. Peça para o sistema imprimir a definição de um termo específico usando `map.get()`.

---

## Challenge 4: Contador de Frequência (Lógica + Map)
**Cenário:** Análise de texto de linguagens de programação.
**Sua Missão:** 
1. Dada uma lista de palavras: `["java", "python", "java", "c++", "java", "python"]`.
2. Use um `Map<String, Integer>` para contar quantas vezes cada linguagem aparece.
**Dica:** Ao percorrer a lista, verifique se a chave já existe no Map. Se sim, incremente o valor. Se não, adicione com valor 1.

---

## Challenge 5: Sistema de Notas (Map aninhado com List)
**Cenário:** Um sistema escolar complexo que associa alunos a múltiplas notas.
**Sua Missão:** 
1. Crie uma estrutura `Map<String, List<Double>>`.
2. Adicione o aluno "João" com as notas `[8.0, 9.0]`.
3. Adicione a aluna "Maria" com as notas `[10.0, 9.5]`.
4. Itere sobre o mapa e imprima o nome do aluno e a média das suas notas.
