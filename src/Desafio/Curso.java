package Desafio;

import java.util.ArrayList;
import  java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private Integer codCurso;
    private Professor professorTitular;
    private Professor professorAdjunto;
    private int quantidadeMaxAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(String nomeCurso, Integer codCurso, Professor professorTitular, Professor professorAdjunto, int quantidadeMaxAlunos, List<Aluno> listaAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
        this.listaAlunos = listaAlunos;
    }

    public Curso(String nome, Integer codCurso, Integer qtMaxAlunos) {
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Curso curso = (Curso) obj;
        return codCurso == curso.codCurso;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nomeCurso + '\'' +
                ", codigoCurso=" + codCurso +
                ", professorAdjunto=" + professorAdjunto +
                ", professorTitular=" + professorTitular +
                ", quantidadeMaxAlunos=" + quantidadeMaxAlunos +
                ", listaAlunos=" + listaAlunos +
                '}';
    }


    // METODO
    public boolean adicionarUmAluno(Aluno umAluno){
        if(listaAlunos.size() < quantidadeMaxAlunos){
            listaAlunos.add(umAluno);
            return true;
        }else{
            return false;
        }
    }
    // METODO
    public void excluirAluno(Aluno umAluno){
        for (Aluno aluno : listaAlunos){
            if(aluno.equals(umAluno)){
                listaAlunos.remove(aluno);
                System.out.println("O aluno foi removido");
            }else{
                System.out.println("Não foi possível remover aluno.");
            }
        }
    }

    public String getNomeCurso() { return nomeCurso; }
    public void setNomeCurso(String nomeCurso) { this.nomeCurso = nomeCurso; }
    public Integer getCodCurso() { return codCurso; }
    public void setCodCurso(Integer codCurso) { this.codCurso = codCurso; }
    public Professor getProfessorTitular() { return professorTitular; }
    public void setProfessorTitular(Professor professorTitular) { this.professorTitular = professorTitular; }
    public Professor getProfessorAdjunto() { return professorAdjunto; }
    public void setProfessorAdjunto(Professor professorAdjunto) { this.professorAdjunto = professorAdjunto; }
    public int getQuantidadeMaxAlunos() { return quantidadeMaxAlunos; }
    public void setQuantidadeMaxAlunos(int quantidadeMaxAlunos) { this.quantidadeMaxAlunos = quantidadeMaxAlunos; }
    public List<Aluno> getListaAlunos() { return listaAlunos; }
    public void setListaAlunos(List<Aluno> listaAlunos) { this.listaAlunos = listaAlunos; }
}
