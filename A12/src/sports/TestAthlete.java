package sports;

import java.util.ArrayList;
import java.util.Collections;

public class TestAthlete {
    public static void main(String[] args) {
        ArrayList<Athlete> a = new ArrayList<>();

        a.add(new Athlete("Maciej", "Skok w dal", 2011));
        a.add(new Athlete("Michał", "Rzut oszczepem", 2010));
        a.add(new Athlete("Aleksandra", "Rzut dyskiem", 2005));
        a.add(new Athlete("Marcin", "Koszykówka", 2012));

        Collections.sort(a);

        System.out.println(a);
    }
}
