# Active Recall - Performance e Comportamento de Collections

## Perguntas e Respostas

### Questão 1: Performance de Busca (ArrayList vs HashSet)

**Pergunta:** Se eu tenho uma lista de 1 milhão de CPFs e preciso verificar rapidamente se um CPF específico já existe nela, por que usar um ArrayList seria uma má ideia comparado a um HashSet? Explique baseado em como eles buscam os dados.

**Resposta:** O ArrayList precisaria percorrer item por item (busca linear O(n)) até encontrar o CPF, o que no pior caso levaria 1 milhão de comparações. Já o HashSet usa uma tabela hash (O(1)), indo direto ao "endereço" onde o CPF deveria estar, tornando a busca instantânea, independente do tamanho da lista.

---

### Questão 2: Sobrescrita no HashMap

**Pergunta:** No HashMap, o que acontece se eu fizer um `put("chave1", "valorA")` e, na linha seguinte, fizer `put("chave1", "valorB")`? O que acontece com a chave e o que acontece com o valor?

**Resposta:** A chave "chave1" permanece a mesma, mas seu valor associado é **sobrescrito**. O "valorA" é descartado e substituído pelo "valorB". O Map nunca terá duas chaves iguais.

---

### Questão 3: List vs Set

**Pergunta:** Qual a principal diferença comportamental entre List e Set no que tange a elementos duplicados e a ordem de inserção?

**Resposta:** A **List** mantém a ordem de inserção e permite elementos duplicados. O **Set** não garante a ordem de inserção e proíbe terminantemente elementos duplicados (ele ignora a tentativa de adicionar algo que já existe).
