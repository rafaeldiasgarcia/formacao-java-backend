package poo.test.ex06;

import poo.ex06.pratica.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Heroi", 100);
        Personagem oponente = new Personagem("Orc", 50);

        System.out.println(heroi);
        System.out.println(oponente);
    }
}