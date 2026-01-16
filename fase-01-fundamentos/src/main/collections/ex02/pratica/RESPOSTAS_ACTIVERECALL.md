# 📝 Respostas - Active Recall Collections

## ✅ Gabarito Completo

### Questão 1: Ordem no ArrayList
**Resposta:** ✅ **Verdadeiro**

**Explicação:** O ArrayList (List) mantém a ordem de inserção. Se você adicionar os itens na ordem A, B, C, eles permanecerão nessa ordem. O índice 0 será sempre o primeiro item adicionado, o índice 1 será o segundo, e assim por diante.

---

### Questão 2: Duplicatas no HashSet
**Resposta:** ❌ **Falso**

**Explicação:** O HashSet (Set) **NÃO** aceita duplicatas. Se você tentar adicionar "Ana" duas vezes, apenas uma "Ana" será armazenada no Set. A segunda tentativa de adicionar será silenciosamente ignorada pelo Java.

Exemplo:
```java
Set<String> nomes = new HashSet<>();
nomes.add("Ana");
nomes.add("Ana"); // Esta linha não adiciona nada novo
System.out.println(nomes.size()); // Imprime: 1
```

---

### Questão 3: Busca no Map
**Resposta:** ❌ **Falso**

**Explicação:** No Map (HashMap), você **NÃO** busca por índice numérico. Você busca pela **CHAVE**. Por exemplo: `estoque.get("Mouse")` busca pelo produto "Mouse", não por uma posição numérica.

Comparação:
- **List:** `frutas.get(0)` → busca por índice
- **Map:** `estoque.get("Mouse")` → busca por chave

---

### Questão 4: Atualização de Valor no Map
**Resposta:** ❌ **Falso**

**Explicação:** Se você usar `.put()` com uma chave que já existe, o Java **substitui o valor antigo** pelo novo. Ele **NÃO cria uma entrada duplicada**.

Exemplo:
```java
Map<String, Double> estoque = new HashMap<>();
estoque.put("Mouse", 50.00);  // Adiciona Mouse com preço 50.00
estoque.put("Mouse", 60.00);  // SUBSTITUI o preço para 60.00
System.out.println(estoque.size()); // Imprime: 1 (apenas um Mouse)
System.out.println(estoque.get("Mouse")); // Imprime: 60.0
```

---

### Questão 5: Imports Necessários
**Resposta:** ✅ **Verdadeiro**

**Explicação:** Todas as Collections (List, Set, Map) e suas implementações (ArrayList, HashSet, HashMap) estão no pacote `java.util`, então precisam ser importadas:

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
```

---

## 🎯 Resumo Rápido

| Collection | Ordem? | Duplicatas? | Acesso |
|------------|--------|-------------|---------|
| **List** (ArrayList) | ✅ Sim | ✅ Aceita | Por índice: `.get(0)` |
| **Set** (HashSet) | ❌ Não garante | ❌ Não aceita | Por iteração (foreach) |
| **Map** (HashMap) | ❌ Não garante | ❌ Chaves únicas | Por chave: `.get("chave")` |

---

## 💡 Dicas de Memorização

1. **List = Lista ordenada de supermercado** → tem ordem, pode repetir item
2. **Set = Álbum de figurinhas** → sem repetição, sem ordem fixa
3. **Map = Agenda telefônica** → busca por nome (chave), não por página (índice)

