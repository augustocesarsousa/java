package com.acsousa.javacourse._03_OrientacaoObjeto;

public class _02_InstanciadoObjeto {

  public static void main(String[] args) {

    // Criando uma variável do tipo carro
    _01_Carro carro;

    // Criando uma instência da variável carro
    carro = new _01_Carro();

    // Definindo valores para os atributos do carro
    carro.chassi = "1234567890";
    carro.fabricante = "VW";
    carro.modelo = "Fusca";
    carro.anoFabricacao = 1970;
    carro.versao = "1300";

    // Acessando e imprimindo os valores dos atributos do carro
    System.out.printf("Modelo = %S%n", carro.modelo);
    System.out.printf("Chassi = %S%n", carro.chassi);
    System.out.printf("Fabricante = %S%n", carro.fabricante);
    System.out.printf("Ano de fabricação = %S%n", carro.anoFabricacao);
    System.out.printf("Verão = %S%n", carro.versao);
  }
}
