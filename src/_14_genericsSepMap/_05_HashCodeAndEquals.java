package _14_genericsSepMap;

import _14_genericsSepMap.entities.Client;

/**
 * _05_HashCodeAndEquals
 */
public class _05_HashCodeAndEquals {

  public static void main(String[] args) {
    Client client = new Client("Sushi", "sushi@gmail.com");
    Client client2 = new Client("Sushi", "sushi2@gmail.com");

    System.out.println(client.hashCode());
    System.out.println(client2.hashCode());
    System.out.println(client.equals(client2));
  }
}
