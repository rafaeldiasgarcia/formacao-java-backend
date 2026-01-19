package strings.ex02;

import java.util.Scanner;

public class YodaSpeak {

    public static String falarComoYoda(String frase) {

        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            resultado.append(palavras[i]);
            if (i != 0) {
                resultado.append(" ");
            }
        }

        return resultado.toString();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma frase: ");
        String frase = sc.nextLine();
        System.out.println(falarComoYoda(frase));

    }
}
