package tiposPrimitivosEWrappers.ex03.pratica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ConversorFinanceiro {

    private static final BigDecimal TAXA = new BigDecimal("5.15");

    public void converterMoedas(List<String> precosBRL) {

        for (String precoString : precosBRL) {

            try {

                BigDecimal valorReais = new BigDecimal(precoString);
                BigDecimal valorDolar = valorReais.divide(TAXA, 2, RoundingMode.HALF_EVEN);

                System.out.println("R$ " + valorReais + " = US$ " + valorDolar);

            } catch (NumberFormatException e ) {
                System.out.println("Valor inválido ignorado: " + precoString);
            }

        }

    }

}
