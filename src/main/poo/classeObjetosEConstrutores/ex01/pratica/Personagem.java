package poo.classeObjetosEConstrutores.ex01.pratica;

public class Personagem {
    private String nome;
    private int forca;

    public Personagem(String nomePersonagem, int forcaPersonagem) {
        this.nome = nomePersonagem;
        this.forca = forcaPersonagem;
    }

    public void atacar(Personagem oponente) {
        System.out.println("Força de " + nome + ": " + forca +
                           "\nForça de " + oponente.nome + ": " + oponente.forca);
        if (forca > 0 || oponente.forca > 0) {
            if (forca > oponente.forca) {
                System.out.println("O " + nome + " deu 10 de dano ao " + oponente.nome + "!");
                oponente.forca -= 10;
            } else if (forca < oponente.forca) {
                System.out.println("O " +oponente.nome + " deu 5 de dano ao " + nome + "!");
                forca -= 5;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }
}