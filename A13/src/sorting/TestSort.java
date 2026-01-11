package sorting;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        Product[] products = {new Product("TV", 5600.00),
                            new Product("Laptop", 3500.00),
                            new Product("Myszka", 279.99),
                            new Product("Klawiatura", 350.00)};

        System.out.println("Przed sortowaniem: ");

        for(Product p : products){
            System.out.println(p);
        }

        Arrays.sort(products);

        System.out.println("Po sortowaniu: ");

        for(Product p : products){
            System.out.println(p);
        }
    }
}
