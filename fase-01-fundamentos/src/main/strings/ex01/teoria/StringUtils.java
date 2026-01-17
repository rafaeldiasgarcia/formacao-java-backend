package strings.ex01.teoria;

public class StringUtils {

    // Cenário: Precisamos logar o CPF do usuário, mas por segurança,
    // devemos mostrar apenas os primeiros 3 e os últimos 2 dígitos.
    public static String mascararCpf(String cpfOriginal) {
        if (cpfOriginal == null || cpfOriginal.length() < 11) {
            return "CPF_INVALIDO";
        }

        // Limpeza básica: removemos traços e pontos caso venham
        // OBS: replace() não muda o original, ele retorna uma NOVA string
        String cpfLimpo = cpfOriginal.replace(".", "").replace("-", "");

        // Extração de partes
        String prefixo = cpfLimpo.substring(0, 3); // Pega os 3 primeiros
        String sufixo = cpfLimpo.substring(cpfLimpo.length() - 2); // Pega os 2 últimos

        // Usando StringBuilder para construir o resultado final de forma eficiente
        StringBuilder sb = new StringBuilder();
        sb.append(prefixo);
        sb.append("******"); // A máscara
        sb.append(sufixo);

        return sb.toString(); // Transforma o "Quadro Branco" em um "Contrato Final"
    }

    public static void main(String[] args) {
        String cpfCliente = "123.456.789-00";
        String cpfLog = mascararCpf(cpfCliente);
        
        System.out.println("Original (Intacto): " + cpfCliente);
        System.out.println("Para Log: " + cpfLog);
    }
}