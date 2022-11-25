package memory;

public class Product {
    private int source;
    private String name;
    private double price;

    public Product(int source, String name, double price) {
        this.source = source;
        this.name = name;
        this.price = price;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String show(){
        return source + " - " + name + " - R$ " + price;
    }
}