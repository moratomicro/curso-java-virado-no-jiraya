package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else{
            System.out.println("Não Autorizado a compra bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a compra bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Não pode comprar");

    }
}
