package com.acsousa.javacourse._03_OrientacaoObjeto._08_Static;

public class Calculadora {

  /*
    Em Java, a palavra-chave static é usada para declarar membros de classe que pertencem à classe como um
    todo, em vez de a uma instância específica da classe. Isso significa que os membros static são compartilhados
     por todas as instâncias da classe e podem ser acessados sem a necessidade de criar um objeto.
   */

  // Métodos estáticos
  static double soma(double numero1, double numero2) {
    return numero1 + numero2;
  }

  static double subtracao(double numero1, double numero2) {
    return numero1 - numero2;
  }

  static double multiplicacao(double numero1, double numero2) {
    return numero1 * numero2;
  }

  static double divisao(double numero1, double numero2) {
    return numero1 / numero2;
  }

}
