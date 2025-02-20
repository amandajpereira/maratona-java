package pereira.amanda.maratonajava.introducao;

public class ArraysMultidimesionais {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }

        for (int[] arrBase : matriz) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[2][3];
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }


    }
}
