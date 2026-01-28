package poo.test.ex05;

import poo.ex05.pratica.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Heroi", 100);
        Personagem oponente = new Personagem("Orc", 50);

        System.out.println(Personagem.totalDePersonagens);
    }
}
