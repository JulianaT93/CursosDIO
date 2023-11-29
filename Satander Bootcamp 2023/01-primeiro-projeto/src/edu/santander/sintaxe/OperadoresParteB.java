package edu.santander.sintaxe;

public class OperadoresParteB {
    public static void main(String[] args) {
        // Ternário (?, :)
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        int resultado2 = a == b ? 1 : 0;

        System.out.println(resultado); // Imprime falso

        System.out.println(resultado2); // Imprime 0

        // Relacionais (==, !=, >, >=, <,<=)

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Número 1 é igual ao número 2? " + simNao); // Imprime false

        if (numero1 < numero2) {
            System.out.println("O número um é menor que o número 2"); // Imprime essa linha
        }

        String nome1 = "Maria";
        String nome2 = "Maria";

        System.out.println(nome1 == nome2); // Imprime true

        String nome3 = new String("Maria"); // Criando novo objeto

        System.out.println(nome1 == nome3); // Imprime false, porque o novo objeto (nome3) é armazenado em local
                                            // diferente do nome1

        // Atenção: para comprar conteúdo de um objeto, use o método equals:
        System.out.println(nome1.equals(nome3)); // Imprime true

        // Lógicos (&&, ||)
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        // Também é possível relacionar com expressão matemática
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }
    }
}
