package ecommerce;


public class Product {
    int source;
    String description; //They're all attributes
    double price;

    void showAd() { //method
        System.out.println("----- PRODUCT ON OFFER -----");
        System.out.println(source + ": " + description);
        System.out.printf("R$ %.2f\n", price);
    }
}