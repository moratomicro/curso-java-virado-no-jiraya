package br.com.moratomicro.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.moratomicro.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
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
