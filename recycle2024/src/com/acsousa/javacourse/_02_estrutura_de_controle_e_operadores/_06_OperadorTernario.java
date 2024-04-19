package com.acsousa.javacourse._02_estrutura_de_controle_e_operadores;

public class _06_OperadorTernario {

  public static void main(String[] args) {

    /*
      Podemos fazer operações que fazem apenas duas comparações utilizando o operador ternário
     */

    // Declaração de variáveis para teste
    boolean contaInvestimento = true;
    double valorInvestido = 12345.0;
    double taxaDeLucro;
    double lucroInvestimento;

    // Operador ternário
    taxaDeLucro = contaInvestimento ? 0.12 : 0.05;

    lucroInvestimento = valorInvestido * taxaDeLucro;

    System.out.printf("Valor investido = R$ %.2f %n", valorInvestido);
    System.out.printf("Lucro do investimento = R$ %.2f %n", lucroInvestimento);
    System.out.printf("Saldo do investimento = R$ %.2f %n", (valorInvestido + lucroInvestimento));
  }
}
