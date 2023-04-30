package br.edu.henrique.dio.bootcamp.variaveis;

public class TiposVariaveis {

    public static void main(String[] args) {

            double salarioMinimo = 2500; // Maneira correta de apresentar uma variavel de salario, se colcoar o . para decimal fica 2.5 e não 2500.

            String meuNome = "Aluno";
            byte idade = 123;
            short ano = 2023;
            int cep = 21070333; // se começar com zero, talvez seja necessário utilizar outro tipo como String.
            long cpf = 98765432109L; // mesma observação do cep. Tipo long deve ter L no final.
            float pi = 3.14F; // Tipo float deve ter F no final, se não vai ser considerado double.
            double salario = 1275.33;

            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal; // é utilizado um cast para transformar o numero normal em short,
            // pois pode haver um caso em que pelo tamanho o numero não seja comportado dentro de um short.
    }
}
