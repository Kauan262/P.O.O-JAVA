package Ex_Daniel.Classe_associacao;
//Objeto parte
public class Passageiro {
    public String CPF;
    public String Nome;


    public Passageiro() {
    }

    public Passageiro(String CPF, String nome) {
        this.CPF = CPF;
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "CPF='" + CPF + '\'' +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
