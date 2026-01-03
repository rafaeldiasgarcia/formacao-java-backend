package poo.ex02.pratica;

public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Aragorn", 100);
        Personagem oponente = new Personagem("Orc", 30);

        System.out.println("O " + heroi.getNome() + " tem força " + heroi.getForca());
        heroi.atacar(oponente);
        heroi.setForca(99999);
    }
}
