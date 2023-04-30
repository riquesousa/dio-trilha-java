package br.edu.henrique.dio.bootcamp.operadores;

public class Concatenacao {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // enquanto ainda for numero ele faz a operacao normalmente que seria a soma, quando aparece a string ele concatena apenas até finalizar

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
}
