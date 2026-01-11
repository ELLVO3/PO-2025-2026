package algorithm;

import java.util.ArrayList;

public class TestCleaner {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("Lista przed czyszczeniem: " + a);
        Cleaner.clearIfContains(a, 1);
        System.out.println("Lista po czyszczeniu: " + a);

        ArrayList<Integer> b = new ArrayList<>();

        b.add(1);
        b.add(2);

        System.out.println("Lista przed czyszczeniem: " + b);
        Cleaner.clearIfContains(b, 5);
        System.out.println("Lista po czyszczeniu: " + b);

        try {
            Cleaner.clearIfContains(null, 1);
            System.out.println("Sukces.");
        }
        catch (Exception e){
            System.out.println("Błąd." + e.getMessage());
        }

        Cleaner.clearIfContains(null, 1);
    }
}
