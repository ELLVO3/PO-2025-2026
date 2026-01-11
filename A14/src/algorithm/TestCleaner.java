package algorithm;

import java.util.ArrayList;

public class TestCleaner {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);

        int treshold = 5;

        System.out.println(l);

        Cleaner.clearIfContains(l, treshold);

        System.out.println(l);

        System.out.println();

        Cleaner.clearIfContains(l, 2);

        System.out.println(l);

        Cleaner.clearIfContains(null, 1);
    }
}
