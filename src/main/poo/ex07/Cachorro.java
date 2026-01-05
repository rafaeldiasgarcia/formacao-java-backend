package poo.ex07;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade); // Chama o construtor da classe pai (Animal)
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    // Método específico apenas do cachorro
    public void correr() {
        System.out.println(getNome() + " está correndo atrás da bola!");
    }
}