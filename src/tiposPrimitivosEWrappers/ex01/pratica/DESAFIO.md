# 🎯 Desafio: Sistema de Monitoramento de Temperatura de Servidores

## 📋 Cenário

Você precisa desenvolver um sistema de monitoramento de temperatura de servidores.

## 🔴 Problema

Você recebe uma lista de leituras de temperatura de sensores (`List<String> inputs`).

### Desafios a serem tratados:

- ⚠️ **Sensores com falha**: Alguns sensores enviam strings inválidas (ex: `"ERR"`, `"NULL"`, ou vazio)
- 🔥 **Temperaturas críticas**: Alguns sensores enviam temperaturas acima de 90 graus
- 🚫 **Erro de sensor**: Temperaturas acima de 150 devem ser descartadas (impossível para o hardware, erro de leitura)

## 🎯 Sua Missão

Implemente um método que:

1. ✅ Receba a lista bruta de temperaturas
2. 🔄 Converta as strings para números
3. 🛡️ Trate valores nulos/inválidos com segurança
4. 📊 Calcule a média exata das temperaturas válidas
5. 🔢 Se não houver nenhuma leitura válida, retorne `0`

## 💡 Dica

Você precisará misturar **Wrappers** (para o parse) e **Primitivos** (para a soma/média).

## 📝 Estrutura Esperada

```java
public double calcularMedia(List<String> inputs) {
    // Sua implementação aqui
}
```

## ✅ Casos de Teste Sugeridos

```java
List<String> teste1 = List.of("80", "90", "85", "ERR", "100");
List<String> teste2 = List.of("ERR", "NULL", "", "invalid");
List<String> teste3 = List.of("80", "200", "150", "90"); // 200 deve ser descartado
```

## 🎓 Conceitos Aplicados

- Conversão String → Double (Wrapper)
- Tratamento de exceções (`NumberFormatException`)
- Validação de dados
- Cálculos com primitivos
- Autoboxing/Unboxing

