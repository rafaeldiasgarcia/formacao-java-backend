package collections.ex01;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    static void main() {

        Set<Pessoa> pessoas = new HashSet<>(); // Cria um conjunto de objetos Pessoa usando HashSet como implementação
        Pessoa joao = new Pessoa(1L, "João"); // Cria uma nova pessoa com id 1 e nome "João"
        pessoas.add(joao); // Adiciona a pessoa 'joao' ao conjunto

        for (Pessoa pessoa : pessoas) { // Itera sobre cada pessoa no conjunto usando for-each
            System.out.println(pessoa.getNome()); // Imprime o nome da pessoa atual no console
        }

        System.out.println("-------------");
        boolean adicionou = pessoas.add(new Pessoa(1L, "João")); // Tenta adicionar uma nova pessoa com os mesmos dados (Set usa equals/hashCode para verificar duplicatas)

        if (adicionou) { // Verifica se a pessoa foi adicionada com sucesso
            System.out.println("adiciounou "); // Imprime mensagem se foi adicionada
        } else {
            System.out.println("Não adicionou "); // Imprime mensagem informando que não foi adicionada (porque já existe uma pessoa igual)
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }
}
