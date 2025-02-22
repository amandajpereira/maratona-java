package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Amanda");
        aluno.setIdade(29);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());


    }
}
