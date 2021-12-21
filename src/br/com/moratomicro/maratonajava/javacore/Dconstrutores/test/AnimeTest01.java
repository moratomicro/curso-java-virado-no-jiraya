package br.com.moratomicro.maratonajava.javacore.Dconstrutores.test;

import br.com.moratomicro.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();

        /*Anime anime2 = new Anime();
        anime2.imprime();*/
    }
}
