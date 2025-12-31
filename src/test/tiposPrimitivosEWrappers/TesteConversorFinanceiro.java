package tiposPrimitivosEWrappers;

import tiposPrimitivosEWrappers.ex03.pratica.ConversorFinanceiro;

import java.util.List;

public class TesteConversorFinanceiro {

    public static void main(String[] args) {
        // 1. Instancia sua classe
        ConversorFinanceiro conversor = new ConversorFinanceiro();

        // 2. Lista de desafios (Certos, Errados e Quebrados)
        List<String> precos = List.of(
                "51.50",    // Esperado: US$ 10.00
                "DINHEIRO", // Esperado: Mensagem de erro (ignorado)
                "10.30",    // Esperado: US$ 2.00
                "100.00"    // Esperado: US$ 19.42 (Teste de arredondamento)
        );

        System.out.println("--- Iniciando Conversão ---");

        // 3. Chama o método (que é void, então só chamamos)
        conversor.converterMoedas(precos);

        System.out.println("--- Fim do Processamento ---");
    }
}
