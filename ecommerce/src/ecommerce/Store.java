package ecommerce;

public class Store {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.source = 123;
        product1.description = "Notebook";
        product1.price = 2500.00;

        product2.source = 1234;
        product2.description = "Mouse";
        product2.price = 70.00;

        product3.source = 1235;
        product3.description = "Keyboard";
        product3.price = 120.00;

        product1.showAd();
        product2.showAd();
        product3.showAd();
    }
}
