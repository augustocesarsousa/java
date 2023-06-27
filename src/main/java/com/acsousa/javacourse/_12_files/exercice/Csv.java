package com.acsousa.javacourse._12_files.exercice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.acsousa.javacourse._12_files.exercice.entities.Product;

/**
 * Csv
 */
public class Csv {

  public static void main(String[] args) {
    String[] product;
    List<Product> products = new ArrayList<>();

    try (
        BufferedReader bufferedReader = new BufferedReader(
            new FileReader("/home/augusto/Documents/products.csv"))) {
      String line = bufferedReader.readLine();

      while (line != null) {
        product = line.split(";");
        products.add(
            new Product(
                product[0],
                Double.parseDouble(product[1]),
                Integer.parseInt(product[2])));
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (
        BufferedWriter bufferedWriter = new BufferedWriter(
            new FileWriter("/home/augusto/Documents/products2.csv", true))) {
      for (Product prod : products) {
        bufferedWriter.write(prod.getName() + ";" + prod.totalValue());
        bufferedWriter.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
