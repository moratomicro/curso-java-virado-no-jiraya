package br.com.moratomicro.maratonajava.javacore.Gassociacao.test;

import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Jogador;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Goleiro - Alisson");
        Jogador jogador2 = new Jogador("Lateral Direito - Emerson Royal");
        Jogador jogador3 = new Jogador("Zagueiro - Marquinhos");
        Jogador jogador4 = new Jogador("Zagueiro - Diego Carlos");
        Jogador jogador5 = new Jogador("Lateral Esquerdo - Renan Lodi");
        Jogador jogador6 = new Jogador("Volantes - Casemiro");
        Jogador jogador7 = new Jogador("Volantes - Fabinho");
        Jogador jogador8 = new Jogador("Ponta Direita - Rodrygo");
        Jogador jogador9 = new Jogador("Meia ofensivo - Philippe Coutinho");
        Jogador jogador10 = new Jogador("Ponta Esquerda - Neymar");
        Jogador jogador11 = new Jogador("Atacante - Gabriel Jesus");

        Time brasil = new Time("Brasil");
        Jogador[] jogadores = {
                jogador1,
                jogador2,
                jogador3,
                jogador4,
                jogador5,
                jogador6,
                jogador7,
                jogador8,
                jogador9,
                jogador10,
                jogador11
        };
        jogador1.setTime(brasil);
        jogador2.setTime(brasil);
        jogador3.setTime(brasil);
        jogador4.setTime(brasil);
        jogador5.setTime(brasil);
        jogador6.setTime(brasil);
        jogador7.setTime(brasil);
        jogador8.setTime(brasil);
        jogador9.setTime(brasil);
        jogador10.setTime(brasil);
        jogador11.setTime(brasil);

        brasil.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();
        jogador5.imprime();
        jogador6.imprime();
        jogador7.imprime();
        jogador8.imprime();
        jogador9.imprime();
        jogador10.imprime();
        jogador11.imprime();

        System.out.println("--- Seleção ---");

        brasil.imprime();
    }
}
