package Ex_Daniel;
public class Conta {

    // Atributos públicos
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    // Depositar
    public void depositar(float valor){

        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        }else{
            System.out.println("Conta encerrada. Depósito não permitido.");
        }

    }

    // Sacar
    public void sacar(float valor){

        if(!this.status){
            System.out.println("Conta inativa.");
        }
        else if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }

    }

    // Encerrar conta
    public void encerrarConta(){

        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        }else{
            System.out.println("Não é possível encerrar. Saque o saldo primeiro.");
        }

    }

    // toString
    public String toString(){

        String estado;

        if(status){
            estado = "Ativa";
        }else{
            estado = "Encerrada";
        }

        return "\nNúmero: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + saldo +
                "\nStatus: " + estado + "\n";
    }
}