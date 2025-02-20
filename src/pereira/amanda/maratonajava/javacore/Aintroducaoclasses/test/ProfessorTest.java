package pereira.amanda.maratonajava.javacore.Aintroducaoclasses.test;

import pereira.amanda.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 50;
        professor.sexo = 'F';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);


    }
}
