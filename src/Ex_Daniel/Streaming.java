package Ex_Daniel;

public class Streaming {

    String usuario;
    String plano;
    float mensalidade;
    boolean ativo;
    String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano){

        this.usuario = usuario;
        this.plano = plano;

        if(plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }
        else if(plano.equals("Premium")){
            this.mensalidade = 45.90f;
        }
        else if(plano.equals("Família")){
            this.mensalidade = 60.90f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme){

        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }else{
            System.out.println("Conta suspensa. Pague a fatura.");
        }

    }

    public void cancelarAssinatura(){
        this.ativo = false;
    }

    public String toString(){

        String status;

        if(ativo){
            status = "Ativo";
        }else{
            status = "Suspenso";
        }

        return "\nUsuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme: " + ultimoFilmeAssistido + "\n";
    }
}