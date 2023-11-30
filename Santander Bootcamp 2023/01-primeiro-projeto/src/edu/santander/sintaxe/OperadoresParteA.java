package edu.santander.sintaxe;

public class OperadoresParteA {
    public static void main(String[] args) {
        // Atribuição (=)
        String nome = "Fátima";
        System.out.println("Exemplo de operador de atribuição (=): " + nome);

        // Aritméticos (+, -, /, *, %)
        double soma = 10.5 + 15.78;
        System.out.println("Exemplo de operador aritmético (+): " + soma);

        int expressao = (10 * 7) - (10 - 5);
        System.out.println("Exemplo de operador aritmético: " + expressao);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("Exemplo de operador aritmético (concatenação): " + concatenacao); // Imprime 31, porque ele
                                                                                              // soma 1+1+1 = 3 e
                                                                                              // concatena com a string
                                                                                              // 1

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Exemplo de operador aritmético (concatenação): " + concatenacao); // Imprime 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("Exemplo de operador aritmético (concatenação): " + concatenacao); // Imprime 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("Exemplo de operador aritmético (concatenação): " + concatenacao); // Imprime 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("Exemplo de operador aritmético (concatenação): " + concatenacao); // Imprime 13, porque ele
                                                                                              // soma 1+1+1 = 3 e
                                                                                              // concatena com a string
                                                                                              // 1

        // Unário (+, -, ++, --, !)

        // Utilizado para alterar número positivo e negativo
        int numero = 5;
        System.out.println("Exemplo de operador unário (positivo para negativo): " + (-numero)); // Imprime o número
                                                                                                 // negativo -5
        System.out.println("Exemplo de operador unário (positivo): " + numero); // Imprime o numero positivo 5, porque a
                                                                                // linha anterior não alterou o valor da
        // variável

        numero = -numero; // Se eu quiser alterar o valor declarado na variável para negativo
        System.out.println("Exemplo de operador unário (alteração do valor da variável para negativo): " + numero); // Agora,
                                                                                                                    // imprime
                                                                                                                    // -5

        // Utilizado para incrementar o número em mais 1
        int numero1 = 7;
        numero1++;
        System.out.println("Exemplo de operador unário (incremento): " + numero1); // Imprime 8

        // Diferença entre ++numero e numero++
        System.out.println("Exemplo de operador unário (incremento numero++): " + (numero1++)); // Primeiro imprime o
                                                                                                // número 8, depois
                                                                                                // incrementa
        System.out.println("Exemplo de operador unário (incremento numero++): " + numero1); // Imprime 9 porque foi
                                                                                            // incrementado na linha
                                                                                            // anterior

        System.out.println("Exemplo de operador unário (incremento ++numero): " + (++numero1)); // Imprime 10 porque o
                                                                                                // incremento foi
                                                                                                // realizado antes da
                                                                                                // impressão

        System.out.println("Exemplo de operador unário (decremento --numero): " + (--numero1)); // Imprime 9 devido
                                                                                                // decremento

        // Inversão de valores para booleano (!)
        boolean verdadeiro = true;
        System.out.println("Exemplo de operador unário (inversão de valor): " + !verdadeiro); // Imprime false, mas não
                                                                                              // altera o valor original
                                                                                              // da variável

        verdadeiro = !verdadeiro; // Se eu quiser alterar o valor declarado na variável para false
        System.out.println("Exemplo de operador unário (inversão de valor): " + verdadeiro); // Agora,
                                                                                             // imprime
                                                                                             // false porque o valor foi
                                                                                             // alterado na variável
    }
}
