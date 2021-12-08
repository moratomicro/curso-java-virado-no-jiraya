package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionais06ExercicioSwitch {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 3;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("Error: OPÇÃO INVÁLIDA");
        }
    }
}
