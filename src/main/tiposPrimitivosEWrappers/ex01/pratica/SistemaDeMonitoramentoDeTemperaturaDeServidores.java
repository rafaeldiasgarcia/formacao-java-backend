package tiposPrimitivosEWrappers.ex01.pratica;

import java.util.List;

public class SistemaDeMonitoramentoDeTemperaturaDeServidores {

    public double calcularMedia(List<String> inputs) {

        double soma = 0;
        int quantidade = 0;

        for (String input : inputs) {

            if (input == null) {
                continue;
            }

            try {

                double valor = Double.parseDouble(input);

                if (valor <= 150) {
                    soma += valor;
                    quantidade++;
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro de leitura: O valor '" + input + "' não é válido.");
            }

        }

        if (quantidade == 0) {
            return 0;
        } else {
            return soma / quantidade;
        }

    }

}
