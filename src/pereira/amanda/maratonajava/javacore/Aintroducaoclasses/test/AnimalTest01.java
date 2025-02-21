package pereira.amanda.maratonajava.javacore.Aintroducaoclasses.test;

import pereira.amanda.maratonajava.javacore.Aintroducaoclasses.dominio.Animal;

public class AnimalTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal2 = new Animal();

        animal.tipo = "Cachorro";
        animal.nome = "Kiara";
        animal.idade = 1;
        animal.sexo = 'F';
        System.out.println(animal.tipo);
        System.out.println(animal.nome);
        System.out.println(animal.idade);
        System.out.println(animal.sexo);

        animal2.tipo = "Cachorro";
        animal2.nome = "Betho";
        animal2.idade = 10;
        animal2.sexo = 'M';

        System.out.println(animal2.tipo);
        System.out.println(animal2.nome);
        System.out.println(animal2.idade);
        System.out.println(animal2.sexo);

        animal = animal2;
        System.out.println(animal.nome);
        System.out.println(animal.tipo);
        System.out.println(animal.nome);
        System.out.println(animal.idade);
        System.out.println(animal.sexo);

    }
}
