package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionais06ExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo, final de semana!");
                break;

            case 2:
                System.out.println("Hoje é Segunda-Feira, dia útil!");
                break;

            case 3:
                System.out.println("Hoje é terça-Feira, dia útil!");
                break;

            case 4:
                System.out.println("Hoje é quarta-Feira, dia útil!");
                break;

            case 5:
                System.out.println("Hoje é quinta-Feira, dia útil!");
                break;

            case 6:
                System.out.println("Hoje é sexta-Feira, dia útil!");
                break;

            case 7:
                System.out.println("Hoje é sábado, final de semana!");
                break;

            default:
                System.out.println("Error: Este não é um valor válido para os dias da semana.");
        }

        System.out.println("==========================================================================");

        if (dia == 1){
            System.out.println("Hoje é domingo, final de semana!");
        }else if(dia == 2){
            System.out.println("Hoje é Segunda-Feira, dia útil!");
        }else if(dia == 3){
            System.out.println("Hoje é terça-Feira, dia útil!");
        }else if(dia == 4){
            System.out.println("Hoje é quarta-Feira, dia útil!");
        }else if(dia == 5){
            System.out.println("Hoje é quinta-Feira, dia útil!");
        }else if(dia == 6){
            System.out.println("Hoje é sexta-Feira, dia útil!");
        }else if(dia == 7){
            System.out.println("Hoje é sábado, final de semana!");
        }else{
            System.out.println("Error: Este não é um valor válido para os dias da semana.");
        }
    }
}
