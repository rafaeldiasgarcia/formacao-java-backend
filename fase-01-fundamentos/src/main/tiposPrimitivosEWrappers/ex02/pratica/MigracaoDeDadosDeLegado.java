package tiposPrimitivosEWrappers.ex02.pratica;

public class MigracaoDeDadosDeLegado {

    public void processarDados(long[] ids, double[] notas) {

        if (ids.length != notas.length) {
            System.out.println("Erro: Listas de tamanhos diferentes. Processamento abortado.");
            return;
        }

        for (int i = 0; i < ids.length; i++) {
            long idAtual = ids[i];
            double notaAtual = notas[i];

            try {

                int idConvertido = Math.toIntExact(idAtual);

                int notaConvertida = (int) Math.round(notaAtual);

                System.out.println("ID: " + idConvertido + " | Nota: " + notaConvertida);

            } catch (ArithmeticException e) {
                System.out.println("ID " + idAtual + " ignorado: Overflow");
            }
        }
    }
}