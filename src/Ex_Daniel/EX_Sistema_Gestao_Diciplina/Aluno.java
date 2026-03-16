package Ex_Daniel.EX_Sistema_Gestao_Diciplina;
public class Aluno{

    //atributos
    public int id;
    public String nome;
    public int ra;
    public String curso;

    public Aluno() {
    }

    public Aluno(int id, String nome, int ra, String curso) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ra=" + ra +
                ", curso='" + curso + '\'' +
                '}';
    }
}