package memory;

public class ProductTest {
    public static void main(String[] args) {
        Product p1;
        Product p2;

        p1 = new Product(123, "Notebook",1000.0);
        System.out.println(p1.show());

        p2 = new Product(456, "Mouse", 70.0);
        System.out.println(p2.show());
    }
}
