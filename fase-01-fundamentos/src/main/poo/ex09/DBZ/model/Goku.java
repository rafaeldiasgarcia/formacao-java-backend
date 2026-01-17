package poo.ex09.DBZ.model;

public class Goku extends PersoangemDBZ {

    @Override
    public void transformar() {
        System.out.println(nome + " Goku se transformou em super saiyajin!");
    }

    public void kamehameha() {
        System.out.println(nome + " lançou um KAMEHAMEHA!");
    }

}
