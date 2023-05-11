package br.edu.henrique.dio.bootcamp.estrutura_de_repeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um número para exibir o Fatorial: ");
        int numFatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(numFatorial +"! = ");
        for(int i = numFatorial; i >= 1; i--){

            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}
