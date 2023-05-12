package br.edu.henrique.dio.bootcamp.metodos.sobrecarga;

import br.edu.henrique.dio.bootcamp.metodos.Calculadora;
import br.edu.henrique.dio.bootcamp.metodos.Emprestimo;
import br.edu.henrique.dio.bootcamp.metodos.Mensagem;

public class MainExerciciosSobrecarga {
    public static void main(String[] args) {

        System.out.println("Exercicio Quadrilátero: ");
        Quadrilatero.area(3);
        Quadrilatero.area(4d, 9d);
        Quadrilatero.area(6, 10, 75.3);
        Quadrilatero.area(3.6f, 8.9f);

    }
}
