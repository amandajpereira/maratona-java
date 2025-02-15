package pereira.amanda.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {

        int numero01 = 20;
        int numero02 = 10;
        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        int multiplicacao = numero01 * numero02;
        int divisao = numero01 / numero02;
        int resto = numero01 % numero02;

        String resultado = ("Soma é " + soma + " Subtração é: " + subtracao + " Multiplicação é: " + multiplicacao + " Divisão é: " + divisao + " O resto é: " + resto);
        System.out.println(resultado);

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte );

    }
}
