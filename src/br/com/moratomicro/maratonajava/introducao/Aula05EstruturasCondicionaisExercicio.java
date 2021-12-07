package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnualBruto = 70000;
        double salarioAnualLiquido;

        if(salarioAnualBruto > 0 && salarioAnualBruto <= 20711){
            salarioAnualLiquido = salarioAnualBruto + ((salarioAnualBruto * 36.65)/100);
            System.out.println("Salário anual líquido = R$ " + salarioAnualLiquido);
        }else if(salarioAnualBruto > 20711 && salarioAnualBruto <= 68507){
            salarioAnualLiquido = salarioAnualBruto + ((salarioAnualBruto * 38.10)/100);
            System.out.println("Salário anual líquido = R$ " + salarioAnualLiquido);
        }else if(salarioAnualBruto > 68507){
            salarioAnualLiquido = salarioAnualBruto + ((salarioAnualBruto * 51.75)/100);
            System.out.println("Salário anual líquido = R$ " + salarioAnualLiquido);
        }
    }
}
