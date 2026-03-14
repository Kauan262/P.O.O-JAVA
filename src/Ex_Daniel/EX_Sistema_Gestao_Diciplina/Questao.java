package EX_Sistema_Gestao_Diciplina;
public class Questao{
    //atributos
    public int numero;
    public String enunciado;
    public float valor;

    public Questao() {
    }

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public float getValor() {
        return valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Questao{" +
                "numero=" + numero +
                ", enunciado='" + enunciado + '\'' +
                ", valor=" + valor +
                '}';
    }
}