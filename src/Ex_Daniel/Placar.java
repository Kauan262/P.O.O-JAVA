package Ex_Daniel;

public class Placar {

    String nomeTimeCasa;
    String nomeTimeVisitante;

    int pontosCasa;
    int pontosVisitante;

    int periodoQuarto;

    public Placar(String casa, String visitante){

        this.nomeTimeCasa = casa;
        this.nomeTimeVisitante = visitante;

        this.pontosCasa = 0;
        this.pontosVisitante = 0;

        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){

        if(time.equals("casa")){
            pontosCasa += tipo;
        }
        else if(time.equals("visitante")){
            pontosVisitante += tipo;
        }

    }

    public void proximoQuarto(){

        if(periodoQuarto < 4){
            periodoQuarto++;
        }
        else{
            System.out.println("O jogo terminou.");
        }

    }

    public String toString(){

        return nomeTimeCasa + " [" + pontosCasa + "] x [" +
                pontosVisitante + "] " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;

    }
}
