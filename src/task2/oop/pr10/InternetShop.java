package task2.oop.pr10;

public class InternetShop {
    public static void main(String[] args) {
        Product product = new Product("n", 5.0, 5.0);
        Product[] products = {product};
        Category category1 = new Category("m1", products);

        Basket basket = new Basket();
        basket.setBuyProducts(product);
        User user = new User("lolo", "lolo", basket);

        System.out.println(product);
        System.out.println(category1);
        System.out.println(user);
    }
}
