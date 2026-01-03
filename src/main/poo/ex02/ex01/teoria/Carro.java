package poo.ex02.ex01.teoria;

// 1. Definição da CLASSE (O Molde)
// O nome da classe geralmente começa com Letra Maiúscula
public class Carro {

    // ATRIBUTOS (Características do carro)
    String modelo;
    String cor;
    int ano;

    // 2. CONSTRUTOR (A inicialização)
    // O Construtor TEM QUE ter o MESMO nome da classe.
    // Ele roda automaticamente quando usamos o "new".
    public Carro(String modeloInicial, String corInicial, int anoInicial) {
        // "this.modelo" refere-se ao atributo da classe lá em cima.
        // "modeloInicial" é o dado que chegou "de fora" (parâmetro).
        this.modelo = modeloInicial;
        this.cor = corInicial;
        this.ano = anoInicial;
    }

    // Um método simples (uma ação que o carro faz)
    void buzinar() {
        System.out.println("O " + modelo + " fez: Bi bi!");
    }
}