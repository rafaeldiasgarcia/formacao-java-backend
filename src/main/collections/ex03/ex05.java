package collections.ex03;

import java.util.HashMap;

public class ex05 {
    public static void main(String[] args) {

        HashMap<String, String> dicionario = new HashMap<>();

        dicionario.put("Apple", "Maça");
        dicionario.put("Dog", "Cachorro");
        dicionario.put("Computer", "Computador");

        mostrarTraducao(dicionario, "Apple");

        mostrarTraducao(dicionario, "Car");
    }

    public static void mostrarTraducao(HashMap<String, String> dicionario, String chave) {
        String valor = dicionario.get(chave);

        if (valor == null) {
            System.out.println("Palavra não encontrada no dicionário.");
        } else {
            System.out.println("Tradução: " + valor);
        }
    }
}
