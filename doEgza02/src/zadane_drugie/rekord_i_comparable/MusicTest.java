package zadane_drugie.rekord_i_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MusicTest {
    static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Enjoy the Silence1", "Depeche Mode1", 200));
        songs.add(new Song("Enjoy the Silence2", "Depeche Mode2", 220));
        songs.add(new Song("Enjoy the Silence3", "Depeche Mode3", 230));
        songs.add(new Song("Enjoy the Silence4", "Depeche Mode4", 250));
        songs.add(new Song("Enjoy the Silence5", "Depeche Mode5", 210));

        for(Song s: songs){
            System.out.println(s);
        }

        Collections.sort(songs);

        for(Song s: songs){
            System.out.println(s);
        }
    }
}
