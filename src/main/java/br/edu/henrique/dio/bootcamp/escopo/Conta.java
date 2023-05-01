package br.edu.henrique.dio.bootcamp.escopo;

public class Conta {

    //variavel da classe conta
    double saldo = 10.0;

    public void sacar(Double valor){
        //variavel local de metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //disponivel em toda a classe
        System.out.println(saldo);
        //somente o metodo sacar conhece essa variavel
//        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //variavel local de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0; //iniciando a variavel

        //funcao de controle de fluxo
        for(int x=1; x<=5; x++){ //x variavel de escopo
            //essa variavel sera reiniciada a cada execucao do for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        //escopo de fluxo
        // x e valorCalculado nunca estarão disponiveis fora do bloco do for
        return valorMontante;
    }
}
