package poo.classeObjetosEConstrutores.ex05.pratica;

public class Personagem {
    private String nome;
    private int forca;
    private int bonusDeForca;

    public static int totalDePersonagens = 0;

    public Personagem(String nomePersonagem, int forcaPersonagem) {
        this.nome = nomePersonagem;
        this.forca = forcaPersonagem;
        totalDePersonagens++;
    }

    public Personagem(String nomePersonagem) {
        this.nome = nomePersonagem;
        this.forca = 50;
        totalDePersonagens++;
    }

    public void atacar() {
        System.out.printf("O %s está esperando... mas não atacou ninguém.", getNome());
    }

    public void atacar(Personagem oponente, int bonusDeDano) {
        System.out.printf("%s usou um golpe special em %s", getNome(), oponente.getNome());
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

    public void setForca(int novaForca) {
        if (novaForca >= 0) {
            this.forca = novaForca;
        } else {
            System.out.println("Erro: A força não pode ser negativa!");
        }
    }
}