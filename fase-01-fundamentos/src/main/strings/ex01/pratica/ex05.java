package strings.ex01.pratica;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma frase: ");

        String texto = sc.nextLine();
        boolean ehPalindromo = verificarPalindromo(texto);
        System.out.println("\"" + texto + "\" é um palíndromo? " + ehPalindromo);
    }

    public static boolean verificarPalindromo(String texto) {
        if (texto == null) return false;

        String limpo = texto.replace(" ", "").toLowerCase();
        String invertido = new StringBuilder(limpo).reverse().toString();

        return limpo.equals(invertido);
    }
}
