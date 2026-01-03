package poo.ex02.ex01.teoria;

public class Garagem {
    public static void main(String[] args) {
        // 3. Criando OBJETOS (Usando o molde)
        // Tipo  Nome      Comando mágico   Construtor enviando dados
        Carro   meuCarro = new              Carro("Fusca", "Azul", 1980);
        
        Carro   seuCarro = new              Carro("Ferrari", "Vermelha", 2024);

        // Acessando os dados
        System.out.println("Meu carro é um " + meuCarro.modelo);
        
        // Fazendo o objeto agir
        meuCarro.buzinar(); // Sai: O Fusca fez: Bi bi!
        seuCarro.buzinar(); // Sai: O Ferrari fez: Bi bi!
    }
}