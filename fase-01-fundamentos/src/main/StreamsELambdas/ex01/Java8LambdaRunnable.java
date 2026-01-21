package StreamsELambdas.ex01;

public class Java8LambdaRunnable {
    public static void main(String[] args) {

        //JAVA 8: FUNÇÕES LAMBDA

        new Thread(new Runnable() { //*até o java 7
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();

        new Thread(() -> System.out.println("Olá mundo!")).run(); //java 8, mesma coisa do de cima

    }
}
