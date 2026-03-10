import java.util.Date;

public class TestaTodoParte   {
    public static void main(String[] args){
            //cliente é idependente do pedido
        Cliente cl1 = new Cliente(110, "Marquitos", "40028922", "Rua Beijamim Arrola");
        Pedido ped1 = new Pedido(1, new Date(), cl1);

        System.out.println(ped1.toString());

    }

}
