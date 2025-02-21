package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.test;

import pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        // Criando uma nova pessoa
        Pessoa pessoa = new Pessoa ("Alice", 30);

        // Exibindo informações
        pessoa.exibirInformacoes();

        // Alterando o nome e idade usando encadeamento
        pessoa.setNome("Bob").setIdade(25);

        // Exibindo as informações atualizadas
        pessoa.exibirInformacoes();
    }
}
