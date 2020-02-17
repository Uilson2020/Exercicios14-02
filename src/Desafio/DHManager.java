package Desafio;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class DHManager {
    private List<Aluno> listaAluno = new ArrayList();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Curso> listaMatricula = new ArrayList<>();

    public DHManager(List<Aluno> listaAluno, List<Professor> listaProfessor, List<Curso> listaCurso, List<Curso> listaMatricula) {
        this.listaAluno = listaAluno;
        this.listaProfessor = listaProfessor;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }

    public DHManager() { }

    public void registrarCurso(String nome, Integer codCurso, Integer qtMaxAlunos){
        int i = 0;
        Curso cursoDH = new Curso(nome, codCurso, qtMaxAlunos);
        for (Curso c1 : listaCurso) {
            if(c1.getCodCurso() == codCurso){
                i += 1;
            }
        }

        if(i == 0){
            listaCurso.add(cursoDH);
            System.out.println("Curso adicionado com sucesso!");
        }else{
            System.out.println("Não foi possível adicionar o curso");
        }
    }

    public void excluirCurso(Integer codCurso){
        try{
            for(Curso curso : listaCurso){
                if(curso.getCodCurso() == codCurso){
                    listaCurso.remove(curso);
                    System.out.println("O curso foi removido!");
                }else{
                    System.out.println("Não foi possível remover o curso desejado.");
                }
            }
        } catch (ConcurrentModificationException e) {}
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasMonitoria){
        ProfessorAdjunto profadj = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, horasMonitoria);
        listaProfessor.add(profadj);
        System.out.println("Professor " + profadj.getNomeProfessor() + " foi registrado.");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular proftit = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        listaProfessor.add(proftit);
        System.out.println("Professor " + proftit.getNomeProfessor() + "foi registrado");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (Professor professor : listaProfessor) {
            if (professor.getCodigoProfessor() == codigoProfessor) {
                listaProfessor.remove(professor);
                System.out.println("Professor excluido da lista!");
            }
        }
    }




    public void matricularAluno(String nome, String sobrenome,Integer codAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        listaAluno.add(aluno);
        System.out.println("Aluno " + aluno + " criado!");
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        for (Curso curso : listaCurso) {
            if (curso.getCodCurso() == codigoCurso) {
                for (Professor professor : listaProfessor) {

                    if (professor.getCodigoProfessor() == codigoProfessorAdjunto) {
                        curso.setProfessorAdjunto(professor);
                        System.out.println("Professor " + professor.getNomeProfessor() +" Adicionado!");
                    }
                    else if (professor.getCodigoProfessor() == codigoProfessorTitular) {
                        curso.setProfessorTitular(professor);
                        System.out.println("Professor Adicionado!");
                    }
                }
            }
        }
    }


    public List<Aluno> getListaAluno() { return listaAluno; }
    public void setListaAluno(List<Aluno> listaAluno) { this.listaAluno = listaAluno; }
    public List<Professor> getListaProfessor() { return listaProfessor; }
    public void setListaProfessor(List<Professor> listaProfessor) { this.listaProfessor = listaProfessor; }
    public List<Curso> getListaCurso() { return listaCurso; }
    public void setListaCurso(List<Curso> listaCurso) { this.listaCurso = listaCurso; }
    public List<Curso> getListaMatricula() { return listaMatricula; }
    public void setListaMatricula(List<Curso> listaMatricula) { this.listaMatricula = listaMatricula; }
}

