package Desafio;

public class ProfessorTitular extends Professor {
    private String especialidade;


    public ProfessorTitular(String nomeProfessor, String sobrenome, Integer tempoCasa, String especialidade) {
        super(nomeProfessor, sobrenome, tempoCasa);
        this.especialidade = especialidade;
    }

   public String getEspecialidade(){ return especialidade; }
   public void setEspecialidade(String especialidade){ this.especialidade = especialidade; }
}
