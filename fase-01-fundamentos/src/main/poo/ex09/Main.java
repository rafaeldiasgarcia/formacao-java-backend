package poo.ex09;

import poo.ex09.DBZ.model.Goku;
import poo.ex09.DBZ.model.PersoangemDBZ;
import poo.ex09.DBZ.model.Vegetta;

public class Main {
    public static void main(String[] args) {

        PersoangemDBZ[] persoangemDBZS = new PersoangemDBZ[2];

        persoangemDBZS[0] = new Goku();
        persoangemDBZS[0].nome = "Goku";
        persoangemDBZS[0].poderDeLuta = 9000;

        persoangemDBZS[1] = new Vegetta();
        persoangemDBZS[1].nome = "Vegetta";
        persoangemDBZS[1].poderDeLuta = 3000;

        for (PersoangemDBZ persoangemDBZ : persoangemDBZS) {
            persoangemDBZ.transformar();
            persoangemDBZ.lutar();
        }

//        Goku goku = new Goku();
//        goku.nome = "Goku";
//        goku.poderDeLuta = 9000;
//        goku.lutar();
//        goku.kamehameha();
//        goku.transformar();
//
//        Vegetta vegetta = new Vegetta();
//        vegetta.nome = "Vegetta";
//        vegetta.poderDeLuta = 8500;
//        vegetta.lutar();
//        vegetta.finalFlash();
//        vegetta.transformar();

    }
}
