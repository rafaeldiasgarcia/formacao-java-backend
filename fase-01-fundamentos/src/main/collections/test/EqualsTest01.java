package collections.test;

import collections.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//       String nome = "Rafael Dias Garcia";
//       String nome2 = new String("Rafael Dias Garcia");
//       System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        // Smartphone s2 = s1;
        System.out.println(s1.equals(s2)); // false


    }
}
