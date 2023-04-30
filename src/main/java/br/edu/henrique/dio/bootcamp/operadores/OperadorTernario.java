package br.edu.henrique.dio.bootcamp.operadores;

public class OperadorTernario {
    public static void main(String[] args) {

        int a,b;

        a = 5;
        b = 5;

//        String resultado = "";

        // Exemplo de condicoes usando if/else

//        if(a==b)
//            resultado = "verdadeiro";
//        else
//            resultado = "falso";

        // simplificando a operacao usando os operadores ? e : ao inves de utilizar if/else

        String resultado = a==b ?"Verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
