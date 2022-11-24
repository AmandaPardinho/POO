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

    void changePrice(double newPrice){
        price = newPrice;
    }

    void applyDiscount(double percent /*parameter*/){
        price = price - ((price * percent)/100);
    }

    double simulateDiscount(double percent){
        double priceSimulated;
        priceSimulated = price - ((price * percent)/100);
        return priceSimulated;
    }
}