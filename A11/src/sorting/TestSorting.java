package sorting;

public class TestSorting {
    static void main(String[] args) {

        Product[] p1 = {new Product("Snickers", 6.00), new Product("Mleko", 4.50), new Product("Zgrzewka wody", 12.99)};

        Sorting.sortDescending(p1);

        for(Product p : p1){
            System.out.println(p);
        }
    }
}
