package com.acsousa.javacourse._06_Memoria._01_ConsultandoMemoriaDaJVM;

public class Main {

  public static void main(String[] args) {

    /*
      Em Java podemos verificar o consumo de memória da JVM e do programa através da classe Runtime.getRuntime(),
      essa classe fornece métodos que auxiliam na verificação do consumo de mamória usada.
     */

    // imprimindo a memória usada ao iniciar o programa
    imprimirMemoria();

    // forçando o uso de mais memória (100MB)
    byte[] maisMemoria = new byte[500 * 1024 * 1024];

    // imprimindo a memória após a criação do array
    imprimirMemoria();
  }

  static void imprimirMemoria() {
    // o método maxMemory retorna a memória máxima que a JVM pode utilizar
    long memoriaMaxima = Runtime.getRuntime().maxMemory();
    System.out.printf("Máxima: %s%n", converterEmMegabytes(memoriaMaxima));

    // o método totalMemory retorna a memória que a JVM já reservou
    long memoriaReservada = Runtime.getRuntime().totalMemory();
    System.out.printf("Reservada: %s%n", converterEmMegabytes(memoriaReservada));

    // o método freeMemory retorna a memória disponível da memória que foi reservada
    long memoriaDisponivel = Runtime.getRuntime().freeMemory();
    System.out.printf("Disponível: %s%n", converterEmMegabytes(memoriaDisponivel));

    // o método freeMemory retorna a memória disponível da memória que foi reservada
    long memoriaUsada = memoriaReservada - memoriaDisponivel;
    System.out.printf("Usada: %s%n", converterEmMegabytes(memoriaUsada));

    System.out.println("-------");
  }

  static String converterEmMegabytes(long bytes) {
    return String.format("%.2fMB", bytes / 1024d / 1024d);
  }
}
