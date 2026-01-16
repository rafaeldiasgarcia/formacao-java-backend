# Desafio: Caixa Eletrônico Simples

## Cenário

Vamos criar um menu de banco. Como é um menu, ele precisa aparecer pelo menos uma vez para o usuário escolher, certo? Por isso usaremos do-while.

## Objetivo

Completar o código do Caixa Eletrônico.

## Requisitos do Código

### Menu Principal (do-while)
O menu deve continuar aparecendo até o usuário escolher a opção "0" (Sair).

### Opções (switch)

**1. Ver Saldo:** Mostra o saldo.

**2. Saque (if/else):** Só permite sacar se o valor do saque for menor ou igual ao saldo. Se não, avisa "Saldo Insuficiente".

**3. Imprimir Extrato (for):** Imprime uma lista fictícia de "Últimas 3 movimentações".

**0. Sair:** Encerra o programa.

## Input (Entrada)

O código usará o Scanner para você digitar os números no console.

## Código Base

Copie e complete onde está comentado:

```java
package controleDeFluxo.ex02;

import java.util.Scanner; // Importando o "leitor" de teclado

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao = 0;

        // DO-WHILE: Executa o bloco e DEPOIS verifica se continua
        do {
            System.out.println("\n--- BANCO JAVA ---");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Fazer Saque");
            System.out.println("3. Imprimir Extrato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt(); // Lê o número que você digitar

            // SWITCH: Para decidir qual opção rodar
            switch (opcao) {
                case 1 -> {
                    System.out.println("Seu saldo é: R$ " + saldo);
                }
                case 2 -> {
                    System.out.print("Valor do saque: ");
                    double saque = leitor.nextDouble();

                    // --- DESAFIO 1: IF / ELSE ---
                    // Escreva a lógica: Se o saldo for maior ou igual ao saque,
                    // subtraia do saldo e avise "Sucesso".
                    // Senão, avise "Saldo Insuficiente".
                    
                    // ESCREVA SEU IF AQUI:

                }
                case 3 -> {
                    System.out.println("Imprimindo extrato...");
                    // --- DESAFIO 2: FOR ---
                    // Faça um loop que rode 3 vezes
                    // Imprimindo: "Movimentação antiga [i]"
                    
                    // ESCREVA SEU FOR AQUI:

                }
                case 0 -> System.out.println("Saindo... Volte sempre!");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // Repete ENQUANTO a opção for diferente de 0

        leitor.close();
    }
}
```

## Dicas para Resolver

- **No If/Else:** Lembre-se que para atualizar uma variável você faz `saldo = saldo - saque;`.
- **No For:** Você quer contar de 1 até 3. Use `i <= 3`.
- **Execução:** Ao rodar, clique no console (na parte de baixo da tela) para digitar os números.
