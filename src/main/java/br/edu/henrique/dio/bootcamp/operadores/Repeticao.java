package br.edu.henrique.dio.bootcamp.operadores;

public class Repeticao {

    public static void main(String[] args) {

        int numero = 5;
        // x repeticao
        // abreviacao incrementando que o numero somara + 1. Ex: seria a mesma coisa que numero = numero +1;
        numero++;
        System.out.println(numero);

        boolean variavel = true;

//        System.out.println(!variavel); // ! negando o valor original da variavel que seria de true, invertendo o estado apenas em memoria.
        // O valor original ainda sera true.

        variavel = !variavel; // altera de vez o valor da variavel
        System.out.println(variavel);

    }
}
