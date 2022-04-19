package _15_functionsAndLambda.util;

import java.util.function.Function;

import _15_functionsAndLambda.entities.Product;

/**
 * UpperCaseName
 */
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }

}