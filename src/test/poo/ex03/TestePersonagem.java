package poo.ex03;

import poo.ex03.pratica.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem campones = new Personagem("Camponês");
        System.out.println(campones.getNome());
        System.out.println(campones.getForca());
    }
}
