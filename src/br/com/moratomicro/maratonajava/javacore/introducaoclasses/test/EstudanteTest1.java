package br.com.moratomicro.maratonajava.javacore.introducaoclasses.test;

import br.com.moratomicro.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Reine";
        estudante.idade = 46;
        estudante.sexo = 'M';

        System.out.print(estudante.nome +" - ");
        System.out.print(estudante.idade +" - ");
        System.out.print(estudante.sexo);
    }
}
