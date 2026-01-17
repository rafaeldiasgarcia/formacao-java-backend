package strings.ex01.pratica;

import java.util.Arrays;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        String frase = "Ganhe uma oferta imperdível hoje!";
        List<String> proibidas = Arrays.asList("venda", "oferta", "grátis");

        boolean ehSpam = detectarSpam(frase, proibidas);
        System.out.println("É spam? " + ehSpam);
    }

    public static boolean detectarSpam(String frase, List<String> palavrasProibidas) {
        if (frase == null || palavrasProibidas == null) return false;

        String fraseMiniscula = frase.toLowerCase();
        for (String palavra : palavrasProibidas) {
            if (fraseMiniscula.contains(palavra.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
