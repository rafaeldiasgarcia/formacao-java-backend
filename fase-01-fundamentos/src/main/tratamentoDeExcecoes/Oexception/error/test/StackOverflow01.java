package tratamentoDeExcecoes.Oexception.error.test;

public class StackOverflow01 {
    public static void main(String[] args) {

        recursividade();

    }

    public static void recursividade() {
        recursividade();
    }
}
