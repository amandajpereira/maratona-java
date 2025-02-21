package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Calculadora {

    public void saudacao() {
        System.out.println("Olá, bem vindo!");
    }

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros (int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        else {
            return num1/num2;
        }
    }


}
