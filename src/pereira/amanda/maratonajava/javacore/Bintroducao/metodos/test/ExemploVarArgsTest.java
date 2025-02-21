package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

import static pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.ExemploVarArgs.somar;

public class ExemploVarArgsTest {
    public static void main(String[] args) {
        // Chamadas ao método somar com diferentes quantidades de argumentos
        int resultado1 = somar(1, 2, 3);
        int resultado2 = somar(4, 5, 6, 7, 8);
        int resultado3 = somar(); // Sem argumentos

        // Exibindo os resultados
        System.out.println("Soma 1: " + resultado1); // Soma 1: 6
        System.out.println("Soma 2: " + resultado2); // Soma 2: 30
        System.out.println("Soma 3: " + resultado3); // Soma 3: 0
    }
}
