package strings.ex04;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Rafael"; //Strinmg constant pool
        String nome2 = "Rafael";
        nome.concat(" Dias");
        System.out.println(nome);
        nome = nome.concat(" Dias"); // nome += " Dias"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Rafael"); //1 variável de referência, 2 objeto do tipo string, 3 uma string do tipo string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
