package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private int codCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private List<Aluno> listaAlunosMatriculados;
    private int quantidadeMaxAlunos;

    public Curso(){};

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (listaAlunosMatriculados.size() <= quantidadeMaxAlunos) {
            listaAlunosMatriculados.add(umAluno);
            return true;
        } else {
            System.out.println("Não há vagas para novos alubos");
            return false;
        }

    }
    public void excluirAluno(Aluno umAluno){
        listaAlunosMatriculados.remove(umAluno);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    public int getQuantidadeMaxAlunos() {
        return quantidadeMaxAlunos;
    }

    public void setQuantidadeMaxAlunos(int quantidadeMaxAlunos) {
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }
}
