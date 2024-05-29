package com.acsousa.javacourse._05_Arrays._06_ArrayDeObjetos;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    /*
      Podemos criar arrays de objetos em Java
     */

    Turma turma = new Turma();
    turma.nome = "Turma A";
    turma.professor = "Maria";
    turma.alunos = new Aluno[3];

    // Criando o objeto para atribuir ao array
    Aluno aluno1 = new Aluno();
    aluno1.nome = "João";
    aluno1.idade = 10;

    // Atribuindo o objeto na primeira posição do array
    turma.alunos[0] = aluno1;

    // Atribuindo objetos direto nas posições do array
    turma.alunos[1] = new Aluno();
    turma.alunos[1].nome = "Aline";
    turma.alunos[1].idade = 9;

    turma.alunos[2] = new Aluno();
    turma.alunos[2].nome = "Pedro";
    turma.alunos[2].idade = 10;

    // Exibindo os dados
    System.out.println("Turma: " + turma.nome);
    System.out.println("Professora: " + turma.professor);
    System.out.println("Alunos:");

    for(Aluno aluno : turma.alunos) {
      System.out.println(aluno.nome + ", " + aluno.idade + " anos");
    }
  }
}
