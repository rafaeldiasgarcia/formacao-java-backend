# 🧠 Collections em Java: List, Set e Map

## 📐 Analogia

Imagine que você está organizando suas coisas em casa. O Java te dá três tipos principais de "caixas" para guardar seus dados:

### 🏦 List (ArrayList): A Fila do Banco

**Como funciona:** As pessoas entram uma atrás da outra. Existe uma ordem (primeiro, segundo, terceiro).

**Detalhe:** Se o "João" quiser entrar na fila duas vezes (talvez para guardar lugar para alguém), ele pode. **Aceita duplicatas e mantém a ordem.**

---

### 🎴 Set (HashSet): O Álbum de Figurinhas

**Como funciona:** O objetivo é completar o álbum. Se você comprar um pacote e vier uma figurinha repetida, você joga fora ou troca, mas não cola no álbum de novo.

**Detalhe:** Não importa se você colou a figurinha 10 antes da 5. O que importa é que elas estão lá. **Não aceita duplicatas e (geralmente) não garante ordem.**

---

### 📖 Map (HashMap): A Agenda Telefônica

**Como funciona:** Você não procura o número solto. Você procura pelo Nome (Chave) para achar o Telefone (Valor).

**Detalhe:** Você não pode ter dois contatos com o nome exato "Mãe", mas duas pessoas diferentes (Mãe e Tia) podem ter o mesmo número de telefone fixo. **Associa uma CHAVE única a um VALOR.**

---

## 💡 Para Que Serve?

**List:** Histórico de compras de um cartão (mesmo que você compre na mesma loja duas vezes, as duas compras aparecem na lista em ordem de data).

**Set:** Lista de emails cadastrados para receber newsletter (você não quer enviar o mesmo email duas vezes para a mesma pessoa).

**Map:** Um sistema de login. Você busca pelo usuário (Chave: "joao123") para encontrar a senha ou dados dele (Valor: Objeto Usuário).

---

## 💻 Como Se Escreve (Sintaxe)

No Java moderno, usamos o "diamante" `<Tipo>` para dizer o que vai dentro da coleção. Isso evita erros.

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class AulaCollections {
    public static void main(String[] args) {

        // 1. LIST (Permite repetidos e tem índice 0, 1, 2...)
        // Lemos: "Uma Lista de Strings chamada frutas é um novo ArrayList"
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Maçã"); // Pode repetir!
        System.out.println("Lista: " + frutas.get(0)); // Pega pelo índice

        // 2. SET (Não permite repetidos)
        Set<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(10);
        numerosUnicos.add(20);
        numerosUnicos.add(10); // Esse comando é ignorado pelo Java
        // System.out.println(numerosUnicos.get(0)); // ERRO! Set não tem índice fixo assim.

        // 3. MAP (Chave -> Valor)
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("Java", "Linguagem de programação"); // .put em vez de .add
        dicionario.put("Bug", "Erro no código");
        
        System.out.println(dicionario.get("Java")); // Busca pela CHAVE, imprime o VALOR
    }
}
```

---

## 🚫 Erro Comum

**Erro:** Tentar pegar um item de um Set (Conjunto) usando `.get(0)`.

**Por que acontece:** Iniciantes acham que toda coleção tem ordem numérica (índice) como a List ou Array.

**Correção:** O Set (HashSet) é como um saco misturado. Para pegar os itens, você geralmente precisa percorrer todos eles com um loop (foreach), pois não existe "o primeiro" ou "o segundo" garantido.

