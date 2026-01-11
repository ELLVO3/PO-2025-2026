package shopping;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> p = new ArrayList<>();

        p.add(new Product("Bułka", "Pieczywo", 0.99));
        p.add(new Product("Pepsi", "Napoje gazowane", 4.50));
        p.add(new Product("Długopis", "Akcesoria szkolne", 2.99));
        p.add(new Product("Piórnik", "Akcesoria szkolne", 9.99));

        System.out.println("Lista przed sortowaniem: " + p);

        Collections.sort(p);

        System.out.println("Lista po sortowaniu: " + p);

    }
}
