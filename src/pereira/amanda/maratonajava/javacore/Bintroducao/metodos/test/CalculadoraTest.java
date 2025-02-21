package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.saudacao();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,2);
        double result = calculadora.divideDoisNumeros(10,5);
        System.out.println(result);

    }
}
