package poo.ex07;

public class Pato extends Animal {

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack!");
    }
}