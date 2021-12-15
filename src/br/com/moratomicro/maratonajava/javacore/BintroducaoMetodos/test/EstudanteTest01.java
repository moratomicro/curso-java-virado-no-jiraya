package br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.test;

import br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
        System.out.println("Imprimindo estudante 01 - Passado por Referência");
        impressora.imprime(estudante01);

        System.out.println("Imprimindo estudante 02 - Passado por Referência");
        impressora.imprime(estudante02);

        System.out.println("#####################################");
        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        /*System.out.println("--------------estudante01 - Passado por Parãmetro-----------");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------estudante02 - Passado por Parãmetro------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);*/
    }
}
