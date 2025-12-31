import main.java.tiposPrimitivosEWrappers.pratica.SistemaDeMunitoriamentoDeTemperaturaDeServidores;

import java.util.List;

public static void main(String[] args) {
    // 1. Instancia sua classe
    SistemaDeMunitoriamentoDeTemperaturaDeServidores sistema = new SistemaDeMunitoriamentoDeTemperaturaDeServidores();

    // 2. Cria uma lista fake com testes (Válido, Erro, Nulo, Extremo)
    // Nota: Se der erro no List.of, troque por java.util.Arrays.asList(...)
    List<String> dados = java.util.List.of("20.0", "ERR", "NULL", "30.0", "200.0", "10.0");

    // 3. Chama o metodo
    double resultado = sistema.calcularMedia(dados);

    // 4. Mostra o resultado
    // Esperado: (20 + 30 + 10) / 3 = 20.0 (O 200 é ignorado, ERR/NULL também)
    System.out.println("A média é: " + resultado);
}