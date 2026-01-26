package tratamentoDeExcecoes.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        System.out.println(divisao(1, 0));

    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int divisao(int a, int b) {

        if (b == 0) {
//            throw new RuntimeException("Argumento ilegal, não pode ser 0.");
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0.");
        }

        return a/b;

//        try {
//
//            return a / b;
//
//        } catch (ArithmeticException e) {
//
//            e.printStackTrace();
//
//        }
//
//        return 0;
    }
}
