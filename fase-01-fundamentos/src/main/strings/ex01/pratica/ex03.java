package strings.ex01.pratica;

public class ex03 {
    public static void main(String[] args) {
        String nome = "Maria da Silva Souza";
        String iniciais = extrairIniciais(nome);
        System.out.println("Iniciais de \"" + nome + "\": " + iniciais);
    }

    public static String extrairIniciais(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.isBlank()) return "";

        String[] partes = nomeCompleto.split("\\s+");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.toUpperCase().charAt(0));
            }
        }

        return iniciais.toString();
    }
}
