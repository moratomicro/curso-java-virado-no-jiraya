package br.com.moratomicro.maratonajava.javacore.Gassociacao.test;

import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Aluno;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Local;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Professor;
import br.com.moratomicro.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Monkey D. Luffy", 17);
        Aluno aluno2 = new Aluno("Roronoa Zoro", 19);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno, aluno2};

        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
