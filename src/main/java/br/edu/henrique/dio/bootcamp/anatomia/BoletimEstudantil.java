package br.edu.henrique.dio.bootcamp.anatomia;

public class BoletimEstudantil {

    public static void main(String[] args) {

        int mediaFinal = 3;

        if(mediaFinal < 6)
            System.out.println("Aluno Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aluno Aprovado");
    }
}
