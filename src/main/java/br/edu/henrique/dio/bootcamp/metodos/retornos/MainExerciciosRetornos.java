package br.edu.henrique.dio.bootcamp.metodos.retornos;

public class MainExerciciosRetornos {
    public static void main(String[] args) {

        System.out.println("Exercicio Retorno: ");

        double areaQuadrado =  QuadrilateroRetorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(4d, 9d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(6, 10, 75.3);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = QuadrilateroRetorno.area(3.6f, 8.9f);
        System.out.println("Área do losango: " + areaLosango);
    }
}
