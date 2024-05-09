package com.acsousa.javacourse._03_OrientacaoObjeto._09_Constante;

public class Main {

  public static void main(String[] args) {

    Visitante visitante = new Visitante();
    visitante.nome = "Sushi";
    visitante.idade = 20;

    if(visitante.temAcesso()) {
      System.out.println("Acesso liberado!");
    } else {
      System.out.printf("Acesso não permitido para menores de %d anos!%n", Visitante.IDADE_MINIMA);
    }
  }
}
