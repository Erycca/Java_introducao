public class OperadoresAritmeticos {
    public static void main (String[] args) {
        // Declaração e atribuição de variáveis
        int numero1 = 10;
        int numero2 = 5;

        // --- Exemplos com os operadores ---

        // Adição: O resultado será 15 (10 + 5)
        int soma = numero1 + numero2;
        System.out.println("O resultado da soma é: " + soma); // Saída: O resultado da soma é: 15

        // Subtração: O resultado será 5 (10 - 5)
        int subtracao = numero1 - numero2;
        System.out.println("O resultado da subtração é: " + subtracao); // Saída: O resultado da subtração é: 5

        // Multiplicação: O resultado será 50 (10 * 5)
        int multiplicacao = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + multiplicacao); // Saída: O resultado da multiplicação é: 50

        // Divisão: O resultado será 2 (10 / 5)
        int divisao = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + divisao); // Saída: O resultado da divisão é: 2

        // Módulo (resto da divisão): O resultado será 0 (10 dividido por 5 não deixa resto)
        //var modulo = numero1 % numero2;
       // System.out.println("O resto da divisão é: " + modulo); // Saída: O resto da divisão é: 0

        // Outro exemplo com módulo:
        int numero3 = 7;
        int modulo2 = numero3 % 3; // 7 dividido por 3 é 2, com resto 1
        System.out.println("O resto de 7 dividido por 3 é: " + modulo2); // Saída: O resto de 7 dividido por 3 é: 1

        // Incremento: Adiciona 1 ao valor da variável 'numero1'
        numero1++; // 'numero1' agora é 11
        System.out.println("Após o incremento, o numero1 é: " + numero1); // Saída: Após o incremento, o numero1 é: 11

        // Decremento: Subtrai 1 do valor da variável 'numero2'
        numero2--; // 'numero2' agora é 4
        System.out.println("Após o decremento, o numero2 é: " + numero2); // Saída: Após o decremento, o numero2 é: 4

    }
}
