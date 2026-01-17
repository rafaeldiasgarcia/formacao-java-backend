package controleDeFluxo.ex03.teoria;

import java.util.Scanner;
import java.util.Locale;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // --- A MÁGICA ACONTECE AQUI ---
        // Estamos criando (instanciando) um objeto do tipo Diario
        // Agora a variável 'meuDiario' tem todos os poderes daquele outro arquivo!
        Diario meuDiario = new Diario(); 

        int escolha;

        do {
            System.out.print(
                "\n--- MENU PRINCIPAL ---\n" +
                "1. Adicionar Nota\n" +
                "2. Ver Relatório\n" +
                "3. Ver Resultado Final\n" +
                "0. Sair\n" +
                "Opção: "
            );
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> {
                    // O 'Main' cuida da validação chata (0 a 10)
                    System.out.print("Digite a nota (0-10): ");
                    double valor = sc.nextDouble();

                    while (valor < 0 || valor > 10) {
                        System.out.print("Inválido! Digite entre 0 e 10: ");
                        valor = sc.nextDouble();
                    }

                    // Depois que está validado, entregamos para o especialista
                    meuDiario.salvarNota(valor);
                }
                case 2 -> meuDiario.listarNotas(); // Chama o método do outro arquivo
                case 3 -> meuDiario.calcularMedia(); // Chama o método do outro arquivo
                case 0 -> System.out.println("Fechando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (escolha != 0);

        sc.close();
    }
}