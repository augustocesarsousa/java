package com.acsousa.javacourse._01_Fundamentos;

public class _05_TiposPrimitivos {
  public static void main(String[] args) {

    /*
      O Java possui oito tipos de dados primitivos
      boolean, tem o tamanho de 1 bit, armazena os valores verdadeiro ou falso
      byte, tem o tamanho de 8 bits, armazena os valores entre -128 e 127
      short, tem o tamanho de 16 bits, armazena os valores entre -32.768 e 32.767
      int, tem o tamanho de 32 bits, armazena os valores entre -2.147.483.648 e 2.147.483.647
      long, tem o tamanho de 64 bits, armazena os valores entre -9.223.372.036.854.775.808 e 9,223,372,036,854,775,807
      float, tem o tamanho de 32 bits, armazena os valores de ponto flutuante entre ~1.4 x 10^-45 e ~3.4 x 10^38
      double, tem o tamanho de 32 bits, armazena os valores de ponto flutuante entre ~4.9 x 10^-324 e ~1.8 x 10^308
      char, representa um único caractere Unicode entre ‘\u0000’ (0) e ‘\uffff’ (65,535)
     */

    //Declarando as variáveis de teste
    boolean exemploBoolean = true;
    byte exemploByte = 127;
    short exemploShort = 32767;
    int exemploInt = 2147483647;
    long exemploLong = 9223372036854775807L;
    float exemploFloat = 10.32F;
    double exemploDouble = 25.3;
    char exemploChar = '\u21F6';

    System.out.println(exemploBoolean);
    System.out.println(exemploByte);
    System.out.println(exemploShort);
    System.out.println(exemploInt);
    System.out.println(exemploLong);
    System.out.println(exemploFloat);
    System.out.println(exemploDouble);
    System.out.println(exemploChar);

  }
}
