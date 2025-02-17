package pereira.amanda.maratonajava.introducao;

public class EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        // Dado valors de 1 a 7, imprima se é dia útil ou não, considere 1 domingo
        byte dia = 2;

        //Somente char, int, byte, enum, string
        switch (dia) {
            case 1:
                System.out.println("Domingo, não útil");
                break;
            case 2:
                System.out.println("Segunda, útil");
                break;
            case 3:
                System.out.println("Terça, útil");
                break;
            case 4:
                System.out.println("Quarta, útil");
                break;
            case 5:
                System.out.println("Quinta, útil");
                break;
            case 6:
                System.out.println("Sexta, útil");
                break;
            case 7:
                System.out.println("Sábado, não útil");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
