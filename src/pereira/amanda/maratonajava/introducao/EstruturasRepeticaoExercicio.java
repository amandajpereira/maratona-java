package pereira.amanda.maratonajava.introducao;

import java.sql.SQLOutput;

public class EstruturasRepeticaoExercicio {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000

        for(int i = 0; i <= 10; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }

        //Imprima os primeiros 5 números de 0 até 10
        for(int i = 0; i <= 10; i++){
            if(i <= 5){
                System.out.println(i);
            }

        }

        //Dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //Valor da parcela deve ser maior ou igual a mil
        double valorTotal = 30000;

        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }


    }
}
