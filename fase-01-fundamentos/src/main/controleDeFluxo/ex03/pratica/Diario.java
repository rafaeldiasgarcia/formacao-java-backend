package controleDeFluxo.ex03.pratica;

import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        double nota;
        int quantidadeNotas = 0;
        double[] diario = new double[5];

        do {
            System.out.print(
                    "\n--- DIÁRIO UNIFIO ---\n" +
                    "1. Adicionar Notas\n" +
                    "2. Listar Notas\n" +
                    "3. Calcular Média Geral\n" +
                    "0. Sair\n\n" +
                    "Opção: "
            );

            escolha = sc.nextInt();

            if (escolha > 3 || escolha < 0) {
                System.out.println("\nEsntrada invalida, tente novamente.\n");
            }

            switch (escolha) {
                case 1 -> {
                    System.out.print("\nDigite a nota: ");

                    nota = sc.nextDouble();

                    if (quantidadeNotas < diario.length) {
                        while (nota < 0.0 || nota > 10.0) {
                            System.out.println("Valor invalido! Digite entre 0 e 10: ");

                            nota = sc.nextDouble();
                        }

                        diario[quantidadeNotas] = nota;

                        quantidadeNotas++;

                        System.out.println("\nNota Adcicionada!\n\n");
                    } else {
                        System.out.println("\nErro: Diário lotado! Não é possivel adicionar mais notas.");
                    }
                }

                case 2 -> {
                    System.out.println("\nNotas registradas:");
                    for (int i = 0; i < quantidadeNotas; i++) {
                        System.out.println(i + 1 + "° nota: " + diario[i]);
                    }
                }

                case 3 -> {
                    if (quantidadeNotas == 0) {
                        System.out.println("Não há notas cadastradas para calcular a média!");
                    } else {
                        double somaNotas = 0;
                        for(int i = 0; i < quantidadeNotas; i++){
                            somaNotas += diario[i];
                        }
                        double media = somaNotas / quantidadeNotas;
                        System.out.println("\nMédia geral: " + media);
                        if (media >= 7) {
                            System.out.println("Status: Aprovado");
                        } else {
                            System.out.println("Status: Recuperação");
                        }
                    }
                }
            }
        } while (escolha != 0);

    }
}