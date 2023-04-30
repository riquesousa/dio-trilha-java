package br.edu.henrique.dio.bootcamp.operadores;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultadoAvancado = (10 * 7) + (20/4);

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
        System.out.println("Resultado do modulo: " + modulo);
        System.out.println("Resultado avançado: " + resultadoAvancado);

        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);
    }

}
