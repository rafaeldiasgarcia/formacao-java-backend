import tiposPrimitivosEWrappers.ex02.pratica.MigracaoDeDadosDeLegado;

public static void main(String[] args) {
    MigracaoDeDadosDeLegado sistema = new MigracaoDeDadosDeLegado();

    // IDs: um normal, um gigante (overflow), outro normal
    long[] ids = { 101, 9999999999L, 102 };

    // Notas: 9.6 (vira 10), 5.2 (vira 5), 8.5 (vira 9)
    double[] notas = { 9.6, 5.0, 8.5 };

    sistema.processarDados(ids, notas);
}