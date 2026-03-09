public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

        public Conta(String nomeCliente, int agencia, int numeroConta){
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = 0;
            this.status = true;

        }

        public void depositar(float x){
            if (this.status) {
                this.saldo = saldo + x;
                System.out.println("Depósito concluido. " + x);
            }
            else{
                System.out.println("Falha na transação: Conta inativada.");
            }
        }

        public void sacar(float x){
            if(this.status && this.saldo >=x){
                this.saldo = this.saldo - x;
                System.out.println("Saque concluido. " + x);
            }
            else if(!this.status){
                System.out.println("Falha na transação: Conta inativada.");
            }
            else if (this.saldo < x){
                System.out.println("Falha na transação: Saldo insuficiente");
            }
        }
        public void encerrarConta(){
            if (this.saldo == 0){
                this.status = false;
                System.out.println("Conta exluida.");
            }
            else{
                System.out.println(" ERRO: Saldo na conta. Saque o valor antes de poder desativar a conta.");
            }
        }
        public String toString(){
           return "Numero da Conta: " + this.numeroConta + " Agencia: " + this.agencia + " Cliente: " + this.nomeCliente
                   + " Saldo atual: " + this.saldo + " Status da conta: " + this.status;
        }


}
