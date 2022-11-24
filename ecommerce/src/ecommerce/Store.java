package ecommerce;

public class Store {
    public static void main(String[] args) {
        Product product1 = new Product(123, "Notebook", 2500.00);
        Product product2 = new Product(1234,"Mouse", 70.00);
        Product product3 = new Product(1235, "Keyboard", 120.00);

        product1.showAd();
        product2.showAd();
        product3.showAd();

        System.out.println("Price simulation");
        product1.applyDiscount(10);
        product1.showAd();

        product2.setPrice(55.00);
        product2.showAd();

        product3.setPrice(99.90);
        product3.showAd();

        System.out.println("Discount Simulation " + product1.getDescription());
        System.out.printf("New price: R$ %.2f\n", product1.simulateDiscount(15));
        product1.showAd();
    }
}
