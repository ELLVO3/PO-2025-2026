package zadanie_pierwsze.zadanie_z_polem_jako_arraylista;

import java.util.ArrayList;

public class TestCoffes {
    public static void main(String[] args) {
        ArrayList<String> notes1 = new ArrayList<>();
        notes1.add("Karmel");
        notes1.add("Orzech");

        ArrayList<String> notes2 = new ArrayList<>();
        notes2.add("Wanilia");
        notes2.add("Umami");

        CoffeBlend cb1 = new CoffeBlend("Orzel", "Polska", notes1);
        CoffeBlend cb2 = new CoffeBlend("Bland Vanilla", "Japonia", notes2);

        System.out.println(cb1);
        System.out.println(cb2);

        cb1.addFlavorNotes("Karmelowo-Orzechowy");
        cb2.addFlavorNotes("Umami");

        System.out.println(cb1);
        System.out.println(cb2);

        cb1.removeFlavorNotes("Karmelowo-Orzechowy");
        cb2.removeFlavorNotes("Umami");

        System.out.println(cb1);
        System.out.println(cb2);

        System.out.println(cb1.equals(cb2));
        System.out.println(cb1.hashCode());
        System.out.println(cb2.hashCode());

    }
}
