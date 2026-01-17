# Exercícios de Fixação: Collections

## Exercício 1: A Lista de Compras (ArrayList)
**Objetivo:** Aprender a adicionar, remover e listar elementos em um ArrayList.

### Sua Missão
1. Crie um `ArrayList<String>` chamado `listaCompras`.
2. Adicione 5 itens de supermercado à lista (ex: "Arroz", "Feijão", etc).
3. Remova o segundo item da lista.
4. Exiba o tamanho da lista usando `.size()`.
5. Use um laço `for` ou `for-each` para imprimir todos os itens da lista no console.

---

## Exercício 2: O Clube dos Nomes Únicos (HashSet)
**Objetivo:** Entender que o `Set` não permite elementos duplicados e não garante ordem.

### Sua Missão
1. Crie um `HashSet<String>` chamado `convidados`.
2. Adicione os seguintes nomes: "Ana", "Bruno", "Carla", "Ana", "Daniel".
3. Tente imprimir o `HashSet` e observe se o nome "Ana" aparece duas vezes.
4. Verifique se o nome "Carla" está na lista usando o método `.contains()`.
5. Remova "Bruno" e mostre a lista final.

---

## Exercício 3: Tabela de Preços (HashMap)
**Objetivo:** Praticar a relação Chave-Valor com `HashMap`.

### Sua Missão
1. Crie um `HashMap` onde a chave é o nome de um produto (`String`) e o valor é o seu preço (`Double`).
2. Adicione 3 produtos: "Caderno" (R$ 15.00), "Caneta" (R$ 2.00) e "Borracha" (R$ 1.00).
3. Peça para o programa imprimir o preço da "Caneta" buscando-a pela chave.
4. Atualize o preço do "Caderno" para R$ 18.00 (basta usar o `.put` com a mesma chave).
5. Remova a "Borracha" do mapa.

---

## Exercício 4: O Filtro de Números (ArrayList + Condicional)
**Objetivo:** Praticar lógica de programação dentro de uma coleção.

### Sua Missão
1. Crie um `ArrayList` de Inteiros (`Integer`) e adicione 10 números aleatórios (ex: 5, 12, 8, 20, 3, 1, 15...).
2. Crie um segundo `ArrayList` chamado `maioresQueDez`.
3. Percorra a primeira lista e, para cada número, verifique: se for maior que 10, adicione-o na lista `maioresQueDez`.
4. Imprima a lista resultante.

---

## Exercício 5: Dicionário Simples (HashMap + Interação)
**Objetivo:** Simular uma busca em um banco de dados simples.

### Sua Missão
1. Crie um `HashMap` chamado `dicionario`. A chave será a palavra em Inglês e o valor a tradução em Português.
2. Adicione: "Apple" -> "Maçã", "Dog" -> "Cachorro", "Computer" -> "Computador".
3. Use o método `.get()` para buscar a tradução de uma palavra que existe e imprima.
4. Tente buscar uma palavra que não existe (ex: "Car") e verifique o que acontece (o Java retorna `null`).
5. **Extra:** Use um `if` para mostrar uma mensagem amigável caso a palavra não seja encontrada.


