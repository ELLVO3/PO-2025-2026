package library;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 299);
        Book b2 = new Book("1984", "George Orwell", 653);

        b1.printDetails();
        b2.printDetails();

        System.out.println(b1.isLongBook());
        System.out.println(b2.isLongBook());
    }
}
