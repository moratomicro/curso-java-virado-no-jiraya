package br.com.moratomicro.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = (salarioAnual * 9.70) / 100;
        double segundaFaixa  = (salarioAnual * 37.35) / 100;
        double terceiraFaixa = (salarioAnual * 49.50) / 100;
        double valorDoImposto;

        if(salarioAnual > 0 && salarioAnual <= 20711){
            valorDoImposto =  primeiraFaixa;
        }else if(salarioAnual > 20711 && salarioAnual <= 68507){
            valorDoImposto = segundaFaixa;
        }else{
            valorDoImposto = terceiraFaixa;
        }
        System.out.println("Salário anual = R$ " +valorDoImposto);
    }
}
