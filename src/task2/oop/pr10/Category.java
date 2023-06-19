package task2.oop.pr10;

import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;

    public Category() {
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
