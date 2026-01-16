package poo.ex08.pratica;

abstract class Instrumento {
    String marca;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    abstract void tocar();

}
