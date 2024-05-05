package com.acsousa.javacourse._03_OrientacaoObjeto._04_MetodoDoObjeto;

public class Main {

  public static void main(String[] args) {

    Cachorro cachorro = new Cachorro();

    cachorro.nome = "Caramelo";
    cachorro.raca = "Vira-lata";
    cachorro.idade = 2;

    // Chamada do método do objeto cachorro
    cachorro.latir();
  }
}
