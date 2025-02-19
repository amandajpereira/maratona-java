package pereira.amanda.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {

        int [] idades = new int [3];
        idades [0] = 10;
        idades [1] = 20;
        idades [2] = 30;
        System.out.println(idades[1]);

        String [] nomes = new String[4];
        nomes[0] = "João";
        nomes[1] = "Vanda";
        nomes[2] = "Amanda";
        nomes[3] = "Julio";

        for (int i = 0; i<=3; i++){
            System.out.println(nomes[i]);
        }


        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }


        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[] novosNumeros = new int [] {1,2,3,4,5};
        for (int i = 0; i < novosNumeros.length; i ++) {
            System.out.println(novosNumeros[i]);
        }

        for(int num:novosNumeros) {
            System.out.println(num);
        }
    }
}
