package br.edu.henrique.dio.bootcamp.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int numero = 5;

        numero = - numero; // força a mudança do valor para negativo manipulando com o operador -

        System.out.println(numero);

        numero = numero * -1; // força a mudança do valor para positivo novamente, manipulando com o operador * - onde fará a multiplicação por 1 e deixando positivo

        System.out.println(numero);
    }
}
