package edu.santander.sintaxe;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 20;
        System.out.println(idade);

        short ano = 2022;
        System.out.println(ano);

        long cpf = 123456789111L;
        System.out.println(cpf);

        int apartamento = 58;
        System.out.println(apartamento);

        float pi = 3.14F;
        System.out.println(pi);

        double salarioMinimo = 2500.50;
        System.out.println(salarioMinimo);

        boolean portaAberta = false;
        System.out.println(portaAberta);

        char sexoPessoa = 'F'; // Sempre um caractere e entre aspas simples
        System.out.println(sexoPessoa);

        String nome = "Maria";
        System.out.println(nome);

        // Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Exemplo de casting
        System.out.println(numeroCurto2);
    }
}
