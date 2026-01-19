package strings.ex02;

import java.util.Arrays;

public class DetetiveDeAnagramas {

    public static boolean saoAnagramas(String palavra1, String palavra2) {

        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }

    public static void main(String[] args) {

        System.out.println(saoAnagramas("AMOR", "ROMA")); // true
        System.out.println(saoAnagramas("JAVA", "AVAJ")); // true
        System.out.println(saoAnagramas("CASA", "CASO")); // false

    }
}
