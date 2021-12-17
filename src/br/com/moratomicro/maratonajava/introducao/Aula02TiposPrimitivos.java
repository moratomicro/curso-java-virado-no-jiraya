package br.com.moratomicro.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande= 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos.");
        System.out.println("long "+numeroGrande);
        System.out.println("double "+salarioDouble);
        System.out.println("float "+salarioFloat);
        System.out.println("byte "+idadeByte);
        System.out.println("short "+idadeShort);
        System.out.println("boolean verdadeiro "+verdadeiro);
        System.out.println("boolean falso "+falso);
        System.out.println("char "+caracter);
        System.out.println("Oi meu nome é "+nome);
    }
}
