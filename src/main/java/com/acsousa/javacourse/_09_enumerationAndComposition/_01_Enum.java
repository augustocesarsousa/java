package com.acsousa.javacourse._09_enumerationAndComposition;

import java.util.Date;

import com.acsousa.javacourse._09_enumerationAndComposition.entities.Order;
import com.acsousa.javacourse._09_enumerationAndComposition.entities.enums.OrderStatus;

public class _01_Enum {

  public static void main(String[] args) {

    Order order = new Order(2022, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.PROCESSING;
    OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

    System.out.println(os1);
    System.out.println(os2);
  }

}
