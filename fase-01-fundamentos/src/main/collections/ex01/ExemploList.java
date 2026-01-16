package collections.ex01;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    static void main() {

        List<Pessoa> pessoas = new ArrayList<>(); // Cria uma lista de objetos Pessoa usando ArrayList como implementação
        pessoas.add(new Pessoa(1L, "João")); // Adiciona uma nova pessoa com id 1 e nome "João" na lista
        Pessoa a = pessoas.get(0); // Recupera o primeiro elemento da lista (índice 0) e armazena na variável 'a'

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("-------------");
        pessoas.add(a); // Adiciona novamente a mesma pessoa 'a' na lista (List permite duplicatas)

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome()); // Imprime o nome de cada pessoa (agora "João" aparecerá duas vezes)
        }

    }
}
