package _15_functionsAndLambda.util;

import java.util.function.Consumer;

import _15_functionsAndLambda.entities.Product;

/**
 * PriceUpdate
 */
public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}