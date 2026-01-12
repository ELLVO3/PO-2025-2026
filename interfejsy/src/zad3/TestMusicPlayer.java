package zad3;

public class TestMusicPlayer {
    public static void main(String[] args) {
        MusicPlayer mp = new Radio();

        mp.turnOn();
        mp.nextTrack();
        mp.turnOff();
    }
}
