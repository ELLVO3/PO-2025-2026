package arrayutils;

public class TestShifter {
    public static void main(String[] args) {
        Book[] books = {new Book("Rok 1984", "George Orwell", 1953),
        new Book("Potop", "Henryk Sienkiewicz", 1890),
        new Book("Dziady cz. II", "Adam Mickiweicz", 1892),
        new Book("???", "Unknown", 2026)};

        System.out.println("Przed użyciem Shiftera: ");
        for(Book b : books){
            System.out.println(b);
        }

        Shifter.shiftElementsRight(books);

        System.out.println("Po użyciu Shiftera: ");
        for(Book b : books){
            System.out.println(b);
        }
    }
}
