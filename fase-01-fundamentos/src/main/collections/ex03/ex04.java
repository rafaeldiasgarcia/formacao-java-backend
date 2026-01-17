package collections.ex03;

import java.util.ArrayList;
import java.util.Random;

public class ex04 {
    public static void main(String[] args) {

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();

        Random random = new Random();

        // Adiciona 10 números aleatórios de 0 a 20
        for (int i = 0; i < 10; i++) {
            numerosAleatorios.add(random.nextInt(21));
        }

        System.out.println(numerosAleatorios);

        ArrayList<Integer> maioresQueDez = new ArrayList<>();

        for (Integer numero : numerosAleatorios) {
            if (numero > 10) {
                maioresQueDez.add(numero);
            }
        }

        System.out.println(maioresQueDez);

    }
}
