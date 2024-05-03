package com.acsousa.javacourse._03_OrientacaoObjeto;

public class _03_ComposicaoDeObjetos {

  public static void main(String[] args) {

    // Instância do objeto
    _01_Carro carro = new _01_Carro();

    // Instância do objeto que compoe o carro
    _03_Pessoa proprietario = new _03_Pessoa();

    // Atribuindo valores ao objeto que compoe o carro
    proprietario.cpf = "12345678910";
    proprietario.nome = "Sushi Sousa";
    proprietario.telefone = "11912345678";

    // Atribuindo o objeto para a composição
    carro.proprietario = proprietario;

    // Imprimindo dados do proprietário do carro
    System.out.println("Dados do proprietário do carro:");
    System.out.println("");
    System.out.printf("CPF: %s%n", carro.proprietario.cpf);
    System.out.printf("Nome: %s%n", carro.proprietario.nome);
    System.out.printf("Telefone: %s%n", carro.proprietario.telefone);

  }
}
