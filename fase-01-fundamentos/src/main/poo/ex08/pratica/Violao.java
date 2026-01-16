package poo.ex08.pratica;

public class Violao extends Instrumento implements Afinavel {

    Violao (String marca) {
        super(marca);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o violão " + marca);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o violão...");
        System.out.println("O violão " + marca + " está afinado!");
    }

}
