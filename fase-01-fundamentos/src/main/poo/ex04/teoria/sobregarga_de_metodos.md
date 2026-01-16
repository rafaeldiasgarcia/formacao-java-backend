# 🔄 Sobrecarga de Métodos: A Analogia do Pagamento

## 🎯 Analogia

Pense no verbo "Pagar".

**Situação 1:** Você vai na padaria e diz "Vou pagar". (O caixa entende que é em Dinheiro, o padrão).

**Situação 2:** Você diz "Vou pagar com Cartão". (Você especificou o meio).

**Situação 3:** Você diz "Vou pagar com Cartão, em 3 vezes". (Especificou meio e parcelas).

A ação é a mesma (Pagar), mas a forma como ela acontece muda dependendo de quais informações você fornece.

---

## 💡 Para Que Serve?

Para não precisar inventar nomes estranhos como `atacarSozinho()`, `atacarAlvo()`, `atacarAlvoComBonus()`.

Você usa apenas `atacar` e o Java se vira para escolher a versão certa dependendo do que você colocar nos parênteses. Isso deixa o código muito mais limpo e intuitivo.

---

## 💻 Como Se Escreve (Sintaxe)

Dentro da classe, você repete o nome do método, alterando apenas o que está entre `( )`.

```java
public class Personagem {
    // ... atributos e construtores ...

    // FORMA 1: Ataque ao vento (treino) - Sem parâmetros
    public void atacar() {
        System.out.println("O " + nome + " atacou o ar e treinou suas habilidades.");
    }

    // FORMA 2: Ataque ao alvo (combate) - Recebe um Personagem
    // (Este é o que você já fez!)
    public void atacar(Personagem oponente) {
        System.out.println("O " + nome + " atacou " + oponente.getNome() + "!");
        // ... lógica de dano ...
    }

    // FORMA 3: Ataque Especial - Recebe Personagem E um bônus extra
    public void atacar(Personagem oponente, int bonusDeDano) {
        System.out.println(nome + " usou um golpe especial em " + oponente.getNome() + "!");
        // Aqui o dano seria (força + bonusDeDano)
    }
}
```

---

## 🚫 Erro Comum

**O Erro:** Mudar apenas o "retorno" (void, int, String) e manter os parâmetros iguais.

```java
// O Java NÃO aceita isso. Para ele, é duplicidade.
public void atacar() { ... }
public int atacar() { return 10; } // ERRO!
```

**A Regra:** Para ser Sobrecarga, a lista de parâmetros (tipos ou quantidade) TEM que ser diferente.

---
