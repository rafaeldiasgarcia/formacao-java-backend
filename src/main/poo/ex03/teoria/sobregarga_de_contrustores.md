# 🍕 Sobrecarga de Construtores: A Analogia da Pizzaria

## 🎯 Analogia

Imagine que você vai pedir uma pizza.

**Opção 1 (Completa):** Você diz tudo: "Quero uma pizza Grande, de Calabresa, com Borda Recheada".

**Opção 2 (Rápida):** Você diz apenas: "Quero uma de Calabresa". A pizzaria entende que, se você não falou o tamanho, o padrão é "Média" e sem borda.

Na programação, a **Sobrecarga** permite que você tenha mais de uma maneira de criar o mesmo objeto (pedir a pizza), dependendo de quantas informações você quer passar na hora.

---

## 💡 Para Que Serve?

Serve para dar flexibilidade.

No seu jogo, talvez você queira criar um "Aragorn" super personalizado (Nome e Força definidos). Mas para os inimigos comuns, talvez você queira criar um "Orc" rapidamente, sem ter que ficar decidindo a força de cada um, assumindo uma força padrão automaticamente.

---

## 💻 Como Se Escreve (Sintaxe)

Você simplesmente cria outro Construtor dentro da mesma classe, mas com parâmetros diferentes.

```java
public class Personagem {
    private String nome;
    private int forca;

    // Construtor 1: Exige TUDO (o que você já tem)
    public Personagem(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    // Construtor 2: Exige só o NOME (Sobrecarga)
    // Ele define uma força padrão (ex: 50) automaticamente
    public Personagem(String nome) {
        this.nome = nome;
        this.forca = 50; // Valor padrão para quem não especificou
    }

    // ... restos dos métodos ...
}
```

---

## 🚫 Erro Comum

**O Erro:** Tentar criar dois construtores que recebem exatamente o mesmo tipo de dado. O Java se confunde e não sabe qual usar.

```java
// ERRO! O Java não sabe diferenciar só pelo nome da variável
public Personagem(String nome) { ... }
public Personagem(String apelido) { ... } // Conflito! Ambos recebem 1 String.
```

**A Correção:** Os construtores precisam ter uma "assinatura" diferente (quantidade ou tipos de variáveis diferentes).
