package controleDeFluxo.ex03.teoria;

public class Diario {
    
    // Atributos (O Estado do Objeto)
    // Eles guardam as informações NA MEMÓRIA enquanto o programa roda
    double[] notas = new double[5];
    int quantidadeNotas = 0;

    // Método 1: Tenta salvar a nota
    // Retorna 'void' porque só faz a ação
    public void salvarNota(double nota) {
        if (quantidadeNotas < notas.length) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
            System.out.println("✅ Nota salva no sistema!");
        } else {
            System.out.println("⛔ Erro: O diário está cheio (Máx: 5 notas).");
        }
    }

    // Método 2: Mostra o que tem guardado
    public void listarNotas() {
        System.out.println("\n--- Relatório de Notas ---");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println((i + 1) + "ª nota: " + notas[i]);
        }
    }

    // Método 3: Faz a matemática
    public void calcularMedia() {
        if (quantidadeNotas == 0) {
            System.out.println("⚠️ Não há notas para calcular.");
            return;
        }

        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }

        double media = soma / quantidadeNotas;
        System.out.printf("📊 Média Geral: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO 🎓");
        } else {
            System.out.println("Status: RECUPERAÇÃO 📚");
        }
    }
}