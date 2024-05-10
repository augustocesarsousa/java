package com.acsousa.javacourse._03_OrientacaoObjeto._10_Sobrecarga;

public class Soma {

  /*
    Na programação Java, a sobrecarga de método é um recurso da Orientação a Objetos que permite definir vários
    métodos com o mesmo nome dentro da mesma classe, desde que cada um possua uma assinatura distinta.
   */

  // Método calcular(int, int)
  static int calcular(int numero1, int numero2) {
    return numero1 + numero2;
  }

  // Método calcular(double, double)
  static double calcular(double numero1, double numero2) {
    return numero1 + numero2;
  }

  // Método calcular(int, int, int)
  static int calcular(int numero1, int numero2, int numero3) {
    return numero1 + numero2 + numero3;
  }
}
