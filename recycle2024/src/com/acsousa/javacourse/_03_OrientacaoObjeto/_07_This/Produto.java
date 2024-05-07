package com.acsousa.javacourse._03_OrientacaoObjeto._07_This;

public class Produto {

  /*
    Utilizamos a palavra THIS em Java quando queremos referenciar os próprios atributos e métodos da class
   */

  // Atributos da classe
  double precoCusto;
  double precoVenda = 0;
  double porcentagemDeLucro;

  // Método para atribuir a porcentagem de lucro recebendo o valor por parâmetro
  void atribuirPorcentagemDeLucro(double porcentagemDeLucro) {

    // Pavalavra This que referencia o próprio atributo da classe
    this.porcentagemDeLucro = porcentagemDeLucro / 100 + 1;
  }

  void calcularPrecoVenda() {

    // palavra this referenciando os atributos da classe
    this.precoVenda = this.precoCusto * this.porcentagemDeLucro;
  }
}
