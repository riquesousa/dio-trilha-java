package br.edu.henrique.dio.bootcamp.estrutura_de_repeticao;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count + 1;

        }while (count < 5);

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos valores é: " + (soma/5));

    }
}
