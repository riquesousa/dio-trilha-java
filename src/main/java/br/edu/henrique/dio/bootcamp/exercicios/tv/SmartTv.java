package br.edu.henrique.dio.bootcamp.exercicios.tv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal escolhido: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void aumentarVolume(){
        // volume + 1
        volume++;
        System.out.println("Aumentando o volume da TV para: " + volume);
    }

    public void diminuirVolume(){
        // volume -1
        volume--;
        System.out.println("Diminuindo o volume da TV para: " + volume);
    }
}
