package br.com.moratomicro.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.moratomicro.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Fastback 2 portas";
        carro1.ano = 1965;

        carro2.nome = "Onix 2020";
        carro2.modelo = "Compacto";
        carro2.ano = 2020;

        carro2= carro1;

        System.out.println("Carro 1: ____________________________________________________________________________________");
        System.out.println("Nome do Carro: " +carro1.nome+ "\nModelo: " +carro1.modelo+ "\nAno: " +carro1.ano );
        System.out.println("Carro 2: ____________________________________________________________________________________");
        System.out.println("Nome do Carro: " +carro2.nome+ "\nModelo: " +carro2.modelo+ "\nAno: " +carro2.ano );
    }
}
