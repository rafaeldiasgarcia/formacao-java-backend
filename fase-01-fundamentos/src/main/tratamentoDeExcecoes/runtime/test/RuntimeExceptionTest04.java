package tratamentoDeExcecoes.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {

            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        } // multi catch em linha unsado "|"


        try {
            talvezLanceException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

//        try {
//
//            throw new RuntimeException();
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Dentro do IndexOutOfBoundsException");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Dentro do IllegalArgumentException");
//        } catch (ArithmeticException e) {
//            System.out.println("Dentro do ArithmeticException");
//        } catch (RuntimeException e) {
//            System.out.println("Dentro do RuntimeException");
//        } // exceções mais genéricas precisam vir no final
//
//        try {
//
//            talvezLanceException();
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } // tenho que tratar as duas exceções que podem acontecer

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
