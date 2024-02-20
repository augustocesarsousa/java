package com.acsousa.javacourse._07_vectorsAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _04_List {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();

    names.add("Sushi");
    names.add("Zeus");
    names.add("Nino");
    names.add("Babu");
    names.add("Cidu");
    names.add("Sasha");
    names.add("Bidu");
    names.add("Cacau");

    System.out.println("Original list:");
    System.out.println();

    for (String name : names) {
      System.out.println(name);
    }

    System.out.println();
    System.out.println("List size = " + names.size());

    System.out.println();
    System.out.println("Add Thor:");
    System.out.println();
    names.add(1, "Thor");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println();
    System.out.println("Remove Nino:");
    System.out.println();
    names.remove("Nino");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println();
    System.out.println("Remove with first letter 'B':");
    System.out.println();
    names.removeIf(x -> x.charAt(0) == 'B');
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println();
    System.out.println("Find index by name 'Thor' = " + names.indexOf("Thor"));

    System.out.println();
    System.out.println("Filter by first letter 'S':");
    System.out.println();
    List<String> namesFiltered = names.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
    for (String name : namesFiltered) {
      System.out.println(name);
    }

    System.out.println();
    System.out.println("Find first name with first letter 'C':");
    System.out.println();
    String nameC = names.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
    System.out.println(nameC);

    System.out.println();
    System.out.println("Find first name with first letter 'H':");
    System.out.println();
    String nameH = names.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
    System.out.println(nameH);

  }
}
