package pereira.amanda.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

    }
}
