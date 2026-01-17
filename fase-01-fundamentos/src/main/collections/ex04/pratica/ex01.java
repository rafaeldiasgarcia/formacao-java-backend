package collections.ex04.pratica;

import java.util.ArrayList;

public class ex01 {
    public static void main() {

        ArrayList<String> todo = new ArrayList<>();

        todo.add("Fazer almoço");
        todo.add("Passear com cachorros");
        todo.add("Fechar loja");

        todo.remove(1);

        System.out.println(todo);

    }
}
