package Desafio;

public class ProfessorAdjunto extends Professor{

    public ProfessorAdjunto(String nome, String sobrenome, int tempoCasa, int codProfessor, int quantidadeHorasMonitoria) {
        super(nome, sobrenome, tempoCasa, codProfessor);
        this.quantidadeHorasMonitoria = quantidadeHorasMonitoria;
    }

    public ProfessorAdjunto(int quantidadeHorasMonitoria) {
        this.quantidadeHorasMonitoria = quantidadeHorasMonitoria;
    }

    private int quantidadeHorasMonitoria;

    public int getQuantidadeHorasMonitoria() {
        return quantidadeHorasMonitoria;
    }

    public void setQuantidadeHorasMonitoria(int quantidadeHorasMonitoria) {
        this.quantidadeHorasMonitoria = quantidadeHorasMonitoria;
    }
}
