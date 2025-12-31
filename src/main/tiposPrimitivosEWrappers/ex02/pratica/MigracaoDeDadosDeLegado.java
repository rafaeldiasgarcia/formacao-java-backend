package tiposPrimitivosEWrappers.ex02.pratica;

public class MigracaoDeDadosDeLegado {

    public void processarDados(long[] ids, double[] notas) {

        for (int i = 0; i < ids.length; i++) {

            long idAtual = ids[i];
            double notaAtual = notas[i];

            if (idAtual > Integer.MAX_VALUE) {
                System.out.println("ID " + idAtual + " ignorado: Overflow");
                continue;
            }

            int idConvertido = (int) idAtual;
            int notaConvertida = (int) Math.round(notaAtual);

            System.out.println("ID: " + idConvertido + " | Nota: " + notaConvertida);

        }

    }

}
