package br.edu.henrique.dio.bootcamp.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual ao numero2? " + simNao);

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do numero 2? " + simNao);

        String nome1 = "Henrique";
        String nome2 = "Henrique";
        String nome3 = new String("Henrique");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome3)); // quando for objeto devemos usar o equals, que é utilizado para comparar conteudos.
    }
}
