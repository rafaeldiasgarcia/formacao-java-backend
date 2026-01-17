package collections.ex04.pratica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex04 {
    public static void main(String[] args) {

        List<String> linguagens = Arrays.asList("java", "python", "java", "c++", "java", "python");

        Map<String, Integer> contador = new HashMap<>();

        for (String linguagem : linguagens) {
            if (contador.containsKey(linguagem)) {
                contador.put(linguagem, contador.get(linguagem) + 1);
            } else {
                contador.put(linguagem, 1);
            }
        }

        System.out.println(contador);

    }
}
