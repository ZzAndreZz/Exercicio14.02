import Desafio.*;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Caio","Pereira",2);
        ProfessorTitular professorTitular = new ProfessorTitular("Lucas","Josué",20,2,"Matematica");
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto("Manoel","Irineu",20,2,0);
        Curso curso = new Curso("André",2,30);
        System.out.println(professorAdjunto);
        System.out.println(professorTitular);
        System.out.println(curso);


    }
}
