package collections.ex03;

import java.util.HashSet;

public class ex02 {
    public static void main(String[] args) {

        HashSet<String> convidados = new HashSet<>();

        convidados.add("Ana");
        convidados.add("Bruno");
        convidados.add("Carla");
        convidados.add("Ana");
        convidados.add("Daniel");

        System.out.println(convidados);

        System.out.println(convidados.contains("Carla"));

        convidados.remove("Bruno");

        System.out.println(convidados);

    }
}
