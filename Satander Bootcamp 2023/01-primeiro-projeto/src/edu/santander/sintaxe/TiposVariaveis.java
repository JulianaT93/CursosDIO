package edu.santander.sintaxe;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 20;
        short ano = 2022;
        long cpf = 123456789111L;
        int apartamento = 58;
        float pi = 3.14F;
        double salarioMinimo = 2500.50;
        boolean portaAberta = false;
        char sexoPessoa = 'F'; // Sempre um caractere e entre aspas simples
        String nome = "Maria";

        // Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Exemplo de casting
    }
}
