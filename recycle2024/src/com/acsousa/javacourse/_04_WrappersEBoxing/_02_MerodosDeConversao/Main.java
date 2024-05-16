package com.acsousa.javacourse._04_WrappersEBoxing._02_MerodosDeConversao;

public class Main {

  public static void main(String[] args) {

    /*
      Em Java, as classes wrapper fornecem métodos para converter entre tipos primitivos e seus objetos
      wrapper correspondentes. Esses métodos são essenciais para trabalhar com tipos primitivos de maneira
      mais flexível e robusta.
     */

    Double numeroWrapper = Math.random() * 100;

    // Conversão da classe Wrapper para primitivo
    double numeroPrimitivo = numeroWrapper.intValue();
    System.out.println(numeroPrimitivo);

    // Conversão de primitivo para classe Wrapper
    numeroWrapper = Double.valueOf(numeroPrimitivo);
    System.out.println(numeroWrapper);
  }
}
