package br.com.moratomicro.maratonajava.introducao;

/*
Prática

Crie variáveis para os cam pos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Reine Alexandre Morato";
        String endereco = "Rua Nossa Senhora Do Rosário, 214 - Bairro: Novo Horizonte";
        double salario = 1800.00;
        String dataRecebimentoSalario = "30/11/2021";
        String relatorio = "Eu "+nome+ ", morando no endereço "+endereco+ ", confirmo que recebi o salário de R$ "+salario+ "0, na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);
    }
}
