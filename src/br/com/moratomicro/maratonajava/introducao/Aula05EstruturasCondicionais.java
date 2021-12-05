package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >=18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a compra bebida alcólica");
        }

        System.out.println("Não pode comprar");

    }
}
