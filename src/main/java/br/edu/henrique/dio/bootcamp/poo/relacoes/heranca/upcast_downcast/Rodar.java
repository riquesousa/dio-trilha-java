package br.edu.henrique.dio.bootcamp.poo.relacoes.heranca.upcast_downcast;

public class Rodar {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //downcast, nao e muito utilizado por dar diversos erros na execucao, utilizado mais quando se utliza object
        //o primeiro exemplo ocorre erro pois nao foi deixado explicito a que tipo queremos transformar o funcionario
        // Gerente gerente1 = new Funcionario();
        //nesse segundo exemplo ocorre erro de classcast, pois nem tudo que tem na classe vendedor necessariamente existe
        //na classe funcionario
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
