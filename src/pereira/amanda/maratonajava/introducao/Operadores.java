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

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte );

        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("isDezIgualAVinte " +isDezIgualAVinte );

        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezDiferenteDeVinte " +isDezDiferenteDeVinte );

    if (numero01 == 10 && numero02 == 20){

    }

        numero01 = 10;
        numero01 += 5; // Agora numero = 15
        numero01 *= 2; // Agora numero = 30
        numero01 -= 10; // Agora numero = 20
        numero01 /= 2; // Agora numero = 10
        numero01 %= 3; // Agora numero = 1
        System.out.println(numero01); // Saída: 1

    }
}
