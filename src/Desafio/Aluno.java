package Desafio;

import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int codAluno;

    public Aluno(String nome, String sobrenome, int codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codAluno == aluno.codAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAluno);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codAluno=" + codAluno +
                '}';
    }
}
