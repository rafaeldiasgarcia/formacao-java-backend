package tiposPrimitivosEWrappers.ex01.teoria;

public class ExemploProjetoJava {

    // Java 21: Records são perfeitos para transportar dados imutáveis
    // Usamos Wrapper (Double) aqui pois o valor pode vir nulo de uma API externa
    public record Transaction(String id, Double amount) {}

    public void processTransaction(Transaction transaction) {
        // Clean Code: Fail Fast (validação logo no início)
        if (transaction.amount() == null) {
            throw new IllegalArgumentException("Valor da transação não pode ser nulo");
        }

        // Unboxing seguro: O compilador converte o Wrapper para primitivo automaticamente
        // Usamos 'double' (primitivo) para o cálculo visando performance
        double finalValue = applyTax(transaction.amount());

        System.out.printf("Transação %s processada: %.2f%n", transaction.id(), finalValue);
    }

    private double applyTax(double value) {
        // Uso de 'var' para inferência de tipo (Java 10+)
        // Literais com underscore (_) facilitam leitura de números grandes
        var taxRate = 0.05;
        var threshold = 10_000.00;

        return value > threshold ? value * (1 + taxRate) : value;
    }

    // Exemplo de uso de métodos estáticos do Wrapper (Parsing seguro)
    public static int parsePort(String portStr) {
        try {
            return Integer.parseInt(portStr);
        } catch (NumberFormatException e) {
            // Retornar um default seguro em vez de explodir o sistema
            return 8080;
        }
    }
}