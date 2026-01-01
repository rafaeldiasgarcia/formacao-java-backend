# 📋 Analogia: Formulários e Envelopes

## 🎯 Analogia

Imagine que você está preenchendo um formulário em papel:

### 📝 Tipos Primitivos (int, double, boolean…)

São como valores escritos diretamente no papel. Simples, rápidos e sem contexto extra.

---

### 📨 Wrappers (Integer, Double, Boolean…)

São como um envelope com etiqueta, onde além do valor você tem metadados e comportamentos (métodos).

---

## 🧠 Como o Java gerencia isso (JVM / Memória)

### Primitivos

- Armazenados diretamente na stack (ou embutidos em objetos).
- Não são objetos.
- Acesso extremamente rápido.

### Wrappers

- São objetos, vivem no heap.
- Possuem métodos (parseInt, compareTo, etc.).
- Envolvem um custo maior de memória e CPU.

---

## ⚡ Autoboxing / Unboxing

A JVM converte automaticamente:

```java
Integer x = 10; // autoboxing
int y = x;      // unboxing
```

Conveniente, porém perigoso se mal usado.