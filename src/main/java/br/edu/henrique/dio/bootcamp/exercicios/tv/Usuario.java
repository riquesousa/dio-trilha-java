package br.edu.henrique.dio.bootcamp.exercicios.tv;

public class Usuario {
    public static void main(String[] args) throws Exception {

        //Criando um novo objeto da classe smart tv
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? : " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(14);

    }
}
