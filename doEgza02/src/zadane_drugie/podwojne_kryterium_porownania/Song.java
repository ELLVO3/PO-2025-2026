package zadane_drugie.podwojne_kryterium_porownania;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        int durationResult = Integer.compare(this.duration, o.duration);

        if(durationResult != 0){
            return durationResult;
        }
        return o.title.compareTo(this.title);
    }
}
