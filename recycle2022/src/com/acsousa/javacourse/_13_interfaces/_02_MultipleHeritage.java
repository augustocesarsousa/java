package com.acsousa.javacourse._13_interfaces;

import com.acsousa.javacourse._13_interfaces.entities.ComboDevice;
import com.acsousa.javacourse._13_interfaces.entities.ConcretePrinter;
import com.acsousa.javacourse._13_interfaces.entities.ConcreteScanner;

/**
 * MultipleHeritage
 */
public class _02_MultipleHeritage {

  public static void main(String[] args) {

    ConcretePrinter concretePrinter = new ConcretePrinter("1080");
    concretePrinter.processDoc("My Letter");
    concretePrinter.print("My Letter");

    System.out.println();
    ConcreteScanner concreteScanner = new ConcreteScanner("2003");
    concreteScanner.processDoc("My Email");
    System.out.println("Scan result: " + concreteScanner.scan());

    System.out.println();
    ComboDevice comboDevice = new ComboDevice("2081");
    comboDevice.processDoc("My dissertation");
    comboDevice.print("My dissertation");
    System.out.println("Scan result: " + comboDevice.scan());
  }
}
