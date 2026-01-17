# 🧠 Collections em Java: List, Set e Map

As Collections em Java são estruturas de dados prontas para armazenar e manipular grupos de objetos. As três principais interfaces que você precisa dominar agora são List, Set e Map.

## 📐 Analogia

### 📻 List (ArrayList) é como uma Playlist do Spotify
**Como funciona:** A ordem importa (música 1, depois música 2)
**Detalhe:** Você pode colocar a mesma música duas vezes na playlist se quiser ouvir de novo. **Aceita duplicatas e mantém a ordem.**

---

### 🎟️ Set (HashSet) é como um Saco de Convidados VIP
**Como funciona:** Não importa a ordem que eles entraram no saco; o que importa é quem está lá.
**Detalhe:** Uma pessoa não pode entrar duas vezes na festa. Se o "João" já está na lista, tentar adicionar "João" de novo não faz nada. **Não aceita duplicatas e não garante ordem.**

---

### 🔑 Map (HashMap) é como um Guarda-Volumes (Chapelaria)
**Como funciona:** Você entrega um casaco (Valor) e recebe uma ficha com um número (Chave). Para pegar o casaco de volta, você precisa da ficha exata.
**Detalhe:** Não podem existir duas fichas com o número "10", mas dois casacos diferentes podem ser da mesma marca. **Associa uma CHAVE única a um VALOR.**

---

## 🛠️ Explicação Técnica (Por baixo dos panos)

### 📈 List (ArrayList)
O ArrayList usa um **array dinâmico**. Quando o array interno enche, o Java cria um novo array maior (geralmente 50% maior), copia tudo do antigo para o novo e descarta o antigo. O acesso pelo índice (`get(5)`) é extremamente rápido (O(1)).

### 🎯 Set (HashSet)
Ele usa o mecanismo de **hashing**. Ele calcula um código numérico (hash) para o objeto e o coloca em um "balde" (bucket) específico. Isso torna a verificação se um item já existe extremamente rápida, muito mais rápida do que percorrer uma lista inteira.

### 🗺️ Map (HashMap)
Funciona como o Set, mas para as chaves. Você fornece a Chave, o Java calcula o hash e vai direto ao endereço de memória onde o Valor está guardado. As chaves são únicas, os valores podem se repetir.

