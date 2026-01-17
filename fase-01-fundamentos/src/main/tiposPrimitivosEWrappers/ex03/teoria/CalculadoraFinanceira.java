package tiposPrimitivosEWrappers.ex03.teoria;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraFinanceira {

    public void calcularJuros() {
        // REGRA DE OURO 1: Sempre use o construtor de STRING
        BigDecimal valor = new BigDecimal("100.00"); // ✅ Correto
        // BigDecimal erro = new BigDecimal(0.1);    // ❌ ERRADO! Já nasce impreciso do double
        
        BigDecimal taxa = new BigDecimal("0.05");

        // REGRA DE OURO 2: BigDecimal é imutável
        // valor.multiply(taxa); // ISSO NÃO FAZ NADA! O resultado é perdido.
        
        BigDecimal juros = valor.multiply(taxa); // ✅ Capturamos o retorno
        BigDecimal total = valor.add(juros);

        System.out.println("Total: " + total);
    }

    public BigDecimal dividirConta(BigDecimal total, int pessoas) {
        // REGRA DE OURO 3: Divisão exige estratégia de arredondamento
        // Se dividir 10 por 3 sem arredondar, o Java lança Exception (Dízima periódica infinita)
        
        return total.divide(new BigDecimal(pessoas), 2, RoundingMode.HALF_EVEN);
        // HALF_EVEN (Arredondamento Bancário) é o padrão estatístico mais justo.
    }
}