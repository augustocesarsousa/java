package com.acsousa.javacourse._14_genericsSepMap;

import com.acsousa.javacourse._14_genericsSepMap.entities.Client;

public class _05_HashCodeAndEquals {

  public static void main(String[] args) {
    Client client = new Client("Sushi", "sushi@gmail.com");
    Client client2 = new Client("Sushi", "sushi2@gmail.com");

    System.out.println(client.hashCode());
    System.out.println(client2.hashCode());
    System.out.println(client.equals(client2));
  }
}
