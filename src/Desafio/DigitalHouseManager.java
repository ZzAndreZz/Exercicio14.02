package Desafio;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

   private List<Aluno>listaAlunos;
   private List<Professor>listaProfessores;
   private List<Curso>listaCursos = new ArrayList<>();
   private List<Matricula>listaMatriculas;

   public void registrarCurso(String nome, Integer codigoCurso,Integer quantidadeMaximaDeAlunos,ProfessorTitular pfTitular,ProfessorAdjunto pfAdjunto){
      Curso curso = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos,pfTitular,pfAdjunto);
      this.listaCursos.add(curso);
   }

   public void excluirCurso(Integer codigoCurso){
      this.listaCursos.remove(codigoCurso);
   }

   public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
      ProfessorAdjunto pAdjunto = new ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras);
      this.listaCursos.add(pAdjunto);
   }
}
