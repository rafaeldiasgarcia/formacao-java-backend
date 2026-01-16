package collections.ex03;

import java.util.ArrayList;

public class ex01 {
    public static void main(String[] args) {

        ArrayList<String> listaCompras = new ArrayList<>();

        listaCompras.add("Arroz");
        listaCompras.add("Feijão");
        listaCompras.add("Sabão em pó");
        listaCompras.add("Leite");
        listaCompras.add("Maccarão");

        listaCompras.remove(1);

        System.out.println(listaCompras.size());

        for (String compra : listaCompras) {
            System.out.println(compra);
        }

    }
}
