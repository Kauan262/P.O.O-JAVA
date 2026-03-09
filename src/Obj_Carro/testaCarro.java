package Obj_Carro;

public class testaCarro {
    public void main(String args[]){
        //cria uma instancia da classe carro - objeto
        Carro objt1 = new Carro("Fiat","uno");

        System.out.println(objt1.toString());
        objt1.Ligar();

        System.out.println(objt1.toString());
        objt1.Desligar();
        System.out.println(objt1.toString());






        Carro objt2 = new Carro( "BMW","WI2");


        objt2.Desligar();
        System.out.println(objt2.toString());
        objt2.Ligar();
        System.out.println(objt2.toString());

    }
}
