package poo.ex07;

public class Main {
    public static void main(String[] args) {
        // Instanciando os animais
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);
        Pato pato = new Pato("Donald", 2);

        // Instanciando o veterinário
        Veterinario vet = new Veterinario();

        // O veterinário examina tipos diferentes usando o MESMO método
        vet.examinar(cachorro);
        vet.examinar(gato);
        vet.examinar(pato);

        // Exemplo extra: Usando o método específico do cachorro
        System.out.println("-------------------------");
        cachorro.correr();
    }
}