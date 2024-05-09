package com.acsousa.javacourse._03_OrientacaoObjeto._09_Constante;

public class Visitante {

  /*
    Em Java, uma constante é um tipo especial de variável cujo valor não pode ser alterado após ser definido no código.
    Isso significa que, uma vez que você atribui um valor a uma constante, ele permanece o mesmo durante toda a
    execução do programa.
   */

  String nome;
  int idade;

  // Declaração da constante
  static final int IDADE_MINIMA = 18;

  boolean temAcesso() {
    return Visitante.IDADE_MINIMA < idade;
  }
}
