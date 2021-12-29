package br.com.moratomicro.maratonajava.javacore.Gassociacao.test;

import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Jogador;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time brasil = new Time("Seleção Brasileira");

        jogador1.setTime(brasil);

        jogador1.imprime();
    }
}
