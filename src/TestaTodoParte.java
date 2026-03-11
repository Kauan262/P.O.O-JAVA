import java.util.Date;

public class TestaTodoParte   {
    public static void main(String[] args){
            //cliente é idependente do pedido
        Cliente cl1 = new Cliente(110, "Marquitos", "40028922", "Rua Beijamim Arrola");

        Pedido ped1 = new Pedido(1, new Date(), cl1);

        Produto prod1 = new Produto(55,"Mouse", "Acessório para computador", 55);

        ped1.adicionaItemPedido(55, 1, prod1);
        System.out.println(ped1.toString());

    }

}
