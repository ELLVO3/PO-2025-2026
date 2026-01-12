package arrayutils;

public class TestReverser {
    static void main(String[] args) {
        Book[] books = {new Book("Potop", "Henryk Sienkiewicz", 1890),
                new Book("Rok 1984", "George Orwell", 1953),
                new Book("Dziady cz. II", "Adam Mickiewicz", 1865)};

        System.out.println("Przed zamianą: ");
        for(Book b : books){
            System.out.println(b);
        }

        Reverser.reverseArray(books);

        System.out.println("Po zamianie: ");
        for(Book b : books){
            System.out.println(b);
        }
    }
}
