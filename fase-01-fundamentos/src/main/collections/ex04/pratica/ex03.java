package collections.ex04.pratica;

import java.util.HashMap;
import java.util.Map;

public class ex03 {
    public static void main() {

        Map<String, String> girias = new HashMap<>();

        girias.put("Bug", "Erro ou falha no sistema que causa comportamento inesperado");
        girias.put("Deploy", "Processo de disponibilizar uma aplicação em produção");
        girias.put("Commit", "Registro de alterações no código-fonte em um repositório");

        String termo = "Deploy";
        System.out.println("Definição de " + termo + ": " + girias.get(termo));

    }
}
