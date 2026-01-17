package collections.ex03;

import java.util.HashMap;

public class ex03 {
    public static void main(String[] args) {

        HashMap<String, Double> tabelaPrecos = new HashMap<>();

        tabelaPrecos.put("Caderno", 2.00);
        tabelaPrecos.put("Borracha", 1.00);
        tabelaPrecos.put("Caneta", 0.50);

        System.out.println(tabelaPrecos);

        System.out.println(tabelaPrecos.get("Caneta"));

        tabelaPrecos.put("Caderno", 18.00);
        tabelaPrecos.remove("Borracha");

        System.out.println(tabelaPrecos);

    }
}
