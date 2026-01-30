package zadane_drugie.rekord_i_komparator;

import java.util.Arrays;
import java.util.Collections;

public class TestDurationTitleComparator {
    static void main(String[] args) {

        Song[] songs = {new Song("Enjoy the Silence", "Depeche Mode", 250),
        new Song("Edge Of the Sword", "Dan Johansen", 225),
        new Song("Sonic Blaster", "F-777", 220),
        new Song("-RadioCutter-", "Waterflame", 236),
        new Song("Red Haze", "Creo", 244)};

        for(Song s : songs){
            System.out.println(s);
        }
        System.out.println();
        Arrays.sort(songs, new DurationTitleComparator());

        for(Song s: songs){
            System.out.println(s);
        }
    }
}
