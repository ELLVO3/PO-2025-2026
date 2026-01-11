package music;

import java.util.ArrayList;

public class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();

        MusicStore m1 = new MusicStore("Empik", "Olsztyn", l);
        VinylStore v1 = new VinylStore("Winylnia", "Rastenburg", l, 250);

        m1.addAlbum("Metallica");
        m1.addAlbum("Bieber");
        m1.addAlbum("Happy");

        System.out.println(m1);
        System.out.println(v1);

        m1.removeAlbum("Bieber");

        System.out.println(m1);

        MusicStore m2 = new MusicStore("Empik", "Olsztyn", l);

        m2.addAlbum("Metallica");
        m2.addAlbum("Happy");

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));

        System.out.println(m1.hashCode() == m2.hashCode());
    }
}
