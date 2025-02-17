package pereira.amanda.maratonajava.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        // doar se salário for maior que 5000

        double salario = 5500;
        String mensagemDoar = "Eu vou doar 500 R$";
        String mensagemNaoDor = "Ainda não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDor;
        System.out.println(resultado);



    }
}
