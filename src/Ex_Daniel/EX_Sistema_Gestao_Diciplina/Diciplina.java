package Ex_Daniel.EX_Sistema_Gestao_Diciplina;

import java.util.ArrayList;

public class Diciplina {
     int id;
     public String nome;
    public String professor;
    ArrayList<Aluno> alunos;
    ArrayList<Avaliacao> avaliacoes;
    public Diciplina() {
        alunos = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    void matricularAluno(Aluno a){
        alunos.add(a);
    }
    void criarAvaliacao(int id, String nome){
        Avaliacao a = new Avaliacao(id, nome);
        avaliacoes.add(a);
    }

    @Override
    public String toString() {
        return "Diciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=" + alunos +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
