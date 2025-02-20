package pereira.amanda.maratonajava.javacore.Aintroducaoclasses.test;

import pereira.amanda.maratonajava.javacore.Aintroducaoclasses.dominio.Animal;

public class AnimalTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.tipo = "Cachorro";
        animal.nome = "Kiara";
        animal.idade = 1;
        animal.sexo = 'F';

        System.out.println(animal.tipo);
        System.out.println(animal.nome);
        System.out.println(animal.idade);
        System.out.println(animal.sexo);
    }
}
