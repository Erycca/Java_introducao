
// Define a classe principal do nosso programa.
public class ExemplosPrimitivos {

            // O método principal que o Java executa primeiro.
        public static void main(String[] args) {

            // --- Variáveis de números inteiros ---
            // Declaramos um 'byte' para a idade, pois 127 é o máximo que ele guarda
            // É um bom exemplo para economizar memória se o número for pequeno.
            byte idade = 30;

            // Usamos 'short' para guardar a quantidade de dias no ano, um valor um pouco maior.
            short diasNoAno = 365;

            // Usamos o 'int' para o total de segundos, um número grande e comum.
            int totalSegundosNoDia = 24 * 60 * 60; // 86400

            // Usamos o 'long' para um número ainda maior, a população de um país, por exemplo.
            long populacaoBrasil = 215300000L; // O 'L' no final diz que o número é um 'long'

            // --- Variáveis de números decimais ---
            // 'float' para a altura, com o 'f' no final para indicar o tipo.
            float altura = 1.75f;

            // 'double' para o valor de uma pizza, com mais precisão. É o padrão.
            double precoPizza = 59.90;

            // --- Outros tipos ---
            // 'boolean' para guardar se está chovendo ou não.
            boolean estaChovendo = false;

            // 'char' para guardar a primeira letra do nome.
            char inicialNome = 'E';

            // Imprimindo os valores para o usuário
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Dias no ano: " + diasNoAno);
            System.out.println("Total de segundos no dia: " + totalSegundosNoDia);
            System.out.println("População do Brasil: " + populacaoBrasil);
            System.out.println("Altura: " + altura + " metros");
            System.out.println("Preço da pizza: R$" + precoPizza);
            System.out.println("Está chovendo? " + estaChovendo);
            System.out.println("Inicial do nome: " + inicialNome);
        }
    }

