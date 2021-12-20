package br.com.moratomicro.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade+" anos");
        if(salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println("Salário R$ " + salario + " ");
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if(salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média salárial = R$ " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
