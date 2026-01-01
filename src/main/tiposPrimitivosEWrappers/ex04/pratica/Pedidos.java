package tiposPrimitivosEWrappers.ex04.pratica;

public class Pedidos {

    public boolean isPedidoValido(Integer quantidade) {
        if (quantidade == null) {
            return true;
        }

        return quantidade >= 0;
    }

}
