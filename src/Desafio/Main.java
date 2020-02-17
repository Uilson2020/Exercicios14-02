package Desafio;

public class Main {
    public static void main (String[] args){
        System.out.println("=================================================================================================");
        System.out.println("\t===================================  Seja Bem Vindo!  ===================================\n");


        DHManager DH = new DHManager();
        Aluno alu = new Aluno ("Uill","Ribeiro",78);

        DH.registrarProfessorAdjunto("José", "Campos", 002, 0);
        DH.registrarProfessorTitular("Martin", "Garrix",001,"Python");
        DH.registrarCurso("Full Stack", 20001, 3);
        DH.registrarCurso("Android", 20002, 2);



    }
}
