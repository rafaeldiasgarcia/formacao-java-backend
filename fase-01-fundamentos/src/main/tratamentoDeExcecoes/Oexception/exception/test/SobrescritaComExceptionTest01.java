package tratamentoDeExcecoes.Oexception.exception.test;

import tratamentoDeExcecoes.Oexception.exception.dominio.Funcionario;
import tratamentoDeExcecoes.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

    }
}
