import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemProduto> itemProduto;

    public Pedido() {
        this.itemProduto = new ArrayList<>(); //aloca espaço na memória para vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itemProduto = new ArrayList<>();
    }

    public void adicionaItemProduto(int id, int qtde, Produto produto){
        ItemProduto aux = new ItemProduto(id,qtde,produto);
        this.itemProduto.add(aux);
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
                '}' + "iten" + itemProduto;
    }
}

