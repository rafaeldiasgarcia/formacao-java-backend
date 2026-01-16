package collections.ex02.teoria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class AulaCollections {
    public static void main(String[] args) {

        // 1. LIST (Permite repetidos e tem índice 0, 1, 2...)
        // Lemos: "Uma Lista de Strings chamada frutas é um novo ArrayList"
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Maçã"); // Pode repetir!
        System.out.println("Lista: " + frutas.get(0)); // Pega pelo índice

        // 2. SET (Não permite repetidos)
        Set<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(10);
        numerosUnicos.add(20);
        numerosUnicos.add(10); // Esse comando é ignorado pelo Java
        // System.out.println(numerosUnicos.get(0)); // ERRO! Set não tem índice fixo assim.

        // 3. MAP (Chave -> Valor)
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("Java", "Linguagem de programação"); // .put em vez de .add
        dicionario.put("Bug", "Erro no código");
        
        System.out.println(dicionario.get("Java")); // Busca pela CHAVE, imprime o VALOR
    }
}