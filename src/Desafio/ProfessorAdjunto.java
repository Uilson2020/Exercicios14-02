package Desafio;

public class ProfessorAdjunto extends Professor {
    private Integer horasMonitoria;

    public ProfessorAdjunto(String nomeProfessor, String sobrenome, Integer tempoCasa, Integer horasMonitoria) {
        super(nomeProfessor, sobrenome, tempoCasa);
        this.horasMonitoria = horasMonitoria;
    }

    public ProfessorAdjunto(String nomeProfessor, String sobrenome, Integer tempoCasa) {
        super(nomeProfessor, sobrenome, tempoCasa);
    }

    public Integer gethorasMonitoria(){ return horasMonitoria; }
    public void sethorasMonitoria(Integer horasMonitoria){ this.horasMonitoria = horasMonitoria; }
}
