package _14_genericsSepMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import _14_genericsSepMap.entities.Product;
import _14_genericsSepMap.services.CalculationService;

/**
 * _02_DelimitedGeneric
 */
public class _02_DelimitedGeneric {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "/home/augusto/Documents/products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(";");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}