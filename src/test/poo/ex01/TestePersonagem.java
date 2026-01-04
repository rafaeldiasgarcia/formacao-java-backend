package poo.ex01;

import poo.classeObjetosEConstrutores.ex01.pratica.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Aragorn", 100);
        Personagem oponente = new Personagem("Orc", 30);

        System.out.println("O " + heroi.getNome() + " tem força " + heroi.getForca());
        heroi.atacar(oponente);
    }
}
