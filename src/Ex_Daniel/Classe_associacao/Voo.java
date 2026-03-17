package Ex_Daniel.Classe_associacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    public int numero;
    public String agencia, origem, destino;
    public LocalDateTime data;

    public Voo() {
    }

    public Voo(int numero, String agencia, String origem, String destino, LocalDateTime data) {
        this.numero = numero;
        this.agencia = agencia;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // formatar a data no brasil
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm");
        return "Voo{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data.format(formatoBR) +
                '}';
    }
}
