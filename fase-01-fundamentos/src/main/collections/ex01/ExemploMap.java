package collections.ex01;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    static void main() {

        Map<Long, Pessoa> mapa = new HashMap<>(); // Cria um mapa onde a chave é Long e o valor é Pessoa, usando HashMap como implementação
        Pessoa joao = new Pessoa(1L, "Joao"); // Cria uma nova pessoa com id 1 e nome "Joao"

        mapa.put(1L, joao); // Armazena a pessoa 'joao' no mapa usando a chave 1L

        Pessoa joao2 = mapa.get(1L); // Recupera a pessoa do mapa usando a chave 1L e armazena na variável 'joao2'

    }
}
