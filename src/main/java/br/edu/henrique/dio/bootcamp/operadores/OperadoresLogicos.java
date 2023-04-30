package br.edu.henrique.dio.bootcamp.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        //Operador logico E
        if(condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condicoes sao verdadeiras");
        }

        //Operador logico OU
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes é verdadeira");
        }
        System.out.println("Fim");
    }
}
