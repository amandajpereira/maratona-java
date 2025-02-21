package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.ExemploParametrosPrimitivos;

public class ExemploParametrosPrimitivosTest {
    public static void main(String[] args) {
        ExemploParametrosPrimitivos exemploParametrosPrimitivos = new ExemploParametrosPrimitivos();
        int meuNumero = 6;
        exemploParametrosPrimitivos.alterarNumero(meuNumero);
        System.out.println(meuNumero);  // Saída: 5
    }
}
