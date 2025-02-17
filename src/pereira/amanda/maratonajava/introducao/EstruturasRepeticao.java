package pereira.amanda.maratonajava.introducao;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;
        while(count < 5) {
            System.out.println("While: " + count);
            count++;
        }

        do {
            System.out.println("Do while " + count);
            count++;

        } while (count < 10);


        for(int i = 0; i < 10; i++) {
            System.out.println("For: " + i);

        }
    }
}
