public class OperadoresLogicoAnd {
    public static void main(String[] args) {
        int idade = 20;
        String nome = "Maria";
        boolean estaNaLista = true;


        // A condição para entrar é: idade maior que 18 E estar na lista
        // Como as duas condições são verdadeiras, o resultado final é 'true'
        if (idade > 18 && estaNaLista) {
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Não pode entrar na festa.");
        }

        System.out.println("---");

        // Novo cenário:
        //int idade2 = 16;
        //String nome2 = "João";
        //boolean estaNaLista2 = true;

        // A primeira condição (idade > 18) é falsa.
        // O operador '&&' já sabe que o resultado final será falso,
        // então nem verifica a segunda condição (estaNaLista2).
       // if (idade2 > 18 && estaNaLista2) {
            //System.out.println("Pode entrar na festa!");
        //} else {
            //System.out.println("Não pode entrar na festa."); // Saída: Não pode entrar na festa.
        //}

    }
}
