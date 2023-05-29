package br.edu.henrique.dio.bootcamp.poo.relacoes.heranca.polimorfismo_sobrescrita;

public class Rodando {
    public static void main(String[] args) {

        Mae[] classes = new Mae[]{new Filha1(), new Filha2(), new Mae()};

        //polimorfismo
        for (Mae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        //polimorfismo somente na classe filha2
        for (Mae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        //sobrescrita
        Filha2 filha2 = new Filha2();
        filha2.metodo2();
    }
}
