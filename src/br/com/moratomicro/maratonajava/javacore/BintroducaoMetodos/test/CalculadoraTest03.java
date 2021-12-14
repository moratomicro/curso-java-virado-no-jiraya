package br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.test;

import br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("___________________________");
        System.out.println(calculadora.divideDoisNumeros02(30,0));
        System.out.println("____________________________");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
