package Obj_Carro;

public class Carro{
    //variaveis
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    //metodo da classe
    //converte o objeto em string

        public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;

        }
        public void Ligar() {
            if (!this.motor) {
                this.motor = true;
                System.out.println("Ligar carro");
            }
        }
        public void Desligar(){
            if (this.motor){
                this.motor = false;
                System.out.println("Desligar carro");
            }
        }
        public String toString(){
            return "Marca: " + this.marca + " Modelo: " + this.modelo + " Velocidade: " + this.velocidade +
                    " Motor: " + ( this.motor ? " Ligado" : "Desligado");
        }
}