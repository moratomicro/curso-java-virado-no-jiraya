package br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.test;

import br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Reine Alexandre Morato";
        funcionario.idade = 46;
        funcionario.salarios = new double[]{1530, 1890, 1993, 1000};

        funcionario.imprime();

    }
}
