package poo.ex09.DBZ.model;

public class Vegetta extends PersoangemDBZ {

    @Override
    public void transformar() {
        super.transformar();
        System.out.println(nome + " Goku se transformou em super saiyajin e disse: EU SOU O PRINCEPE DOS SAIYAJINS!");
    }

    public void finalFlash() {
        System.out.println(nome + " lançou um Final Flash!");
    }

}
