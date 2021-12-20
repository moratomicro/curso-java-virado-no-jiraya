package br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.test;

import br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Reine Alexandre Morato");
        funcionario.setIdade(46);
        funcionario.setSalarios(new double[]{1530, 1890, 1993, 1000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
