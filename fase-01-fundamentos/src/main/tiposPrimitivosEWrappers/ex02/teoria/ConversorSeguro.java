package tiposPrimitivosEWrappers.ex02.teoria;

public class ConversorSeguro {

    public int converterSemPerda(long idGigante) {
        // MODO INSEGURO (Antigo):
        // int id = (int) idGigante; 
        // Se idGigante for 3 bilhões, 'id' virará um número negativo aleatório!

        // MODO SEGURO (Java Moderno):
        try {
            // Math.toIntExact lança uma Exception se o número não couber no int
            return Math.toIntExact(idGigante);
        } catch (ArithmeticException e) {
            System.err.println("Erro: O ID " + idGigante + " é grande demais para o sistema legado (int).");
            return -1; // Ou lançar uma custom exception
        }
    }

    public void arredondarPreco(double preco) {
        // Cast simples (TRUNCA):
        int trunca = (int) preco; // 99.99 vira 99
        
        // Math.round (ARREDONDA):
        long arredonda = Math.round(preco); // 99.99 vira 100
        
        System.out.printf("Original: %.2f | Truncado: %d | Arredondado: %d%n", 
            preco, trunca, arredonda);
    }
}