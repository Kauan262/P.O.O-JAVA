import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemPedido> itemPedido;

    public Pedido() {
        this.itemPedido = new ArrayList<>(); //aloca espaço na memória para vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itemPedido = new ArrayList<>();
    }

    public void adicionaItemPedido(int id, int qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id,qtde,produto);
        this.itemPedido.add(aux);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n   " + cliente +
                '}' + "iten" + itemPedido;
    }
}

