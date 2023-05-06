package br.edu.henrique.dio.bootcamp.estrutura_de_repeticao;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Digite o número que deseja ver a tabuada: ");
        numeroTabuada = scan.nextInt();

        System.out.println("Tabuada do número: " + numeroTabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(numeroTabuada +" X " + i + " = " + (numeroTabuada*i));
        }

    }
}
