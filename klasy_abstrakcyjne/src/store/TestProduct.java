package store;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = {
                new Book(),
                new Clothing(),
                new Book(),
                new Clothing(),
                new Book()
        };

        System.out.println("Cena produktów: ");

        for(Product p : products){
            System.out.println(p.getPrice());
        }
    }
}
