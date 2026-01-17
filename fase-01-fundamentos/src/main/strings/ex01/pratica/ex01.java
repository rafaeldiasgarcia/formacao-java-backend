package strings.ex01.pratica;

public class ex01 {
    public static void main(String[] args) {
        String nomeSujo = "  joao silva  ";
        String nomeLimpo = formatarNome(nomeSujo);
        System.out.println("Nome formatado: \"" + nomeLimpo + "\"");
    }

    public static String formatarNome(String nome) {
        if (nome == null) return null;
        return nome.trim().toUpperCase();
    }
}
