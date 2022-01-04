package br.com.moratomicro.maratonajava.javacore.Gassociacao.test;

import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Aluno;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Local;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Professor;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Local local2 = new Local("Planeta Vegeta");
        Aluno aluno = new Aluno("Monkey D. Luffy", 17);
        Aluno aluno2 = new Aluno("Roronoa Zoro", 19);
        Aluno aluno3 = new Aluno("Goku", 16);
        Aluno aluno4 = new Aluno("Vegeta", 18);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Aluno[] alunosParaSeminario2 = {aluno3, aluno4};

        Seminario seminario = new Seminario("Onde achar One Piece - Primeira Temporada", alunosParaSeminario, local);
        Seminario seminario2 = new Seminario("Goku vai para seu planeta natal", alunosParaSeminario2, local2);

        Seminario[] seminariosDisponiveis = {seminario, seminario2};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
