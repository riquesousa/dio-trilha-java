package br.edu.henrique.dio.bootcamp.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {2, -3, -7, 45, 8, 99};

        int count = 0;

        System.out.println("Vetor: ");

        while(count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count++;

        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
