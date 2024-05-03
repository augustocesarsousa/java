package com.acsousa.javacourse._03_OrientacaoObjeto;

public class _04_Metodo {

  public static void main(String[] args) {

    _04_Cachorro cachorro = new _04_Cachorro();

    cachorro.nome = "Caramelo";
    cachorro.raca = "Vira-lata";
    cachorro.idade = 2;

    // Chamada do método do objeto cachorro
    cachorro.latir();
  }
}
