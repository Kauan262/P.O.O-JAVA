package Ex_Daniel.EX_Sistema_Gestao_Diciplina;

import java.util.ArrayList;

public class Avaliacao {
     int id;
    private String nome;
    public ArrayList<Questao> questao;

    public Avaliacao(int id, String nome){
        this.id = id;
        this.nome = nome;
        questao = new ArrayList<>();
    }
    public void adicionarQuestao(int num, String texto, float peso){
        Questao q = new Questao(num, texto, peso);
        questao.add(q);
    }
}
