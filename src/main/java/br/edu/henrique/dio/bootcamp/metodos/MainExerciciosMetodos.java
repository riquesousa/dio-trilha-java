package br.edu.henrique.dio.bootcamp.metodos;

public class MainExerciciosMetodos {
    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora: ");
        Calculadora.soma(1, 3);
        Calculadora.subtracao(10, 4);
        Calculadora.multiplicacao(30, 90);
        Calculadora.divisao(100, 10);

        System.out.println("Exercicio Mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercicio Empréstimo: ");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas()); // Passando um método como parametro
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);


    }
}
