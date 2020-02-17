package Desafio;

public class Professor {
    private String nomeProfessor;
    private String sobrenome;
    private Integer tempoCasa;
    private int codigoProfessor;

    public Professor(String nomeProfessor, String sobrenome, Integer tempoCasa, Integer codigoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public Professor(String nomeProfessor, String sobrenome, Integer tempoCasa) {
    }

    public String getNomeProfessor() { return nomeProfessor; }
    public void setNomeProfessor(String nomeProfessor) { this.nomeProfessor = nomeProfessor; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public Integer getTempoCasa() { return tempoCasa; }
    public void setTempoCasa(Integer tempoCasa) { this.tempoCasa = tempoCasa; }
    public int getCodigoProfessor() { return codigoProfessor; }
    public void setCodigoProfessor(int codigoProfessor) { this.codigoProfessor = codigoProfessor; }
}
