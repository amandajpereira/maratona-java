package pereira.amanda.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Pessoa {

        private String nome;
        private int idade;

        // Construtor da classe
        public Pessoa(String nome, int idade) {
            this.nome = nome; // 'this.nome' se refere à variável de instância
            this.idade = idade; // 'this.idade' se refere à variável de instância
        }

        // Método para exibir informações da pessoa
        public void exibirInformacoes() {
            System.out.println("Nome: " + this.nome); // Usando 'this' para referir-se à instância atual
            System.out.println("Idade: " + this.idade);
        }

        // Método para alterar o nome da pessoa
        public Pessoa setNome(String nome) {
            this.nome = nome; // 'this.nome' para diferenciar
            return this; // Retorna a instância atual para permitir encadeamento
        }

        // Método para alterar a idade da pessoa
        public Pessoa setIdade(int idade) {
            this.idade = idade; // 'this.idade' para diferenciar
            return this; // Retorna a instância atual para permitir encadeamento
        }



}
