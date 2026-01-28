package tratamentoDeExcecoes.exception.test;

import tratamentoDeExcecoes.exception.dominio.Funcionario;
import tratamentoDeExcecoes.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

    }
}
