package ecommerce;

public class Product {
    private int source;
    private String description; //They're all attributes
    private double price;

    public Product(int source, String description, double price){
        //Constructor method
        //Has the same name as the class
        this.source = source;
        this.description = description;
        this.price = price;
    }

    public Product(int source, String description){
        //You can have different versions of the constructor method
        this.source = source;
        this.description = description;
        this.price = 0.00;
    }

    public Product(int source){
        this.source = source;
        this.description = "NÃO CADASTRADO";
        this.price = 0.00;
    }

    public int getSource(int source) {
        return source;
    }

    public void setSource(int source) {
        this.source /*attribute*/ = source /*parameter*/;
        //We use 'this' when there is a naming conflict
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void showAd() { //method
        System.out.println("----- PRODUCT ON OFFER -----");
        System.out.println(source + ": " + description);
        System.out.printf("R$ %.2f\n", price);
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