package br.com.moratomicro.maratonajava.javacore.Hheranca.test;

import br.com.moratomicro.maratonajava.javacore.Hheranca.dominio.Endereco;
import br.com.moratomicro.maratonajava.javacore.Hheranca.dominio.Funcionario;
import br.com.moratomicro.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("03");
        endereco.setCep("01234-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("123.456.789-12");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("219.876.543-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2300.00);
        System.out.println("_____________________________");
        funcionario.imprime();
    }
}
