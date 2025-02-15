package pereira.amanda.maratonajava.introducao;

public class TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Amanda";
        String endereco = "Santo André - São Paulo";
        double salario = 2000;
        String dataRecebimento = "15/02/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                ", recebi meu salário de " + salario +
                " na data de: " + dataRecebimento;
        System.out.printf(relatorio);
    }
}
