package collections.ex04.pratica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex05 {
    public static void main() {

        Map<String, List<Double>> alunosNotas = new HashMap<>();

        alunosNotas.put("João", Arrays.asList(8.0, 9.0));
        alunosNotas.put("Maria", Arrays.asList(10.0, 9.5));

        for (Map.Entry<String, List<Double>> entry : alunosNotas.entrySet()) {
            String aluno = entry.getKey();
            List<Double> notas = entry.getValue();

            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();

            System.out.println("Aluno: " + aluno + " | Média: " + media);

        }
    }
}
