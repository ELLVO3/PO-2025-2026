package zadane_drugie.rekord_i_comparable;

public record Song (String title, String artist, int duration) implements Comparable<Song> {
    @Override
    public int compareTo(Song o) {
        int durationResult = Integer.compare(this.duration, o.duration);

        if(durationResult != 0){
            return durationResult;
        }
        return o.title.compareTo(this.title);
    }
}
