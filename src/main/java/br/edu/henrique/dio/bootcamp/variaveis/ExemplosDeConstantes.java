package br.edu.henrique.dio.bootcamp.variaveis;

public class ExemplosDeConstantes {

    public static void main(String[] args) {

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        // variaveis constantes, que não mudam o valor devem iniciar com final antes do tipo.
        // A caixa alta é uma convençao de nome para esse tipo de variavel, mas não impede sistemicamente a mudança do valor.
        // O final é que impede essa alteração sistemica.

        final double VALOR_DE_PI = 3.14;


    }
}
