package tiposPrimitivosEWrappers.ex04.teoria;

public final class Produto {

    private final String nome;
    private final Integer estoque; // pode vir null do banco
    private final int estoqueMinimo; // regra interna

    public Produto(String nome, Integer estoque, int estoqueMinimo) {
        this.nome = nome;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    public boolean precisaReposicao() {
        int estoqueAtual = estoque != null ? estoque : 0; // unboxing controlado
        return estoqueAtual < estoqueMinimo;
    }
}
