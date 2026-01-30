package zadane_drugie.zgodnosc_equals_hashcode_i_compareto;

import java.util.Collections;

public class TestSong {
    static void main(String[] args) {
        Song s1 = new Song("Enjoy the Silence", "Depeche Mode", 230);
        Song s2 = new Song("-RadioCutter-", "Waterflame", 236);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
