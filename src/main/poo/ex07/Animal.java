package poo.ex07;

public class Animal {
    // Atributos privados (Encapsulamento)
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método genérico que será sobrescrito
    public void emitirSom() {
        System.out.println("O animal fez um som genérico.");
    }

    // Getter para podermos acessar o nome no Veterinário
    public String getNome() {
        return nome;
    }
}