package Desafio;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codAluno;

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return codAluno == aluno.codAluno;
    }

}
