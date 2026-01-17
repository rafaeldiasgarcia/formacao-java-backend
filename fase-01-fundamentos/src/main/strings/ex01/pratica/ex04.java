package strings.ex01.pratica;

import java.util.Arrays;
import java.util.List;

public class ex04 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Beto", "Carla", "Daniel", "Elena");
        String csv = gerarCSV(nomes);
        System.out.println("CSV: " + csv);
    }

    public static String gerarCSV(List<String> itens) {
        if (itens == null || itens.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itens.size(); i++) {
            sb.append(itens.get(i));
            if (i < itens.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
