package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.ExemploParametrosReferencia;

public class ExemploParametrosReferenciaTest {

    public static void modificarAnimal(ExemploParametrosReferencia animal) {
        animal.nome = "Rex";
        animal.idade = 5;
        animal.sexo = "Macho";
        animal.especie = "Cachorro";
        System.out.println("Dentro do método modificarAnimal: " + animal.nome + ", " + animal.idade + " anos, " + animal.sexo + ", " + animal.especie);
    }

    public static void main(String[] args) {
        ExemploParametrosReferencia meuAnimal = new ExemploParametrosReferencia();
        meuAnimal.nome = "Bolinha";
        meuAnimal.idade = 2;
        meuAnimal.sexo = "Fêmea";
        meuAnimal.especie = "Gato";

        System.out.println("Antes de modificar: " + meuAnimal.nome + ", " + meuAnimal.idade + " anos, " + meuAnimal.sexo + ", " + meuAnimal.especie);

        modificarAnimal(meuAnimal); // Passagem por referência

        System.out.println("Depois de modificar: " + meuAnimal.nome + ", " + meuAnimal.idade + " anos, " + meuAnimal.sexo + ", " + meuAnimal.especie);
    }

}



