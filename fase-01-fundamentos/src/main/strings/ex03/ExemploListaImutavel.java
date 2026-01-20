package strings.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploListaImutavel {

    public static void main(String[] args) {

        List<String> listaImutavel = Collections.unmodifiableList(new ArrayList<String>());

    }

}
