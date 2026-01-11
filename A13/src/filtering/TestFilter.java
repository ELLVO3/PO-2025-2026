package filtering;

import java.util.ArrayList;

public class TestFilter {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();

        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);

        int target = 2;

        System.out.println("Lista pierwotna: " + tab);
        System.out.println("Szukane większe od: " + target);

        ArrayList<Integer> filteredTab = Filter.filterGreaterThan(tab, target);

        System.out.println("Lista przefiltrowana: " + filteredTab);
    }
}
