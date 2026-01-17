package collections.ex02.pratica;

import java.util.HashMap;
import java.util.Map;

public class EstoqueLoja {
    public static void main(String[] args) {

        Map<String, Double> estoque = new HashMap<>();
        estoque.put("Celular", 1500.00);
        estoque.put("Mouse", 50.00);
        estoque.put("Teclado", 120.00);

        System.out.println(estoque.get("Mouse"));

    }
}

