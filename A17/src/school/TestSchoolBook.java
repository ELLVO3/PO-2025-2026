package school;

import java.util.ArrayList;
import java.util.Collections;

public class TestSchoolBook {
    public static void main(String[] args) {
        ArrayList<SchoolBook> books = new ArrayList<>();

        books.add(new SchoolBook("Matematyka", "Nowak", 4.5f));        // 10 liter
        books.add(new SchoolBook("ABC", "Kowalski", 3.0f));            // 3 litery
        books.add(new SchoolBook("Historia Polski", "Iksiński", 5.0f)); // 15 liter
        books.add(new SchoolBook("Fizyka", "Wiśniewski", 4.0f));

        System.out.println("Przed sortowaniem: ");
        for(SchoolBook b : books){
            System.out.println(b);
        }

        Collections.sort(books);

        System.out.println("Po sortowaniu: ");
        for(SchoolBook b : books){
            System.out.println(b);
        }
    }
}
