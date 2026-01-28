package poo.test.ex04;

import poo.ex04.pratica.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Heroi", 100);
        Personagem oponente = new Personagem("Orc", 50);

        heroi.atacar();
        heroi.atacar(oponente);
        heroi.atacar(oponente, 10);
    }
}
