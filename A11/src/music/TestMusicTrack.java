package music;

public class TestMusicTrack {
    public static void main(String[] args) {
        MusicTrack m1 = new MusicTrack("Enjoy the Silence", "Depeche Mode", 4.17);
        MusicTrack m2 = new MusicTrack("Locket", "Crumb", 5.18);

        m1.printDetails();
        m2.printDetails();

        System.out.println(m1.isLongTrack());
        System.out.println(m2.isLongTrack());

    }
}
