package _15_functionsAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import _15_functionsAndLambda.entities.Product;

/**
 * _04_Function
 */
public class _04_Function {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 450.00));
        products.add(new Product("SSD", 120.00));
        products.add(new Product("Pendrive", 60.00));

        List<String> names;

        // names = products.stream().map(new
        // UpperCaseName()).collect(Collectors.toList());
        // names =
        // products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        // names =
        // products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // names = products.stream().map(func).collect(Collectors.toList());

        names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}