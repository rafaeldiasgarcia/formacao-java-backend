package poo.ex07;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("-------------------------");
        System.out.println("Examinando o(a): " + animal.getNome());

        // POLIMORFISMO: O Java decide qual "emitirSom" chamar
        // baseado no objeto real que está na memória.
        animal.emitirSom();
    }
}