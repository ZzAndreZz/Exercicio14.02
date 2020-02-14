package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private int codCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;

    //,List<Aluno> listaAlunosMatriculados

    public Curso(String nome, int codCurso, int quantidadeMaxAlunos, ProfessorTitular ptitular, ProfessorAdjunto pajunto) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.professorTitular = ptitular;
        this.professorAdjunto = pajunto;
        this.listaAlunosMatriculados = listaAlunosMatriculados;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    public Curso(String nome, int codCurso, int quantidadeMaxAlunos) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    private List<Aluno> listaAlunosMatriculados;
    private int quantidadeMaxAlunos;




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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso == curso.codCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codCurso=" + codCurso +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", listaAlunosMatriculados=" + listaAlunosMatriculados +
                ", quantidadeMaxAlunos=" + quantidadeMaxAlunos +
                '}';
    }
}
