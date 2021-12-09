package br.com.moratomicro.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01Exercicio {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        /*for (int i = 0; i <= 1000000 ; i+=2) {
            System.out.println(i);
        }*/

        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
