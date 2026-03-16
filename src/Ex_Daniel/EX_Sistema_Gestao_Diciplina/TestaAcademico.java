package Ex_Daniel.EX_Sistema_Gestao_Diciplina;

public class TestaAcademico {
    public static void main(String[] args){

        Aluno a1 = new Aluno(1, "Kauan", 12345, "ADS");
        Aluno a2 = new Aluno(2, "Daniel", 67890, "ADS");


        Diciplina d = new Diciplina();
        d.id = 1;
        d.nome = "Programação Orientada a Objetos";
        d.professor = "Carlos";


        d.matricularAluno(a1);
        d.matricularAluno(a2);


        d.criarAvaliacao(1, "Prova Semestral");

        d.avaliacoes.get(0).adicionarQuestao(1, "O que é POO?", 2.0f);
        d.avaliacoes.get(0).adicionarQuestao(2, "Explique encapsulamento.", 3.0f);
        d.avaliacoes.get(0).adicionarQuestao(3, "O que é herança?", 5.0f);


        System.out.println(d);

    }
}

