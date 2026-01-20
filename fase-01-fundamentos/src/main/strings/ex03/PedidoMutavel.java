package strings.ex03;

public final class PedidoMutavel {

    private final String status;

    public PedidoMutavel(String status) {
        this.status = status;
    }

    public Pedido atualizarStatus(String novoStatus) {
        return new Pedido(novoStatus);
    }

    public String getStatus() {
        return status;
    }
}
