package tiposPrimitivosEWrappers.test;

public class TestePedidos {

    public static void main(String[] args) {
        // --- Cenários de Teste ---

        // Cenário 1: Null (Deve dar TRUE/Válido, pois assumimos 0)
        System.out.println("Teste 1 (Enviando null): " + isPedidoValido(null));

        // Cenário 2: Valor Positivo (Deve dar TRUE)
        System.out.println("Teste 2 (Enviando 50):   " + isPedidoValido(50));

        // Cenário 3: Valor Zero (Deve dar TRUE)
        System.out.println("Teste 3 (Enviando 0):    " + isPedidoValido(0));

        // Cenário 4: Valor Negativo (Deve dar FALSE)
        System.out.println("Teste 4 (Enviando -10):  " + isPedidoValido(-10));
    }

    // Seu método (adicionei 'static' apenas para rodar direto na main sem instanciar a classe)
    public static boolean isPedidoValido(Integer quantidade) {
        // 1. Fail-safe para null (Regra: null vale 0, e 0 é válido)
        if (quantidade == null) {
            return true; 
        }

        // 2. Unboxing seguro: Só ocorre porque já garantimos que não é null
        return quantidade >= 0;
    }
}