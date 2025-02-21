package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio;

public class ExemploVarArgs {
    // Método que aceita um número variável de inteiros
    public static int somar(int... numeros) {
        int soma = 0; // Variável para armazenar a soma

        // Loop para somar todos os números passados
        for (int numero : numeros) {
            soma += numero; // Adiciona cada número à soma
        }

        return soma; // Retorna a soma total
    }
}
