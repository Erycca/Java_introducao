public class OperadoresLogicoOr {

    public static void main(String[] args) {
        int idade = 20;
        boolean temAutorizacaoDosPais = false;

        // O operador lógico '||' (OR) verifica se pelo menos uma das condições é verdadeira.
        // Se a primeira condição (idade > 18) for verdadeira, ele já retorna true,
        // sem precisar avaliar a segunda.


        if (idade > 18 || temAutorizacaoDosPais) {
            System.out.println("Pode viajar!");
        } else {
            System.out.println("Não pode viajar.");
        }

    }
}
