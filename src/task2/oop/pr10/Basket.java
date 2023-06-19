package task2.oop.pr10;

import java.util.Arrays;

public class Basket {
    private Product[] buyProducts;

    public Basket() {
    }

    public Basket(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Product[] getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(Product... buyProducts) {
        this.buyProducts = buyProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProducts=" + Arrays.toString(buyProducts) +
                '}';
    }
}
