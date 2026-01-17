package strings.ex01.pratica;

public class ex05 {
    public static void main(String[] args) {
        String texto = "Ame o poema";
        boolean ehPalindromo = verificarPalindromo(texto);
        System.out.println("\"" + texto + "\" é palíndromo? " + ehPalindromo);
    }

    public static boolean verificarPalindromo(String texto) {
        if (texto == null) return false;

        String limpo = texto.replace(" ", "").toLowerCase();
        String invertido = new StringBuilder(limpo).reverse().toString();

        return limpo.equals(invertido);
    }
}
