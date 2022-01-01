package br.com.moratomicro.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("__________Curso de Java DevDojo__________");
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Data de nascimento: ");
        String nasc = entrada.next();
        System.out.println("Digite M ou F para sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("________________________________________________________");
        System.out.println("Seja bem vindo "+nome+ "\nVocê Nasceu em "+nasc+ "\nE seu sexo é "+sexo);
    }
}
