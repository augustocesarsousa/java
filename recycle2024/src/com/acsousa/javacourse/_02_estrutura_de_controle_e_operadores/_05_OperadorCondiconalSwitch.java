package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _05_OperadorCondiconalSwitch {

  public static void main(String[] args) {

    /*
      Podemos utilizar o operador condicional switch quando queremos validar vários estados
      de uma variável
     */

    // Declarando variáveis para teste
    int diaDaSemana = (int) (Math.random() * 6);

    // Teste
    switch (diaDaSemana) {
      case 0:
        System.out.println("Domingo");
        break;
      case 1:
        System.out.println("Segunda-feira");
        break;
      case 2:
        System.out.println("Terça-feira");
        break;
      case 3:
        System.out.println("Quarta-feira");
        break;
      case 4:
        System.out.println("Quinta-feira");
        break;
      case 5:
        System.out.println("Sexta-feira");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia incorreto");
    }
  }
}
