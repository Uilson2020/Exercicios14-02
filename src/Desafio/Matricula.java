package Desafio;

import java.util.Date;

public class Matricula {
    private String aluno;
    private String curso;
    private Date dataMatricula;

    public Matricula(String aluno, String curso, Date dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = new Date();
    }

    public String getAluno() { return aluno; }
    public void setAluno(String aluno) { this.aluno = aluno; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public Date getDataMatricula() { return dataMatricula; }
    public void setDataMatricula(Date dataMatricula) { this.dataMatricula = dataMatricula; }
}
