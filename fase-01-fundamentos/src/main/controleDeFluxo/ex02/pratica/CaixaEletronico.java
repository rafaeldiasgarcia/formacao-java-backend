package controleDeFluxo.ex02.pratica;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao = 0;
        String[] movimentacoes = new String[100];
        int totalMovimentacoes = 0;

        movimentacoes[totalMovimentacoes] = "Saldo inicial: R$ 1000.00";
        totalMovimentacoes++;

        do {
            System.out.println("\n--- BANCO JAVA ---");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Fazer Saque");
            System.out.println("3. Imprimir Extrato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Seu saldo é: R$ " + saldo);
                }
                case 2 -> {
                    System.out.print("Valor do saque: ");
                    double saque = leitor.nextDouble();

                    if (saldo >= saque && saque > 0) {
                        saldo -= saque;

                        movimentacoes[totalMovimentacoes] = "Saque: R$ " + saque + " | Saldo: R$ " + saldo;
                        totalMovimentacoes++;

                        System.out.println("Sucesso");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }

                }
                case 3 -> {
                    System.out.println("Imprimindo extrato...");
                    for (int i = 0; i < totalMovimentacoes; i++) {
                        System.out.println("Movimentação " + (i + 1) + ": " + movimentacoes[i]);
                    }

                }
                case 0 -> System.out.println("Saindo... Volte sempre!");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leitor.close();
    }
}