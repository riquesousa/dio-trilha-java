package br.edu.henrique.dio.bootcamp.poo.estrutura;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor aqui

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){

        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //metodo do total para encher o tanque

    double valorTotalTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
